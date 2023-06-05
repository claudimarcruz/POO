package Trabalho_Etapa2_POO_ClaudimarCruz.Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import Trabalho_Etapa2_POO_ClaudimarCruz.Model.BordaModel;
import Trabalho_Etapa2_POO_ClaudimarCruz.View.TelaBorda;


public class BordaController {
	static SimpleDateFormat formato = new SimpleDateFormat("dd/mm/yyyy");
	TelaBorda telaBorda;
	static List<BordaModel> listaBorda = new ArrayList<BordaModel>();
	
	public BordaController() {
		super();
	}
	
	public List<BordaModel> getLista() {
        return listaBorda;
    }
	
	public BordaController (TelaBorda tela) {
		telaBorda = tela;
		
		tela.setBotaoBehaviorBorda(new BotaoBehaviorBorda());
	}
	
	class BotaoBehaviorBorda implements ActionListener{
		@Override
		
		public void actionPerformed(ActionEvent e) {
			
			BordaModel borda = new BordaModel(); 
			
	    	String nomeBorda = telaBorda.getNome();
	    	
	    	String recheioBorda = telaBorda.getRecheio();
	    	
	    	Double precoVenda = null;
	    	try {
	    		precoVenda = Double.parseDouble(telaBorda.getValorVenda());
	    	}catch(Exception ex) {
	    		JOptionPane.showMessageDialog(null, " ERRO! - Conferir campo Preço de Valor ");
	    	}
	    	 
	        if(nomeBorda.strip().length() > 0 && recheioBorda.strip().length() > 0) {
	        	//System.out.println("nome: " + nomePizza);
	        	borda.setNome(nomeBorda);
	        	borda.setValor(precoVenda);
	        	borda.setRecheio(recheioBorda);
	        	
	        	if(existeBorda(nomeBorda)) {
	        		JOptionPane.showMessageDialog(null, "Nome já existente");
	        	}else {
	        		
	        		//*****************************************************
	        		if(precoVenda instanceof Double) {
	        			listaBorda.add(borda);
		        	JOptionPane.showMessageDialog(null, "Borda cadastrada!");
		        	
		        	System.out.println("Bordas Cadastrados");
       			 	System.out.println("");
       				for (int i=0 ; i < listaBorda.size(); i ++) {
       					System.out.println("Nome: " + listaBorda.get(i).getNome() + "  /  Valor: " + listaBorda.get(i).getValor() 
       							+ "  /  Recheio: " + listaBorda.get(i).getRecheio() + "\n");
       		       }
       			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>");
	        		}
	        }
	        	
	        
		
	       }else{
	        	
	        	JOptionPane.showMessageDialog(null, " ERRO! - Conferir campos ");
	        	
	       }
	     
	        
	        }
	
	}
	
	public static BordaModel buscarBorda(String nome) {
		for(BordaModel bm: listaBorda) {
			if(nome.equals(bm.getNome())){
				return bm;
			}
		}
		return null;
	}
	
	public static boolean existeBorda(String nome) {
		for (BordaModel rm : listaBorda) {
			if(nome.equals(rm.getNome())){
				return true;
			}
		}
		
		return false;
	}
	
	
}