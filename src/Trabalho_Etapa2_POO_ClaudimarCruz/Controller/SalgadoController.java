package Trabalho_Etapa2_POO_ClaudimarCruz.Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;

import Trabalho_Etapa2_POO_ClaudimarCruz.Conexao.ConexaoBanco;
import Trabalho_Etapa2_POO_ClaudimarCruz.Model.LancheModel;
import Trabalho_Etapa2_POO_ClaudimarCruz.Model.PizzaDAO;
import Trabalho_Etapa2_POO_ClaudimarCruz.Model.SalgadinhoModel;
import Trabalho_Etapa2_POO_ClaudimarCruz.Model.SalgadoDAO;
import Trabalho_Etapa2_POO_ClaudimarCruz.View.TelaPedido;
import Trabalho_Etapa2_POO_ClaudimarCruz.View.TelaSalgado;



public class SalgadoController {
	static SimpleDateFormat formato = new SimpleDateFormat("dd/mm/yyyy");
	TelaSalgado telaSalgado;
	static List<SalgadinhoModel> listaSalgado = new ArrayList<SalgadinhoModel>();
	
	public SalgadoController() {
		super();
	}
	
	public List<SalgadinhoModel> getLista() {
        return listaSalgado;
    }
	
	public SalgadoController (TelaSalgado tela) {
		telaSalgado = tela;
		
		tela.setBotaoBehaviorSalgado(new BotaoBehaviorSalgado());
	}
	
	class BotaoBehaviorSalgado implements ActionListener{
		@SuppressWarnings("static-access")
		@Override
		
		public void actionPerformed(ActionEvent e) {
			
			SalgadinhoModel salgado = new SalgadinhoModel(); 
			
	    	Integer idLanche = null;
	    	try {
	    		idLanche = Integer.parseInt(telaSalgado.getID());
	    	}catch(Exception ex) {
	    		JOptionPane.showMessageDialog(null, " ERRO! - ID não numérico ");
	    	}
	    	
	    	String nomeLanche = telaSalgado.getNome();
	    	
	    	Double precoVenda = null;
	    	try {
	    		precoVenda = Double.parseDouble(telaSalgado.getValorVenda());
	    	}catch(Exception ex) {
	    		JOptionPane.showMessageDialog(null, " ERRO! - Conferir campo Preço de Venda ");
	    	}
	    	 
	    	
	    	Date dataValidade = null;
	    	try {
	    		dataValidade = formato.parse(telaSalgado.getData());
	    	}catch(Exception ex) {
	    		JOptionPane.showMessageDialog(null, " ERRO! - Data incorreta ");
	    	}
	    	
	    	Double peso = null;
	    	try {
	    		peso = Double.parseDouble(telaSalgado.getPeso()); 
	    	}catch(Exception ex) {
	    		JOptionPane.showMessageDialog(null, " ERRO! - Conferir campo Peso ");
	    	}
	    	
	    	String recheio = telaSalgado.getRecheio();
	    	
	    	String massa = telaSalgado.getMassa();
	    	
	    	String tipo = telaSalgado.getTipo();
	    	
	    
	        
	        if(nomeLanche.strip().length() > 0 && massa.strip().length() > 0
	        		&& recheio.strip().length() > 0 && tipo.strip().length() > 0) {
	        	salgado.setId(idLanche);
	        	salgado.setNome(nomeLanche);
	        	salgado.setPrecoVenda(precoVenda);
	        	salgado.setDataValidade(dataValidade);
	        	salgado.setPeso(peso);
	        	salgado.setRecheio(recheio);
	        	salgado.setMassa(massa);
	        	salgado.setTipo(tipo);
	        	
	        	if(existeSalgado(idLanche, nomeLanche)) {
	        		JOptionPane.showMessageDialog(null, "ID ou Nome já existentes");
	        	}else {
	        		
	        		if(idLanche instanceof Integer && dataValidade instanceof Date 
	        				&& precoVenda instanceof Double && peso instanceof Double 	) {
	        			listaSalgado.add(salgado);
	        			//TelaPedido.atualizarComboSalgado((ArrayList<SalgadinhoModel>)listaSalgado);
	        			JOptionPane.showMessageDialog(null, "Salgado cadastrado!");
	        			
	        			ConexaoBanco conexao = new ConexaoBanco();
	        			conexao.conectarBanco();
	        			SalgadoDAO salgDAO = new SalgadoDAO();
	        			
//	        			try {
//							salgDAO.selectCadastro();
//						} catch (SQLException e1) {
//							// TODO Auto-generated catch block
//							e1.printStackTrace();
//						}
//	        			
	        			try {
	        				salgDAO.insertCadastro(idLanche, nomeLanche, precoVenda, null, peso, recheio, massa, tipo);
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
	        			
	        			
	        			System.out.println("Salgados Cadastrados");
	       			 	System.out.println("");
	       				for (int i=0 ; i < listaSalgado.size(); i ++) {
	       					String d = formato.format(listaSalgado.get(i).getDataValidade());
	       					System.out.println("Id: " + listaSalgado.get(i).getId() + "  /  Nome: " + listaSalgado.get(i).getNome() + "  /  Preço venda: " + listaSalgado.get(i).getPrecoVenda()
	       						+ "  /  Data validade: " + d + "  /  Peso: " + listaSalgado.get(i).getPeso() + "  /  Recheio: " + listaSalgado.get(i).getRecheio() + 
	       						"  /  Massa: " + listaSalgado.get(i).getMassa() + "  /  Tipo: " + listaSalgado.get(i).getTipo() +"\n");
	       		       }
	       			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>");
	        		}
	        }
	        	
	       }else{
	        	
	        	JOptionPane.showMessageDialog(null, " ERRO! - Conferir campos ");
	        	
	       }
	     
	        }
	
	}
	
	public static SalgadinhoModel buscaSalgado(Integer id) {
		for(SalgadinhoModel sm: listaSalgado) {
			if(id.equals(sm.getId())){
				return sm;
			}
		}
		return null;
	}
	
	public static boolean existeSalgado(Integer id, String nome) {
		for (SalgadinhoModel lm : listaSalgado) {
			if(id.equals(lm.getId()) || nome.equals(lm.getNome())){
				return true;
			}
		}
		
		return false;
	}
	
	
}
