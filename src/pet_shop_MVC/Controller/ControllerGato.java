package pet_shop_MVC.Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import pet_shop_MVC.Model.ModelGato;
import pet_shop_MVC.View.ViewGato;


public class ControllerGato {
	ViewGato cadGato;
	static List<ModelGato> listaGato = new ArrayList<ModelGato>();
	
	public ControllerGato(ViewGato cadastroGato) {
		cadGato = cadastroGato;
		
		cadastroGato.setBotaoBehaviorGato(new BotaoBehaviorGato());
	}
	
	class BotaoBehaviorGato implements ActionListener{
		@Override
		
		public void actionPerformed(ActionEvent e) {
			
			ModelGato gato = new ModelGato();
			
			String nomeAnim = cadGato.getNome();
	    	
	    	String racaAnimal =  cadGato.getRaca();
	    	String corAnimal =  cadGato.getCor();
	    	String sexoAnimal = cadGato.getSexo();
	    	String porteAnimal =  cadGato.getPorte();
	    	
			
	        Integer idAnim = null;
		    	try {
		    		idAnim = Integer.parseInt(cadGato.getID());
		    	}catch(Exception ex) {
		    		JOptionPane.showMessageDialog(null, " ERRO! - ID não numérico ");
		    	}
		    	
		    Integer idadeAnimal = null;
		    	
		    	try {
		    		idadeAnimal = Integer.parseInt( cadGato.getIdade());
		    	}catch(Exception ex) {
		    		JOptionPane.showMessageDialog(null, " ERRO! - Idade não numérico ");
		    	}
		    	
		    	Float pesoAnimal = null;
		    	
		    	try {
		    		pesoAnimal = Float.parseFloat(cadGato.getPeso());
		    	}catch(Exception ex) {
		    		JOptionPane.showMessageDialog(null, " ERRO! - Peso não numérico ");
		    	}
		  if(nomeAnim.strip().length() > 0 && racaAnimal.strip().length() > 0 
				  && corAnimal.strip().length() > 0 && sexoAnimal.strip().length() > 0
				  && porteAnimal.strip().length() > 0) {
	        	gato.setId(idAnim);
	        	gato.setNome(nomeAnim);
	        	gato.setIdade(idadeAnimal);
	        	gato.setRaca(racaAnimal);
	        	gato.setCor(corAnimal);
	        	gato.setSexo(sexoAnimal);
	        	gato.setPorte(porteAnimal);
	        	gato.setPeso(pesoAnimal);
	        	
	        	if(existeGato(idAnim)) {
	        		JOptionPane.showMessageDialog(null, "ID já existente");
	        	}else {
	        		if(idAnim instanceof Integer &&  idadeAnimal instanceof Integer &&
	        				pesoAnimal instanceof Float) {
	        			listaGato.add(gato);
	        			JOptionPane.showMessageDialog(null, "Gato cadastrado com sucesso");
	        		}
	        			
	        			
	        	}
	        
	        	
	       }else{
	        	
	        	JOptionPane.showMessageDialog(null, " ERRO! - Conferir campos ");
	        	
	       }
	        //cadLivro.setVisor(anoLivro.toString());
	        String aux ="";
			for (int i=0 ; i < listaGato.size(); i ++) {
				
				aux = aux + "Id: " + listaGato.get(i).getId() + "  /  Nome: " + listaGato.get(i).getId() + "  /  Raça: " + listaGato.get(i).getRaca()
						+ "  /  Cor: " + listaGato.get(i).getCor() + "  /  Sexo: " + listaGato.get(i).getSexo() + "  /  Porte: " + listaGato.get(i).getPorte()
						+ "  /  Peso: " + listaGato.get(i).getPeso()+ "\n";
			
			
	            
	       }
			cadGato.setVisor(aux);
			
			
	        }
	       
	}
	
	public static ModelGato buscarGato(Integer id) {
		for(ModelGato mg: listaGato) {
			if(id.equals(mg.getId())){
				return mg;
			}
		}
		return null;
	}
	
	public static boolean existeGato(Integer idAnim) {
		for (ModelGato g : listaGato) {
			if(idAnim.equals(g.getId())){
				return true;
			}
		}
		
		return false;
	}
	
}
