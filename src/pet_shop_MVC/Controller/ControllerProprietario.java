package pet_shop_MVC.Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import pet_shop_MVC.Model.ModelProprietario;
import pet_shop_MVC.View.ViewProprietario;

public class ControllerProprietario {
	static SimpleDateFormat formato = new SimpleDateFormat("dd/mm/yyyy");
	ViewProprietario cadProprietario;
	static List<ModelProprietario> listaProprietario = new ArrayList<ModelProprietario>();
	
	public ControllerProprietario(ViewProprietario cadastroProprietario) {
		cadProprietario = cadastroProprietario;
		
		cadastroProprietario.setBotaoBehaviorProp(new BotaoBehaviorProp());
	}
	
	class BotaoBehaviorProp implements ActionListener{
		@Override
		
		public void actionPerformed(ActionEvent e) {
			
			ModelProprietario proprietario = new ModelProprietario(); 
			
	    	Integer idProp = null;
	    	try {
	    		idProp = Integer.parseInt(cadProprietario.getID());
	    	}catch(Exception ex) {
	    		JOptionPane.showMessageDialog(null, " ERRO! - ID não numérico ");
	    	}
	    	
	    	
	    	Date dataNProp = null;
	    	try {
	    		dataNProp = formato.parse(cadProprietario.getDNasc());
	    	}catch(Exception ex) {
	    		JOptionPane.showMessageDialog(null, " ERRO! - Data incorreta ");
	    	}
	    	
	    	
	    	
	    	
	    	String cpfProp = cadProprietario.getCpf();
	    	String telProp = cadProprietario.getTel();
	    	String nomeProp = cadProprietario.getNome();
	    	String endProp = cadProprietario.getEnd();
	        
	        if(nomeProp.strip().length() > 0 && cpfProp.strip().length() > 0  
	        		&& telProp.strip().length() > 0 && endProp.strip().length() > 0) {

	        	proprietario.setId(idProp);
	        	proprietario.setNome(nomeProp);
	        	proprietario.setData_nascimento(dataNProp);
	        	proprietario.setCPF(cpfProp);
	        	proprietario.setTelefone(telProp);
	        	proprietario.setEndereco(endProp);
	        	if(existeProp(idProp, nomeProp, cpfProp)) {
	        		JOptionPane.showMessageDialog(null, "ID ou Nome ou CPF do proprietario já existe");
	        	}else {
	        		//*****************************************************
	        		if(idProp instanceof Integer && dataNProp instanceof Date) {
	        			listaProprietario.add(proprietario);
			        //listarProprietarios(listaProprietario);
		        	JOptionPane.showMessageDialog(null, "Cliente cadastrado!");
	        		}
	        }
	        
		
	       }else{
	        	
	        	JOptionPane.showMessageDialog(null, " ERRO! - Conferir campos ");
	        	
	       }
	     
	        String aux ="";
			for (int i=0 ; i < listaProprietario.size(); i ++) {
				
			aux = aux + "Nome: " + listaProprietario.get(i).getNome() + "  /  ID: " + listaProprietario.get(i).getId() + "  /  Data de nascimento: " + listaProprietario.get(i).getData_nascimento()
					+ "  /  CPF: " + listaProprietario.get(i).getCPF() + "  /  Telefone: " + listaProprietario.get(i).getTelefone() + "  /  Endereço: " + listaProprietario.get(i).getEndereco() + "\n";
			
	            
	       }
			cadProprietario.setVisor(aux);
			
	        }
	
	}
	public static ModelProprietario buscarProprietario(Integer id) {
		for(ModelProprietario mp: listaProprietario) {
			if(id.equals(mp.getId())){
				return mp;
			}
		}
		return null;
	}
	
	public static boolean existeProp(Integer idProp, String nomeProp, String cpfProp) {
		for (ModelProprietario pr : listaProprietario) {
			if(idProp.equals(pr.getId()) || nomeProp.equals(pr.getNome())
				&& nomeProp.equals(pr.getCPF())){
				return true;
			}
		}
		
		return false;
	}
	
}
