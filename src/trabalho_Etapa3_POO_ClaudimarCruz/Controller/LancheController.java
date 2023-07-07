package trabalho_Etapa3_POO_ClaudimarCruz.Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;

import trabalho_Etapa3_POO_ClaudimarCruz.Conexao.ConexaoBanco;
import trabalho_Etapa3_POO_ClaudimarCruz.Model.LancheDAO;
import trabalho_Etapa3_POO_ClaudimarCruz.Model.LancheModel;
import trabalho_Etapa3_POO_ClaudimarCruz.View.TelaLanche;

public class LancheController {
	static SimpleDateFormat formato = new SimpleDateFormat("dd/mm/yyyy");
	TelaLanche telaLanche;
	static List<LancheModel> listaLanche = new ArrayList<LancheModel>();
	
	public LancheController() {
		super();
	}
	
	public List<LancheModel> getLista() {
        return listaLanche;
    }
	
	public LancheController (TelaLanche tela) {
		telaLanche = tela;
		
		tela.setBotaoBehaviorLanche(new BotaoBehaviorLanche());
	}
	
	class BotaoBehaviorLanche implements ActionListener{
		@SuppressWarnings("static-access")
		@Override
		
		public void actionPerformed(ActionEvent e) {
			
			LancheModel lanche = new LancheModel(); 
			
	    	Integer idLanche = null;
	    	try {
	    		idLanche = Integer.parseInt(telaLanche.getID());
	    	}catch(Exception ex) {
	    		JOptionPane.showMessageDialog(null, " ERRO! - ID não numérico ");
	    	}
	    	
	    	String nomeLanche = telaLanche.getNome();
	    	
	    	Double precoVenda = null;
	    	try {
	    		precoVenda = Double.parseDouble(telaLanche.getValorVenda());
	    	}catch(Exception ex) {
	    		JOptionPane.showMessageDialog(null, " ERRO! - Conferir campo Preço de Venda ");
	    	}
	    	 
	    	
	    	Date dataValidade = null;
	    	try {
	    		dataValidade = formato.parse(telaLanche.getData());
	    	}catch(Exception ex) {
	    		JOptionPane.showMessageDialog(null, " ERRO! - Data incorreta ");
	    	}
	    	
	    	Double peso = null;
	    	try {
	    		peso = Double.parseDouble(telaLanche.getPeso()); 
	    	}catch(Exception ex) {
	    		JOptionPane.showMessageDialog(null, " ERRO! - Conferir campo Peso ");
	    	}
	    
	    	String pao = telaLanche.getPao();
	    	
	    	String recheio = telaLanche.getRecheio();
	    	
	    	String molho = telaLanche.getMolho();
	    	
	    
	        
	        if(nomeLanche.strip().length() > 0 && pao.strip().length() > 0
	        		&& recheio.strip().length() > 0 && molho.strip().length() > 0) {
	        	//System.out.println("nome: " + nomePizza);
	        	lanche.setId(idLanche);
	        	lanche.setNome(nomeLanche);
	        	lanche.setPrecoVenda(precoVenda);
	        	lanche.setDataValidade(dataValidade);
	        	lanche.setPeso(peso);
	        	lanche.setPao(pao);
	        	lanche.setRecheio(recheio);
	        	lanche.setMolho(molho);
	        	
	        	if(existeLanche(idLanche, nomeLanche)) {
	        		JOptionPane.showMessageDialog(null, "ID ou Nome já existentes");
	        	}else {
	        		
	        		//*****************************************************
	        		if(idLanche instanceof Integer && dataValidade instanceof Date 
	        				&& precoVenda instanceof Double && peso instanceof Double 	) {
	        			listaLanche.add(lanche);
	        			//TelaPedido.atualizarComboLanche((ArrayList<LancheModel>)listaLanche);
	        			JOptionPane.showMessageDialog(null, "Lanche cadastrado!");
	        			
	        			ConexaoBanco conexao = new ConexaoBanco();
	        			conexao.conectarBanco();
	        			LancheDAO lancheDAO = new LancheDAO();
	        			


	        			java.sql.Date sqlDate = new java.sql.Date(dataValidade.getTime());
	        			
	        			try {
	        				lancheDAO.insertCadastro(idLanche, nomeLanche, precoVenda, sqlDate, peso, pao, recheio, molho);
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
	        			
	        			System.out.println("Lanches Cadastrados");
	        			 System.out.println("");
	        				for (int i=0 ; i < listaLanche.size(); i ++) {
	        					String d = formato.format(listaLanche.get(i).getDataValidade());
	        					System.out.println("Id: " + listaLanche.get(i).getId() + "  /  Nome: " + listaLanche.get(i).getNome() + "  /  Preço venda: " + listaLanche.get(i).getPrecoVenda()
	        						+ "  /  Data validade: " + d + "  /  Peso: " + listaLanche.get(i).getPeso() + "  /  Tipo pão: " + listaLanche.get(i).getPao() + 
	        						"  /  Recheio: " + listaLanche.get(i).getRecheio() + "  /  Molho: " + listaLanche.get(i).getMolho() +"\n");
	        		       }
	        			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>");
	        		}
	        }
	        	
		
	       }else{
	        	
	        	JOptionPane.showMessageDialog(null, " ERRO! - Conferir campos ");
	        	
	       }
	     
	        }
	
	}
	
	public static LancheModel buscaLanche(Integer id) {
		for(LancheModel lm: listaLanche) {
			if(id.equals(lm.getId())){
				return lm;
			}
		}
		return null;
	}
	
	public static boolean existeLanche(Integer id, String nome) {
		for (LancheModel lm : listaLanche) {
			if(id.equals(lm.getId()) || nome.equals(lm.getNome())){
				return true;
			}
		}
		
		return false;
	}
	
	
}
