package trabalho_Etapa3_POO_ClaudimarCruz.Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;

import trabalho_Etapa3_POO_ClaudimarCruz.Conexao.ConexaoBanco;
import trabalho_Etapa3_POO_ClaudimarCruz.Model.ClienteDAO;
import trabalho_Etapa3_POO_ClaudimarCruz.Model.ClienteModel;
import trabalho_Etapa3_POO_ClaudimarCruz.View.TelaCliente;
import trabalho_Etapa3_POO_ClaudimarCruz.View.TelaPedido;

public class ClienteController {
	static SimpleDateFormat formato = new SimpleDateFormat("dd/mm/yyyy");
	TelaCliente telaCliente;
	static List<ClienteModel> listaCliente = new ArrayList<ClienteModel>();
	
	public ClienteController() {
		super();
	}
	
	public List<ClienteModel> getLista() {
        return listaCliente;
    }
	
	public ClienteController (TelaCliente tela) {
		telaCliente = tela;
		
		tela.setBotaoBehaviorCliente(new BotaoBehaviorCliente());
	}
	
	class BotaoBehaviorCliente implements ActionListener{
		@SuppressWarnings("static-access")
		@Override
		
		public void actionPerformed(ActionEvent e) {
			
			ClienteModel cliente = new ClienteModel(); 
			
	    	Integer codigo = null;
	    	try {
	    		codigo = Integer.parseInt(telaCliente.getCodigo());
	    	}catch(Exception ex) {
	    		JOptionPane.showMessageDialog(null, " ERRO! - ID não numérico ");
	    	}
	    	
	    	String nome = telaCliente.getNome();
	    	
	    	String cpf =telaCliente.getValorCpf();
	    	 
	    	String end = telaCliente.getEnd();
	    	
	    	List<String> tel= new ArrayList<String>();
	    	
	    	tel.add(telaCliente.getTel1());
	    	tel.add(telaCliente.getTel2());
	    	
	    	Date dataNasc = null;
	    	try {
	    		dataNasc = formato.parse(telaCliente.getNasc());
	    	}catch(Exception ex) {
	    		JOptionPane.showMessageDialog(null, " ERRO! - Data incorreta ");
	    	}
	    	
	        
	        if(nome.strip().length() > 0 && cpf.strip().length() > 0
	        		&& end.strip().length() > 0) {
	        	//System.out.println("nome: " + nomePizza);
	        	cliente.setCodigo(codigo);
	        	cliente.setNome(nome);
	        	cliente.setCpf(cpf);
	        	cliente.setEndereco(end);
	        	cliente.setTelefones(tel);
	        	cliente.setNasc(dataNasc);
	        	
	        	if(existeCliente(codigo, cpf)) {
	        		JOptionPane.showMessageDialog(null, "Código ou CPF já existentes");
	        	}else {
	        		
	        		//*****************************************************
	        		if(codigo instanceof Integer && dataNasc instanceof Date ) {
	        			listaCliente.add(cliente);
	        			TelaPedido.atualizarComboCliente((ArrayList<ClienteModel>)listaCliente);
	        			JOptionPane.showMessageDialog(null, "Cliente cadastrado!");
	        			
	        			ConexaoBanco conexao = new ConexaoBanco();
	        			conexao.conectarBanco();
	        			ClienteDAO clienteDAO = new ClienteDAO();
	        			
//	        			try {
//							clienteDAO.selectCadastro();
//						} catch (SQLException e1) {
//							// TODO Auto-generated catch block
//							e1.printStackTrace();
//						}
	        			
	        			java.sql.Date sqlDate = new java.sql.Date(dataNasc.getTime());

//	        			
	        			try {
	        				clienteDAO.insertCadastro(codigo, nome, cpf, end, tel, sqlDate);
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
	        			
	        			
	        			 System.out.println("Clientes Cadastrados");
	        			 System.out.println("");
	        				for (int i=0 ; i < listaCliente.size(); i ++) {
	        					String d = formato.format(listaCliente.get(i).getNasc());
	        					System.out.println("Código: " + listaCliente.get(i).getCodigo() + "  /  Nome: " + listaCliente.get(i).getNome() + "  /  CPF: " + listaCliente.get(i).getCpf()
	        						+ "  /  Endereço: " + listaCliente.get(i).getEndereco() + "  /  Telefone(s): " + listaCliente.get(i).getTelefones() + "  /  Data Nascimento: " + d + "\n");
	        		       }
	        			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>");
	        		}
	        }
	        	
		
	       }else{
	        	
	        	JOptionPane.showMessageDialog(null, " ERRO! - Conferir campos ");
	        	
	       }
	        
	       
	     
	   }
	
	}
	
	public static ClienteModel buscaCliente(Integer codigo) {
		for(ClienteModel cm: listaCliente) {
			if(codigo.equals(cm.getCodigo())){
				return cm;
			}
		}
		return null;
	}
	
	public static boolean existeCliente(Integer codigo, String cpf) {
		for (ClienteModel cm: listaCliente) {
			if(codigo.equals(cm.getCodigo()) || cpf.equals(cm.getCpf())){
				return true;
			}
		}
		
		return false;
	}
	
	
}