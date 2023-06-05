package Trabalho_Etapa2_POO_ClaudimarCruz.Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import Trabalho_Etapa2_POO_ClaudimarCruz.Model.PedidoModel;
import Trabalho_Etapa2_POO_ClaudimarCruz.View.TelaPedido;

public class PedidoController {
	static SimpleDateFormat formato = new SimpleDateFormat("dd/mm/yyyy");
	TelaPedido telaPedido;
	static List<PedidoModel> listaPedido = new ArrayList<PedidoModel>();
	
	public PedidoController (TelaPedido tela) {
		telaPedido = tela;
		
		tela.setBotaoBehaviorPedido(new BotaoBehaviorPedido());
	}
	
	class BotaoBehaviorPedido implements ActionListener{
		@Override
		
		public void actionPerformed(ActionEvent e) {
			
			PedidoModel pedido = new PedidoModel(); 
			
	    	Integer idPedido = null;
	    	try {
	    		idPedido = Integer.parseInt(telaPedido.getID());
	    	}catch(Exception ex) {
	    		JOptionPane.showMessageDialog(null, " ERRO! - ID não numérico ****");
	    	}
	    	
	    	String cliente = telaPedido.getNomeCliente();
	    	
	    	String funcionario = telaPedido.getNomeFunc();
	    	 
	    	Double taxa = null;
	    	try {
	    		taxa = Double.parseDouble(telaPedido.getTaxa());
	    	}catch(Exception ex) {
	    		JOptionPane.showMessageDialog(null, " ERRO! - Conferir campo Taxa de Serviço ");
	    	}
	    	
	    	String itens = telaPedido.getPratoCons();
	    	
	    	Integer quantidade = null;
	    	try {
	    		quantidade = Integer.parseInt(telaPedido.getQuant());
	    	}catch(Exception ex) {
	    		JOptionPane.showMessageDialog(null, " ERRO! -  Conferir campo Quantidade ");
	    	}
	    	
	    	Double valorTotal = null;
	    	try {
	    		valorTotal = Double.parseDouble(telaPedido.getValorTotal());
	    	}catch(Exception ex) {
	    		JOptionPane.showMessageDialog(null, " ERRO! - Conferir campo Valor Total ");
	    	}
	    	
	        
	        if(cliente.strip().length() > 0 && funcionario.strip().length() > 0
	        		&& itens.strip().length() > 0) {
	        	pedido.setIdPedido(idPedido);
	        	pedido.setNomeCliente(cliente);
	        	pedido.setNomeFuncionario(funcionario);
	        	pedido.setTaxaDeServico(taxa);
	        	pedido.setItensConsumidos(itens);
	        	pedido.setQuantidades(quantidade);
	        	pedido.setValorTotal(valorTotal);
	        	
	        	if(existePedido(idPedido)) {
	        		JOptionPane.showMessageDialog(null, "ID do pedido já existe");
	        	}else {
	        		
	        		//*****************************************************
	        		if(idPedido instanceof Integer && taxa instanceof Double
	        				&& valorTotal instanceof Double && quantidade instanceof Integer) {
	        			listaPedido.add(pedido);
	        			JOptionPane.showMessageDialog(null, "Pedido Efetuado!");
	        			
	        			 System.out.println("Pedidos Cadastrados");
	        			 System.out.println("");
	        				for (int i=0 ; i < listaPedido.size(); i ++) {
	        					System.out.println("Id Pedido: " + listaPedido.get(i).getIdPedido() + "  /  Nome Cliente: " + listaPedido.get(i).getNomeCliente() 
	        							+ "  /  Nome Funcionário: " + listaPedido.get(i).getNomeFuncionario()
	        						+ "  /  Taxa de Serviço: " + listaPedido.get(i).getTaxaDeServico() +  "  /  Prato Consumido: " + listaPedido.get(i).getItensConsumidos() + "  /  Quantidade: " + listaPedido.get(i).getQuantidades() +
	        						"  /  Valor Total: " + + listaPedido.get(i).getValorTotal() + "\n");
	        		       }
	        			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>");
	        		}
	        }
	        	
		
	       }else{
	        	
	        	JOptionPane.showMessageDialog(null, " ERRO! - Conferir campos ");
	        	
	       }
	        
	       
	     
	   }
	
	}
	
	public static PedidoModel buscaPedido(Integer id) {
		for(PedidoModel pm: listaPedido) {
			if(id.equals(pm.getIdPedido())){
				return pm;
			}
		}
		return null;
	}
	
	public static boolean existePedido(Integer id) {
		for (PedidoModel pm: listaPedido) {
			if(id.equals(pm.getIdPedido())){
				return true;
			}
		}
		
		return false;
	}
	
	
}