package Trabalho_Etapa2_POO_ClaudimarCruz.Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import Trabalho_Etapa2_POO_ClaudimarCruz.Model.RecheioModel;
import Trabalho_Etapa2_POO_ClaudimarCruz.View.TelaRecheio;



public class RecheioController {
	static SimpleDateFormat formato = new SimpleDateFormat("dd/mm/yyyy");
	TelaRecheio telaRecheio;
	static List<RecheioModel> listaRecheio = new ArrayList<RecheioModel>();
	
	public RecheioController() {
		super();
	}
	
	public List<RecheioModel> getLista() {
        return listaRecheio;
    }
	
	public RecheioController (TelaRecheio tela) {
		telaRecheio = tela;
		
		tela.setBotaoBehaviorRecheio(new BotaoBehaviorRecheio());
	}
	
	class BotaoBehaviorRecheio implements ActionListener{
		@Override
		
		public void actionPerformed(ActionEvent e) {
			
			RecheioModel recheio = new RecheioModel(); 
			
	    	Integer idRecheio = null;
	    	try {
	    		idRecheio = Integer.parseInt(telaRecheio.getID());
	    	}catch(Exception ex) {
	    		JOptionPane.showMessageDialog(null, " ERRO! - ID não numérico ");
	    	}
	    	
	    	String nomeRecheio = telaRecheio.getNome();
	    	
	    	Double precoVenda = null;
	    	try {
	    		precoVenda = Double.parseDouble(telaRecheio.getValorVenda());
	    	}catch(Exception ex) {
	    		JOptionPane.showMessageDialog(null, " ERRO! - Conferir campo Preço de Valor ");
	    	}
	    	 
	        if(nomeRecheio.strip().length() > 0) {
	        	recheio.setId(idRecheio);
	        	recheio.setNome(nomeRecheio);
	        	recheio.setValor(precoVenda);
	        	
	        	if(existeRecheio(idRecheio, nomeRecheio)) {
	        		JOptionPane.showMessageDialog(null, "ID ou Nome já existentes");
	        	}else {
	        	
	        		if(idRecheio instanceof Integer && precoVenda instanceof Double) {
	        			listaRecheio.add(recheio);
	        			System.out.println("nome: " + nomeRecheio);
		        	JOptionPane.showMessageDialog(null, "Recheio cadastrado!");
		        	
		        	System.out.println("Molhos Cadastrados");
       			 	System.out.println("");
       				for (int i=0 ; i < listaRecheio.size(); i ++) {
       					System.out.println("Id: " + listaRecheio.get(i).getId() + "  /  Nome: " + listaRecheio.get(i).getNome() 
       							+ "  /  Valor: " + listaRecheio.get(i).getValor() + "\n");
       		       }
       			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>");
	        		}
	        }
	       }else{
	        	
	        	JOptionPane.showMessageDialog(null, " ERRO! - Conferir campos ");
	        	
	       }
	     
	        }
	
	}
	
	public static RecheioModel buscarRecheio(Integer id) {
		for(RecheioModel rm: listaRecheio) {
			if(id.equals(rm.getId())){
				return rm;
			}
		}
		return null;
	}
	
	public static boolean existeRecheio(Integer id, String nome) {
		for (RecheioModel rm : listaRecheio) {
			if(id.equals(rm.getId()) || nome.equals(rm.getNome())){
				return true;
			}
		}
		
		return false;
	}
	
	
}