package trabalho_Etapa3_POO_ClaudimarCruz.Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import trabalho_Etapa3_POO_ClaudimarCruz.Conexao.ConexaoBanco;
import trabalho_Etapa3_POO_ClaudimarCruz.Model.MolhoDAO;
import trabalho_Etapa3_POO_ClaudimarCruz.Model.MolhoModel;
import trabalho_Etapa3_POO_ClaudimarCruz.View.TelaMolho;


public class MolhoController {
	static SimpleDateFormat formato = new SimpleDateFormat("dd/mm/yyyy");
	TelaMolho telaMolho;
	static List<MolhoModel> listaMolho = new ArrayList<MolhoModel>();
	
	public MolhoController() {
		super();
	}
	
	public List<MolhoModel> getLista() {
        return listaMolho;
    }
	
	public MolhoController (TelaMolho tela) {
		telaMolho = tela;
		
		tela.setBotaoBehaviorMolho(new BotaoBehaviorMolho());
	}
	
	class BotaoBehaviorMolho implements ActionListener{
		@SuppressWarnings("static-access")
		@Override
		
		public void actionPerformed(ActionEvent e) {
			
			MolhoModel molho = new MolhoModel(); 
			
	    	Integer idMolho = null;
	    	try {
	    		idMolho = Integer.parseInt(telaMolho.getID());
	    	}catch(Exception ex) {
	    		JOptionPane.showMessageDialog(null, " ERRO! - ID não numérico ");
	    	}
	    	
	    	String nomeMolho = telaMolho.getNome();
	    	
	    	Double precoVenda = null;
	    	try {
	    		precoVenda = Double.parseDouble(telaMolho.getValorVenda());
	    	}catch(Exception ex) {
	    		JOptionPane.showMessageDialog(null, " ERRO! - Conferir campo Preço de Valor ");
	    	}
	    	 
	        if(nomeMolho.strip().length() > 0) {
	        	molho.setId(idMolho);
	        	molho.setNome(nomeMolho);
	        	molho.setValor(precoVenda);
	        	
	        	if(existeMolho(idMolho, nomeMolho)) {
	        		JOptionPane.showMessageDialog(null, "ID ou Nome já existentes");
	        	}else {
	        		
	        		//*****************************************************
	        		if(idMolho instanceof Integer && precoVenda instanceof Double) {
	        			listaMolho.add(molho);
	       	        	JOptionPane.showMessageDialog(null, "Molho cadastrado!");
		        	
	       	        	ConexaoBanco conexao = new ConexaoBanco();
	        			conexao.conectarBanco();
	        			MolhoDAO molhoDAO = new MolhoDAO();
	        			

	        			try {
	        				molhoDAO.insertCadastro(idMolho, nomeMolho, precoVenda);
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
	       	        	
	       	        
	        			System.out.println("Molhos Cadastrados");
       			 		System.out.println("");
       				for (int i=0 ; i < listaMolho.size(); i ++) {
       					System.out.println("Id: " + listaMolho.get(i).getId() + "  /  Nome: " + listaMolho.get(i).getNome() 
       							+ "  /  Valor: " + listaMolho.get(i).getValor() + "\n");
       		       }
       			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>");
	        		}
	        }
	        	
	        
		
	       }else{
	        	
	        	JOptionPane.showMessageDialog(null, " ERRO! - Conferir campos ");
	        	
	       }
	     
	        }
	
	}
	
	public static MolhoModel buscarMolho(Integer id) {
		for(MolhoModel mm: listaMolho) {
			if(id.equals(mm.getId())){
				return mm;
			}
		}
		return null;
	}
	
	public static boolean existeMolho(Integer id, String nome) {
		for (MolhoModel mm : listaMolho) {
			if(id.equals(mm.getId()) || nome.equals(mm.getNome())){
				return true;
			}
		}
		
		return false;
	}
	
	
}