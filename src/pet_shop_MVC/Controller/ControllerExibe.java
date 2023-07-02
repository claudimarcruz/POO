package pet_shop_MVC.Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;


import pet_shop_MVC.Model.ModelAnimal;
import pet_shop_MVC.Model.ModelCao;
import pet_shop_MVC.Model.ModelGato;
import pet_shop_MVC.Model.ModelPassaro;
import pet_shop_MVC.Model.ModelProprietario;
import pet_shop_MVC.Model.ModelRelacao;
import pet_shop_MVC.View.ViewExibe;

public class ControllerExibe{
	ViewExibe cadExibe;
	
	
	public ControllerExibe(ViewExibe cadastroExibe) {
		cadExibe = cadastroExibe;
		
		cadastroExibe.setBotaoBehaviorExibir(new BotaoBehaviorExibir());
		cadastroExibe.setBotaoBehaviorAnimal(new BotaoBehaviorAnimal());
		
	}
	
	
	
	class BotaoBehaviorAnimal implements ActionListener{
		@SuppressWarnings("static-access")
		@Override
		
		public void actionPerformed(ActionEvent e) {
			//cpfProp.strip().length() > 0
	    	Integer idProp = null;

	    	try {
	    		idProp = Integer.parseInt(cadExibe.get_text_cpf_prop());
	    	}catch(Exception ex) {
	    		JOptionPane.showMessageDialog(null, " ERRO! - ID não numérico ");
	    	}
	    	
	    	
	        	ModelProprietario proprietario = ControllerProprietario.buscarProprietario(idProp);
	        		
		        	if(proprietario == null) { 
		        		JOptionPane.showMessageDialog(null, "Não existe este Proprietario");
		        	}else {
		        		 String aux =" ";
		        				for( ModelRelacao mr : ControllerRelacao.listaRelacao) {
		        					if (idProp == mr.getId_do_dono()) {
		        						for (ModelCao mc : ControllerCao.listaCao) {
		        							if(mc.getId() == mr.getId_do_animal() &&  idProp == mr.getId_do_dono()) {
		        								aux = aux + "Animal -> Id: " + mc.getId() + " / Raça: " + mc.getRaca() + " / Nome: " + mc.getNome() + " / Idade: " + mc.getIdade() + "\n";
		        								System.out.println( );
		        							}
		        							
		        						}
		        						for (ModelGato mg : ControllerGato.listaGato) {
		        							if(mg.getId() == mr.getId_do_animal() &&  idProp == mr.getId_do_dono()) {
		        								aux = aux + "Animal -> Id: " + mg.getId() + " / Raça: " + mg.getRaca() + " / Nome: " + mg.getNome() + " / Idade: " + mg.getIdade() + "\n";
		        								System.out.println();
		        							}
		        							
		        						}
		        						for (ModelPassaro mpa : ControllerPassaro.listaPassaro) {
		        							if(mpa.getId() == mr.getId_do_animal() &&  idProp == mr.getId_do_dono()) {
		        								aux = aux + "Animal -> Id: " + mpa.getId() + " / Raça: " + mpa.getRaca() + " / Nome: " + mpa.getNome() + " / Idade: " + mpa.getIdade() + "\n";
		        								System.out.println( );
		        							}
		        							
		        						}
		        					
		        					}
		        				}
		        		
		        		 cadExibe.setVisor(aux);
		        	}
		     
	        }
	}
	
	class BotaoBehaviorExibir implements ActionListener{
		@Override
		
		public void actionPerformed(ActionEvent e) {
			
			
		        		 String aux =" ";
		        		 
		        		 
		    for(ModelProprietario mp : ControllerProprietario.listaProprietario){
		        for( ModelRelacao mr : ControllerRelacao.listaRelacao) {
		        	if (mp.getCPF() == mr.getId_do_dono()) {
		        			aux = aux + "Proprietario -> Nome: " + mp.getNome() + " / CPF: " + mp.getCPF() + "\n";
		        			for (ModelCao mc : ControllerCao.listaCao) {
		        					if(mc.getId() == mr.getId_do_animal()) {
		        					aux = aux + "Animal -> Id: " + mc.getNome() + " / Raça: " + mc.getRaca() + " / Nome: " + mc.getNome() + " / Idade: " + mc.getIdade() + "\n";
		        					System.out.println( );
		        					}
		        							
		        			}
		        			for (ModelGato mg : ControllerGato.listaGato) {
		        				if(mg.getId() == mr.getId_do_animal()) {
		        					aux = aux + "Animal -> Id: " + mg.getNome() + " / Raça: " + mg.getRaca() + " / Nome: " + mg.getNome() + " / Idade: " + mg.getIdade() + "\n";
		        					System.out.println();
		        				}
		        							
		        			}
		        			for (ModelPassaro mpa : ControllerPassaro.listaPassaro) {
		        				if(mpa.getId() == mr.getId_do_animal()) {
		        					aux = aux + "Animal -> Id: " + mpa.getNome() + " / Raça: " + mpa.getRaca() + " / Nome: " + mpa.getNome() + " / Idade: " + mpa.getIdade() + "\n";
		        					System.out.println( );
		        				}
		        							
		        			}
		        						
		        					
		        	}
		        					
		        }
		        					
		        				aux = aux + " ****************************************************** \n";
		        				cadExibe.setVisorLista(aux);
		    }
		      
	    }
	}
	
	
}
