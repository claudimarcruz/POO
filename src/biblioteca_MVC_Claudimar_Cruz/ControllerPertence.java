package biblioteca_MVC_Claudimar_Cruz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import biblioteca_MVC_Claudimar_Cruz.Controller.BotaoBehaviorLivro;
import exercicio_biblioteca.Categoria;
import exercicio_biblioteca.Livro;
import exercicio_biblioteca.Pertence;



public class ControllerPertence {
	ViewPertence cadPertence;
	static List<ModelPertence> listaPertence = new ArrayList<ModelPertence>();
	
	public ControllerPertence(ViewPertence cadastroPertence) {
		cadPertence = cadastroPertence;
		
		cadastroPertence.setBotaoBehaviorPertence(new BotaoBehaviorPertence());
	}
	//********************************************************
	class BotaoBehaviorPertence implements ActionListener{
		@Override
		
	    public void actionPerformed(ActionEvent e) {
			
			ModelPertence pertence = new ModelPertence(); //criação lista de livros
			
	    	Integer idLivro = null;
	    	Integer idCategoria = null;
	    	
	    	try {
	    		idLivro = Integer.parseInt(cadPertence.get_text_id_livro());
		        idCategoria = Integer.parseInt(cadPertence.get_text_id_categoria());
	    	} catch(Exception ex) {
	    		JOptionPane.showMessageDialog(null, " ERRO! - Id não numérico"); // confere ids 
	    		//System.out.println("ID e/ou nome informado nÃ£o Ã© nÃºmerico!");

	    	}
	    	
	        ModelLivro livro = Controller.buscarLivro(idLivro);
	        ModelCategoria categoria = ControllerCategoria.buscarCategoria(idCategoria);
	        
	        if(livro != null && categoria != null) {
	        	pertence.set_id_do_livro(idLivro);
		        pertence.set_id_da_categoria(idCategoria);
		        
		        if(existeRelacao(idLivro, idCategoria)) {
		        	JOptionPane.showMessageDialog(null, "A Relacao já existe");
		        }else {
		        	listaPertence.add(pertence);
		        	JOptionPane.showMessageDialog(null, "Relação realizada com sucesso");
		        }
		        
	        }else {
	        	if(livro == null) { 
	        		JOptionPane.showMessageDialog(null, "Não existe este livro");
	        	}else if(categoria == null) {
	        		JOptionPane.showMessageDialog(null, "Não existe esta categoria");
	        	}
	        	
	        }
	        
	        String aux ="";
	        
	        for (ModelLivro l : Controller.listaLivro) {
				for (ModelPertence p : listaPertence) {
					for (ModelCategoria c : ControllerCategoria.listaCategoria) {		
						if((l.getId() == p.get_id_do_livro()) && (c.get_id_categoria() == p.get_id_da_categoria()) ) {
							aux = aux + "Nome do livro: " + l.getNome() + 
									"  /  Categoria: " + c.get_nome_categoria() + "\n";
						}
					}
				}
			}
	       
			cadPertence.setVisor(aux);
			
	        }
	    	
	    }
	
	
		public void listarPertence(List<ModelPertence> listaPertence) {
			for (ModelPertence p : listaPertence) {
	        	System.out.println("Id Livro: " + p.get_id_do_livro());
	            System.out.println("Id Categoria: " + p.get_id_da_categoria());
	           
	            
	        }
		}
		
		public static boolean existeRelacao(Integer idLivro, Integer idCategoria) {
			for (ModelPertence p : listaPertence) {
				if(idLivro.equals(p.get_id_do_livro()) && idCategoria.equals(p.get_id_da_categoria())) {
					return true;
				}
			}
			
			return false;
		}
		
			
		
		
}