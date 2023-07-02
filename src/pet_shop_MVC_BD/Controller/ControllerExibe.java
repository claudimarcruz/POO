package pet_shop_MVC_BD.Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import pet_shop_MVC_BD.Conexao.Conexao;
import pet_shop_MVC_BD.Model.ExibeDAO;
import pet_shop_MVC_BD.PDF.GerarPDF;
import pet_shop_MVC_BD.View.ViewExibe;

public class ControllerExibe{
	ViewExibe cadExibe;
	String titulo = "######### Relatório Pet Shop #########";
	String localPdf = "D:\\testePDF\\proprietario1.pdf";
	
	public ControllerExibe(ViewExibe cadastroExibe) {
		cadExibe = cadastroExibe;
		
		cadastroExibe.setBotaoBehaviorGerarPdf(new BotaoBehaviorGerarPdf());
	}
	
	class BotaoBehaviorGerarPdf implements ActionListener{
		@SuppressWarnings("static-access")
		@Override
		
		public void actionPerformed(ActionEvent e) {
			
	    	Integer cpf = null;

	    	try {
	    		cpf = Integer.parseInt(cadExibe.get_text_cpf_prop());
	    	}catch(Exception ex) {
	    		JOptionPane.showMessageDialog(null, " ERRO! - ID não numérico ");
	    	}
	        	
		    Conexao conexao = new Conexao();
		    conexao.conectarBanco();
		    ExibeDAO exibeDAO = new ExibeDAO();
		    
		    try {
		    	String conteudo1 = exibeDAO.selectCadastroCao(cpf);
		    	String conteudo2 = exibeDAO.selectCadastroGato(cpf);
		    	String conteudo3 = exibeDAO.selectCadastroPas(cpf);
		    	GerarPDF.gerarPdf(titulo, conteudo1, conteudo2, conteudo3, localPdf);
			} catch (SQLException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}

//		    try {
//		    	GerarPDF.gerarPdf(titulo, conteudo, localPdf);
//				} catch (SQLException e1) {
//						// TODO Auto-generated catch block
//						e1.printStackTrace();
//					}
		     
	    }
	}
	
}
