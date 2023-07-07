package trabalho_Etapa3_POO_ClaudimarCruz.View;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.File;
import java.sql.SQLException;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import com.itextpdf.io.exceptions.IOException;

import pet_shop_MVC_BD.Conexao.Conexao;
import trabalho_Etapa3_POO_ClaudimarCruz.Model.PedidoDAO;
import trabalho_Etapa3_POO_ClaudimarCruz.PDF.GerarPDF;

import javax.swing.JTextArea;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class TelaPagamento extends JFrame {
	
	@SuppressWarnings("unused")
	private static final long serialVersion = 1L;

	private JPanel contentPane;
	
	private JTextField textField_valor;
	
	JButton btn_pedido;
	JButton btn_pagamento;
	JButton btn_relatorio;
	JButton btn_visualizar;
	
	@SuppressWarnings("rawtypes")
	static JComboBox comboBox_pedido;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPagamento frame = new TelaPagamento();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	@SuppressWarnings("unchecked")
	public TelaPagamento() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 984, 563);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(165, 42, 42));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(253, 245, 230));
		panel.setBounds(0, 0, 968, 97);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Pagamento");
		lblNewLabel.setBounds(10, 0, 968, 97);
		panel.add(lblNewLabel);
		lblNewLabel.setForeground(new Color(165, 42, 42));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.ITALIC, 30));
		
		JPanel panel_pedido = new JPanel();
		panel_pedido.setBounds(10, 108, 280, 405);
		contentPane.add(panel_pedido);
		panel_pedido.setBackground(new Color(253, 245, 230));
		panel_pedido.setLayout(null);
		
		//**********************************************************
		
		JLabel lblNewLabe2 = new JLabel("Selecione o Pedido");
		lblNewLabe2.setBounds(0, 0, 280, 55);
		panel_pedido.add(lblNewLabe2);
		lblNewLabe2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabe2.setForeground(new Color(165, 42, 42));
		lblNewLabe2.setFont(new Font("Times New Roman", Font.ITALIC, 25));
		
		
		comboBox_pedido = new JComboBox();
		comboBox_pedido.setBounds(70, 105, 132, 20);
		comboBox_pedido.addItem("<Selecione>");
		comboBox_pedido.addAncestorListener(new AncestorListener() {
		    public void ancestorAdded(AncestorEvent event) {
		    	try {
		            PedidoDAO pedidoDAO = new PedidoDAO();
		            List<String> items = pedidoDAO.selectID();
		            for (String item : items) {
		            	
		                comboBox_pedido.addItem(item);
		            }
		            
		        } catch (SQLException e) {
		            e.printStackTrace();
		        }
		    }

			@Override
			public void ancestorRemoved(AncestorEvent event) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void ancestorMoved(AncestorEvent event) {
				// TODO Auto-generated method stub
				
			}
		});
		panel_pedido.add(comboBox_pedido);
		
		btn_pedido = new JButton("Confirmar");
		btn_pedido.setBounds(70, 190, 132, 23);
		panel_pedido.add(btn_pedido);
		btn_pedido.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		
		//*************************************************************
		
		JPanel panel_exibe = new JPanel();
		panel_exibe.setLayout(null);
		panel_exibe.setBackground(new Color(253, 245, 230));
		panel_exibe.setBounds(300, 108, 368, 405);
		contentPane.add(panel_exibe);
		
		JLabel lblNewLabe2_1 = new JLabel("Pedido");
		lblNewLabe2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabe2_1.setForeground(new Color(165, 42, 42));
		lblNewLabe2_1.setFont(new Font("Times New Roman", Font.ITALIC, 25));
		lblNewLabe2_1.setBounds(0, 0, 368, 49);
		panel_exibe.add(lblNewLabe2_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 52, 348, 342);
		panel_exibe.add(textArea);
		
		btn_pedido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String selectedItem = (String) comboBox_pedido.getSelectedItem();
				Integer idPedido = Integer.parseInt(selectedItem);
				PedidoDAO pedidoDAO = new PedidoDAO();
	            try {
					textArea.append(pedidoDAO.selectCadastro(idPedido));
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		
		//*********************************************************
		
		JPanel panel_pagamento = new JPanel();
		panel_pagamento.setLayout(null);
		panel_pagamento.setBackground(new Color(253, 245, 230));
		panel_pagamento.setBounds(678, 108, 280, 200);
		contentPane.add(panel_pagamento);
		
		JLabel lblNewLabe2_2 = new JLabel("Realizar Pagamento");
		lblNewLabe2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabe2_2.setForeground(new Color(165, 42, 42));
		lblNewLabe2_2.setFont(new Font("Times New Roman", Font.ITALIC, 25));
		lblNewLabe2_2.setBounds(0, 0, 280, 50);
		panel_pagamento.add(lblNewLabe2_2);
		
		
		JLabel lblNewLabel_1_1_1_1_1_2 = new JLabel("Valor Recebido");
		lblNewLabel_1_1_1_1_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_1_1_1_1_1_2.setBounds(10, 56, 139, 17);
		panel_pagamento.add(lblNewLabel_1_1_1_1_1_2);
		
		textField_valor = new JTextField();
		textField_valor.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textField_valor.setColumns(10);
		textField_valor.setBounds(159, 54, 107, 20);
		panel_pagamento.add(textField_valor);
		
		btn_pagamento = new JButton("Confirmar");
		btn_pagamento.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btn_pagamento.setBounds(89, 84, 107, 23);
		panel_pagamento.add(btn_pagamento);
		
		//*
		
		JLabel lblNewLabe2_2_2 = new JLabel("Status");
		lblNewLabe2_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabe2_2_2.setForeground(new Color(165, 42, 42));
		lblNewLabe2_2_2.setFont(new Font("Times New Roman", Font.ITALIC, 25));
		lblNewLabe2_2_2.setBounds(0, 105, 280, 50);
		panel_pagamento.add(lblNewLabe2_2_2);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(10, 150, 260, 50);
		panel_pagamento.add(textArea_1);
		
		btn_pagamento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PedidoDAO pedidoDAO = new PedidoDAO();
				String selectedItem = (String) comboBox_pedido.getSelectedItem();
				Integer idPedido = Integer.parseInt(selectedItem);
				String valorString = textField_valor.getText();
				double valorRecebido = Double.parseDouble(valorString);
				
	            try {
	            	double valorTotal = pedidoDAO.selectValorTotal(idPedido);
	            	double temTroco = valorRecebido - valorTotal;
	            	//double total = pedidoDAO.selectValorTotal(idPedido) + valorRecebido;
	            	if(valorRecebido < valorTotal) {
	            		textArea_1.append("Valor Insuficiente!");
	            		textArea_1.append("\n");
	            	}else if(valorRecebido == valorTotal) {
	            		//textArea_1.append(String.valueOf(valorTotal));
	            		textArea_1.append("Pagamento efetuado!!");
	            		textArea_1.append("\n");
	            	}else {
	            		textArea_1.append("Pagamento efetuado!!");
	            		textArea_1.append("\n");
	            		textArea_1.append("Troco restante: R$ ");
	            		textArea_1.append(String.valueOf(temTroco));
	            	}
	                
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		//***************************************************************
		
		JPanel panel_relatorio = new JPanel();
		panel_relatorio.setLayout(null);
		panel_relatorio.setBackground(new Color(253, 245, 230));
		panel_relatorio.setBounds(678, 319, 280, 194);
		contentPane.add(panel_relatorio);
		
		JLabel lblNewLabe2_2_1 = new JLabel("Gerar Relatório");
		lblNewLabe2_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabe2_2_1.setForeground(new Color(165, 42, 42));
		lblNewLabe2_2_1.setFont(new Font("Times New Roman", Font.ITALIC, 25));
		lblNewLabe2_2_1.setBounds(0, 0, 280, 43);
		panel_relatorio.add(lblNewLabe2_2_1);
		
		btn_relatorio = new JButton("Confirmar");
		btn_relatorio.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btn_relatorio.setBounds(71, 43, 132, 23);
		panel_relatorio.add(btn_relatorio);	
		
		JLabel lblNewLabe2_2_2_1 = new JLabel("Status");
		lblNewLabe2_2_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabe2_2_2_1.setForeground(new Color(165, 42, 42));
		lblNewLabe2_2_2_1.setFont(new Font("Times New Roman", Font.ITALIC, 25));
		lblNewLabe2_2_2_1.setBounds(0, 77, 280, 30);
		panel_relatorio.add(lblNewLabe2_2_2_1);
		
		JTextArea textArea_1_1 = new JTextArea();
		textArea_1_1.setBounds(10, 106, 260, 30);
		panel_relatorio.add(textArea_1_1);
		
		
		btn_relatorio.addActionListener(new ActionListener() {
			@SuppressWarnings("static-access")
			public void actionPerformed(ActionEvent e) {
				
				//*************************************************************
				String titulo = "######### Relatório Lanchonete #########";
				//*************************************************************
				String localPdf = "D:\\relatorio.pdf";
				
				Conexao conexao = new Conexao();
			    conexao.conectarBanco();
			    PedidoDAO pedidoDAO = new PedidoDAO();
			    
			    String selectedItem = (String) comboBox_pedido.getSelectedItem();
				Integer idPedido = Integer.parseInt(selectedItem);
	            try {
					GerarPDF.gerarPdf(titulo, pedidoDAO.selectCadastro(idPedido),localPdf);
					textArea_1_1.append("Documento gerado");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					textArea_1_1.append("Erro ao gerar documento");
				}
			}
		});;
		
		//***************************************************
		btn_visualizar = new JButton("Visualizar PDF");
		btn_visualizar.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btn_visualizar.setBounds(71, 147, 132, 23);
		panel_relatorio.add(btn_visualizar);
		
		btn_visualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
		            Desktop desktop = Desktop.getDesktop();
		            
		          //*************************************************************
		            File folder = new File("D:\\relatorio.pdf");
		          //*************************************************************
		             
		            desktop.open(folder);
		        } catch (IOException ex) {
		            ex.printStackTrace();
		        } catch (java.io.IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
	}
	
	public String getID() {
		return textField_valor.getText();
	}
	
	public String getMolho() {
		return comboBox_pedido.getSelectedItem().toString();   
	}
	
	public void adicionarEventoBotaoPedido(ActionListener al) {
		btn_pedido.addActionListener(al);
	}
	
	public void adicionarEventoBotaoPagamento(ActionListener al) {
		btn_pagamento.addActionListener(al);
	}
	
	public void adicionarEventoBotaoRelatorio(ActionListener al) {
		btn_relatorio.addActionListener(al);
	}
}
