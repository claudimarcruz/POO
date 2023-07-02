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
import Trabalho_Etapa2_POO_ClaudimarCruz.Model.PizzaDAO;
import Trabalho_Etapa2_POO_ClaudimarCruz.Model.PizzaModel;
import Trabalho_Etapa2_POO_ClaudimarCruz.View.TelaPizza;



public class PizzaController {
	static SimpleDateFormat formato = new SimpleDateFormat("dd/mm/yyyy");
	TelaPizza telaPizza;
	static List<PizzaModel> listaPizza = new ArrayList<PizzaModel>();
	
	public PizzaController() {
		super();
	}
	
	public List<PizzaModel> getLista() {
        return listaPizza;
    }
	
	public PizzaController (TelaPizza tela) {
		telaPizza = tela;
		
		tela.setBotaoBehaviorPizza(new BotaoBehaviorPizza());
	}
	
	class BotaoBehaviorPizza implements ActionListener{
		@SuppressWarnings("static-access")
		@Override
		
		public void actionPerformed(ActionEvent e) {
			
			PizzaModel pizza = new PizzaModel(); 
			
	    	Integer idPizza = null;
	    	try {
	    		idPizza = Integer.parseInt(telaPizza.getID());
	    	}catch(Exception ex) {
	    		JOptionPane.showMessageDialog(null, " ERRO! - ID não numérico ");
	    	}
	    	
	    	String nomePizza = telaPizza.getNome();
	    	
	    	Double precoVenda = null;
	    	try {
	    		precoVenda = Double.parseDouble(telaPizza.getValorVenda());
	    	}catch(Exception ex) {
	    		JOptionPane.showMessageDialog(null, " ERRO! - Conferir campo Preço de Venda ");
	    	}
	    	 
	    	
	    	Date dataValidade = null;
	    	try {
	    		dataValidade = formato.parse(telaPizza.getData());
	    	}catch(Exception ex) {
	    		JOptionPane.showMessageDialog(null, " ERRO! - Data incorreta ");
	    	}
	    	
	    	Double peso = null;
	    	try {
	    		peso = Double.parseDouble(telaPizza.getPeso()); 
	    	}catch(Exception ex) {
	    		JOptionPane.showMessageDialog(null, " ERRO! - Conferir campo Peso ");
	    	}
	    	
	    	String molho = telaPizza.getMolho();
	    	//String recheio = telaPizza.getRecheio();
	    	String borda = telaPizza.getBorda();
	    	
	    	String recheio1 = telaPizza.getRecheio1();
	    	String recheio2 = telaPizza.getRecheio2();
	    	
	    	
	        
	        if(nomePizza.strip().length() > 0) {
	        	//System.out.println("nome: " + nomePizza);
	        	pizza.setId(idPizza);
	        	pizza.setNome(nomePizza);
	        	pizza.setPrecoVenda(precoVenda);
	        	pizza.setDataValidade(dataValidade);
	        	pizza.setPeso(peso);
	        	pizza.setMolho(molho);
	        	pizza.setRecheio1(recheio1);
	        	pizza.setRecheio2(recheio2);
	        	pizza.setBorda(borda);
	        	if(existePizza(idPizza, nomePizza)) {
	        		JOptionPane.showMessageDialog(null, "ID ou Nome já existentes");
	        	}else {
	        		
	        		//*****************************************************
	        		if(idPizza instanceof Integer && dataValidade instanceof Date
	        				&& precoVenda instanceof Double && peso instanceof Double ) {
	        			listaPizza.add(pizza);
			        //listarProprietarios(listaProprietario);
	        			//System.out.println("nome: " + nomePizza);
		        	JOptionPane.showMessageDialog(null, "Pizza cadastrada!");
		        	
		        	ConexaoBanco conexao = new ConexaoBanco();
        			conexao.conectarBanco();
        			PizzaDAO pizzaDAO = new PizzaDAO();
        			
//        			try {
//						pizzaDAO.selectCadastro();
//					} catch (SQLException e1) {
//						// TODO Auto-generated catch block
//						e1.printStackTrace();
//					}
//        			
        			try {
        				pizzaDAO.insertCadastro(idPizza, nomePizza, precoVenda, null, peso, molho, recheio1, borda);
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
        			
		        	
		        	
		        	
		        	System.out.println("Pizzas Cadastrados");
       			 	System.out.println("");
       				for (int i=0 ; i < listaPizza.size(); i ++) {
       					String d = formato.format(listaPizza.get(i).getDataValidade());
       					System.out.println("Id: " + listaPizza.get(i).getId() + "  /  Nome: " + listaPizza.get(i).getNome() + "  /  Preço venda: " + listaPizza.get(i).getPrecoVenda()
       						+ "  /  Data validade: " + d + "  /  Peso: " + listaPizza.get(i).getPeso() + "  /  Molho: " + listaPizza.get(i).getMolho() + 
       						"  /  Recheios: " + listaPizza.get(i).getRecheio1() + "/"  + listaPizza.get(i).getRecheio2() + "  /  Borda: " + listaPizza.get(i).getBorda() +"\n");
       		       }
       			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>");
	        		}
	        }
	        	
	        
		
	       }else{
	        	
	        	JOptionPane.showMessageDialog(null, " ERRO! - Conferir campos ");
	        	
	       }
	     
	        }
	
	}
	
	public static PizzaModel buscarPizza(Integer id) {
		for(PizzaModel mp: listaPizza) {
			if(id.equals(mp.getId())){
				return mp;
			}
		}
		return null;
	}
	
	public static boolean existePizza(Integer id, String nome) {
		for (PizzaModel mp : listaPizza) {
			if(id.equals(mp.getId()) || nome.equals(mp.getNome())){
				return true;
			}
		}
		
		return false;
	}
	
	
}
