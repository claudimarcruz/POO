package biblioteca_MVC_Claudimar_Cruz;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import exercicio_biblioteca.Livro;


public class Controller {
	ModelLivro modelLivro;
	ModelCategoria modelCategoria;
	ModelPertence modelPertence;
	View view;
	
	public Controller(ModelLivro ml, ModelCategoria mc, ModelPertence mp, View v ) {
		modelLivro = ml;
		modelCategoria = mc;
		modelPertence = mp;
		
		view = v;
		view.setBotaoBehaviorLivro(new BotaoBehaviorLivro());
		view.setBotaoBehaviorCategoria(new BotaoBehaviorCategoria());
		view.setBotaoBehaviorPertence(new BotaoBehaviorPertence());
	}
	//********************************************************
	class BotaoBehaviorLivro implements ActionListener{
		@Override
	    public void actionPerformed(ActionEvent e) {
	    	
			Integer cont = 0;
	    	Integer idLivro = null;
	    	Integer anoLivro = null;
	    	
	    	try {
	    		idLivro = Integer.parseInt(view.getID());
	        	anoLivro = Integer.parseInt(view.getAno());
	    	} catch (Exception ex) {
	    		System.out.println("Erro");
	    	}
	    	
	    	String nomeLivro = view.getNome();
	        String autorLivro = view.getAutor();
	    	//do {
	    	if(idLivro instanceof Integer && anoLivro instanceof Integer
	    			&& nomeLivro.strip().length() > 0 && autorLivro.strip().length() > 0) {
	    		List<ModelLivro> listaLivros = new ArrayList<ModelLivro>();
	    		cont ++;
	    		//view.setVisor("ok");
	    		if (cont == 1) {
	    			//List<ModelLivro> listaLivros = new ArrayList<ModelLivro>();
			        ModelLivro livro = new ModelLivro(idLivro, nomeLivro,autorLivro, anoLivro);
			        listaLivros.add(livro);
		    		//view.setVisor(listaLivros.add(livro));
			        //for para imprimir 
			        
			        cont = 0;
	    		}
	    		
	    		for (ModelLivro l : listaLivros) {
		        	System.out.println("Id: " + l.getId());
		            System.out.println("Nome: " + l.getNome());
		            System.out.println("Autor: " + l.GetAutor());
		            System.out.println("Ano: " + l.getAno());
		            System.out.println();
		            
		            
		        }
	    		
	    		
	            
	          
	    	} else {
	    		System.out.println("Erro\n");
	    	}
	    	//}while(cont < 10);
	    	
	    }
		
		
	}
	//*******************************************************************
	class BotaoBehaviorCategoria implements ActionListener{

	    @Override
	    public void actionPerformed(ActionEvent e) {
	      
	      Integer idCategoria = null;
	      
	      try {
	    	  idCategoria = Integer.parseInt(view.getTextIdCategoria());
	      } catch (Exception ex) {
	    	  System.out.println("ID informado nÃ£o Ã© nÃºmerico!");
	      }
	      
	      String nomeCategoria = view.getTextNomeCategoria();
	    
	      if(idCategoria instanceof Integer && nomeCategoria.strip().length() > 0) {
	    	  System.out.println(idCategoria);
	          System.out.println(nomeCategoria);
	          System.out.println();
	      } else {
	    	  System.out.println("Preencha todos os campos corretamente!\n");
	      }

	    }

	  }
	//******************************************************************
	class BotaoBehaviorPertence implements ActionListener{

	    @Override
	    public void actionPerformed(ActionEvent e) {
	    	
	    	Integer idLivroP = null;
  	      	Integer idCategoriaP = null;
	      
	    	try {
	    		idLivroP = Integer.parseInt(view.get_text_id_livro());
	  	      	idCategoriaP = Integer.parseInt(view.get_text_id_categoria());
	    	} catch (Exception ex) {
	    		System.out.println("ID informado nÃ£o Ã© nÃºmerico!");
	    	}
	    	
	    	if(idLivroP instanceof Integer && idCategoriaP instanceof Integer) {
	    		System.out.println(idLivroP);
				System.out.println(idCategoriaP);
				System.out.println();
	    	} else {
	    		System.out.println("Preencha todos os campos corretamente!\n");
	    	}

	    }

	  }

}