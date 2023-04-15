package biblioteca_MVC_Claudimar_Cruz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import biblioteca_MVC_Claudimar_Cruz.Controller.BotaoBehaviorLivro;
import exercicio_biblioteca.Livro;


public class ControllerCategoria {
	ViewCategoria cadCategoria;
	static List<ModelCategoria> listaCategoria = new ArrayList<ModelCategoria>();
	
	public ControllerCategoria(ViewCategoria cadastroCategoria) {
		cadCategoria = cadastroCategoria;
		
		cadastroCategoria.setBotaoBehaviorCategoria(new BotaoBehaviorCategoria());
	}
	
	class BotaoBehaviorCategoria implements ActionListener{
		@Override
		
	    public void actionPerformed(ActionEvent e) {
			
			ModelCategoria categoria = new ModelCategoria();
			
	    	Integer idCategoria = null;
	    	
	    	try {
	    		idCategoria = Integer.parseInt(cadCategoria.getTextIdCategoria());
	    	}catch(Exception ex) {
	    		JOptionPane.showMessageDialog(null, " ERRO! - Conferir Id da categoria");
	    	}
	    	
	    	String nomeCategoria = cadCategoria.getTextNomeCategoria();
	        
	    	if(nomeCategoria.strip().length() > 0) {
	    		categoria.set_id_categoria(idCategoria);;
	 	        categoria.set_nome_categoria(nomeCategoria);
	 	        
	 	       
		       
		       if(existeRelacao(idCategoria, nomeCategoria)) {
	        		JOptionPane.showMessageDialog(null, "ID ou Nome do livro já existe");
	        	}else {
	        	
	        		if(idCategoria instanceof Integer) {
	        			listaCategoria.add(categoria);
	     		       	listarCategorias(listaCategoria);
	     		       	JOptionPane.showMessageDialog(null, "Categoria cadastrada!");
	        		}
	        	} 
		       
		       
	    	}else{
	        	
	        	JOptionPane.showMessageDialog(null, " ERRO! - Conferir o nome da Categoria ");
	    	}
	       
	        
	        
	        
	      
	        String aux ="";
			for (int i=0 ; i < listaCategoria.size(); i ++) {
				
			aux = aux + "Id da categoria: " + listaCategoria.get(i).get_id_categoria() + "  /  Nome da Categoria: " + listaCategoria.get(i).get_nome_categoria() + "\n";
			
	            
	        }
			cadCategoria.setVisorCat(aux);
			
	        }
	    	
	    }
	
	public void listarCategorias(List<ModelCategoria> listaCategorias) {
		for (ModelCategoria c : listaCategorias) {
        	System.out.println("Id da Categoria: " + c.get_id_categoria());
            System.out.println("Nome da categorias: " + c.get_nome_categoria());
            System.out.println();
            
            
        }
	}
	
	public static ModelCategoria buscarCategoria(Integer id) {
		for(ModelCategoria mc: listaCategoria) {
			if(id.equals(mc.get_id_categoria())){
				return mc;
			}
		}
		return null;
	}
	
	public static boolean existeRelacao(Integer idCategoria, String nomeCategoria) {
		for (ModelCategoria c : listaCategoria) {
			if(idCategoria.equals(c.get_id_categoria()) || nomeCategoria.equals(c.get_nome_categoria())){
				return true;
			}
		}
		
		return false;
	}
		
}
