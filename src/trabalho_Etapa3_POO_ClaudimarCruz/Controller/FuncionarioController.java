package trabalho_Etapa3_POO_ClaudimarCruz.Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import trabalho_Etapa3_POO_ClaudimarCruz.Conexao.ConexaoBanco;
import trabalho_Etapa3_POO_ClaudimarCruz.Model.FuncionarioDAO;
import trabalho_Etapa3_POO_ClaudimarCruz.Model.FuncionarioModel;
import trabalho_Etapa3_POO_ClaudimarCruz.View.TelaFuncionario;
import trabalho_Etapa3_POO_ClaudimarCruz.View.TelaPedido;

public class FuncionarioController {
	static SimpleDateFormat formato = new SimpleDateFormat("dd/mm/yyyy");
	TelaFuncionario telaFunc;
	static List<FuncionarioModel> listaFuncionario = new ArrayList<FuncionarioModel>();
	
	
	public FuncionarioController() {
		super();
	}
	
	public List<FuncionarioModel> getLista() {
        return listaFuncionario;
    }
	
	public FuncionarioController (TelaFuncionario tela) {
		telaFunc = tela;
		
		tela.setBotaoBehaviorFunc(new BotaoBehaviorFunc());
	}
	
	class BotaoBehaviorFunc implements ActionListener{
		@SuppressWarnings("static-access")
		@Override
		
		public void actionPerformed(ActionEvent e) {
			
			FuncionarioModel func = new FuncionarioModel(); 
			
	    	Integer codigo = null;
	    	try {
	    		codigo = Integer.parseInt(telaFunc.getCodigo());
	    	}catch(Exception ex) {
	    		JOptionPane.showMessageDialog(null, " ERRO! - ID não numérico ");
	    	}
	    	
	    	String nome = telaFunc.getNome();
	    	
	    	String cpf = telaFunc.getValorCpf();
	    	 
	    	String end = telaFunc.getEnd();
	    	
	    	List<String> tel= new ArrayList<String>();
	    	
	    	tel.add(telaFunc.getTel1());
	    	tel.add(telaFunc.getTel2());
	    	
	    	Float salario = null;
	    	try {
	    		salario = Float.parseFloat(telaFunc.getSalario());
	    	}catch(Exception ex) {
	    		JOptionPane.showMessageDialog(null, " ERRO! - Conferir campo Salário");
	    	}
	    	 
	    	
	    	String cargo = telaFunc.getCargo();
	        
	        if(nome.strip().length() > 0 && cpf.strip().length() > 0
	        		&& end.strip().length() > 0 && cargo.strip().length() > 0) {
	        	
	        	func.setCodigo(codigo);
	        	func.setNome(nome);
	        	func.setCpf(cpf);
	        	func.setEndereco(end);
	        	func.setTelefones(tel);
	        	func.setSalario(salario);
	        	func.setCargo(cargo);
	        	
	        	if(existeFunc(codigo, cpf)) {
	        		JOptionPane.showMessageDialog(null, "Código ou CPF já existentes");
	        	}else {
	        		
	        		//*****************************************************
	        		if(codigo instanceof Integer && salario instanceof Float) {
	        			listaFuncionario.add(func);
	        			TelaPedido.atualizarComboFunc((ArrayList<FuncionarioModel>)listaFuncionario);
	        			JOptionPane.showMessageDialog(null, "Funcionário cadastrado!");
	        			
	        			ConexaoBanco conexao = new ConexaoBanco();
	        			conexao.conectarBanco();
	        			FuncionarioDAO funcDAO = new FuncionarioDAO();
	        			
//	        			try {
//							funcDAO.selectCadastro();
//						} catch (SQLException e1) {
//							// TODO Auto-generated catch block
//							e1.printStackTrace();
//						}
//	        			
	        			try {
	        				funcDAO.insertCadastro(codigo, nome, cpf, end, tel, salario, cargo);
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
	        			
	        			System.out.println("Funcionários Cadastrados");
	        			 System.out.println("");
	        				for (int i=0 ; i < listaFuncionario.size(); i ++) {
	        					System.out.println("Código: " + listaFuncionario.get(i).getCodigo() + "  /  Nome: " +listaFuncionario.get(i).getNome() + "  /  CPF: " + listaFuncionario.get(i).getCpf()
	        						+ "  /  Endereço: " + listaFuncionario.get(i).getEndereco() + "  /  Telefone(s): " + listaFuncionario.get(i).getTelefones() 
	        						+ "  /  Salário: " + listaFuncionario.get(i).getSalario() + "  /  Cargo: " + listaFuncionario.get(i).getCargo() + "\n");
	        		       }
	        			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>");
	        		}
	        }
	        	
		
	       }else{
	        	
	        	JOptionPane.showMessageDialog(null, " ERRO! - Conferir campos ");
	        	
	       }
	     
	        }
	
	}
	
	public static FuncionarioModel buscaFunc(Integer codigo) {
		for(FuncionarioModel fm: listaFuncionario) {
			if(codigo.equals(fm.getCodigo())){
				return fm;
			}
		}
		return null;
	}
	
	public static boolean existeFunc(Integer codigo, String cpf) {
		for (FuncionarioModel lm : listaFuncionario) {
			if(codigo.equals(lm.getCodigo()) || cpf.equals(lm.getCpf())){
				return true;
			}
		}
		
		return false;
	}
	
	
}