package biblioteca_MVC_Claudimar_Cruz;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import exercicio_biblioteca.Livro;

public class Controller {
	View cadLivro;
	static List<ModelLivro> listaLivro = new ArrayList<ModelLivro>();
	
	public Controller(View cadastroLivro ) {
		cadLivro = cadastroLivro;
		
		cadastroLivro.setBotaoBehaviorLivro(new BotaoBehaviorLivro());
	}
	//********************************************************
	class BotaoBehaviorLivro implements ActionListener{
		@Override
		
	    public void actionPerformed(ActionEvent e) {
			
			ModelLivro livro = new ModelLivro(); //criação lista de livros
			
	    	Integer idLivro = null;
	    	Integer anoLivro = null;
	    	
	    	try {
	    		idLivro = Integer.parseInt(cadLivro.getID());
		        anoLivro = Integer.parseInt(cadLivro.getAno());
	    	}catch(Exception ex) {
	    		JOptionPane.showMessageDialog(null, " ERRO! - Conferir Id ou Ano Publicaçao ");
	    	}
	    	
	    	
	    	String nomeLivro = cadLivro.getNome();
	        String autorLivro = cadLivro.getAutor();
	        
	        if(nomeLivro.strip().length() > 0 && autorLivro.strip().length() > 0) {

	        	livro.setId(idLivro);
	        	livro.setNome(nomeLivro);
	        	livro.setAutor(autorLivro);
	        	livro.setAno(anoLivro);
	        
	        	if(existeRelacao(idLivro, nomeLivro)) {
	        		JOptionPane.showMessageDialog(null, "ID ou Nome do livro já existe");
	        	}else {
	        	
	        		if(idLivro instanceof Integer && anoLivro instanceof Integer) {
	        		listaLivro.add(livro);
			        listarLivros(listaLivro);
		        	JOptionPane.showMessageDialog(null, "Livro cadastrado!");
	        		}
	        	
	        	}
	        
	        
	        }else{
	        	
	        	JOptionPane.showMessageDialog(null, " ERRO! - Conferir campo Nome ou Autor ");
	        	
	        }
	        //cadLivro.setVisor(anoLivro.toString());
	        String aux ="";
			for (int i=0 ; i < listaLivro.size(); i ++) {
				
			aux = aux + "Livro: " + listaLivro.get(i).getNome() + "  /  ID de número: " + listaLivro.get(i).getId() + "  /  Autor: " + listaLivro.get(i).GetAutor()
								+ "  /  Ano Publicação: " + listaLivro.get(i).getAno() + "\n";
			
	            
	        }
			cadLivro.setVisor(aux);
			cadLivro.setVisor2("Número de livros cadastrados: " + listaLivro.size());
	        }
	    	
	    }
		
		public void listarLivros(List<ModelLivro> listaLivros) {
			for (ModelLivro l : listaLivros) {
	        	System.out.println("Id: " + l.getId());
	            System.out.println("Nome: " + l.getNome());
	            System.out.println("Autor: " + l.GetAutor());
	            System.out.println("Ano: " + l.getAno());
	            System.out.println();
	            
	            
	        }
		}
		
		public static ModelLivro buscarLivro(Integer id) {
			for(ModelLivro ml: listaLivro) {
				if(id.equals(ml.getId())){
					return ml;
				}
			}
			return null;
		}
		/*
		public static boolean existeRelacao(Integer idLivro, String nomeLivro, String autorLivro, Integer anoLivro) {
			for (ModelLivro l : listaLivro) {
				if(idLivro.equals(l.getId()) && nomeLivro.equals(l.getNome()) &&
						autorLivro.equals(l.GetAutor()) && anoLivro.equals(l.getAno())){
					return true;
				}
			}
			
			return false;
		}
		*/
		
		public static boolean existeRelacao(Integer idLivro, String nomeLivro) {
			for (ModelLivro l : listaLivro) {
				if(idLivro.equals(l.getId()) || nomeLivro.equals(l.getNome())){
					return true;
				}
			}
			
			return false;
		}
		
		
		
}
	