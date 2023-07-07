package trabalho_Etapa3_POO_ClaudimarCruz.View;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;

public class TelaInicial {

	private JFrame frame;
	
	
	JButton btn_pizza;
	JButton btn_lanche;
	JButton btn_salgado;
	JButton btn_func;
	JButton btn_cliente;
	JButton btn_pedido;
	JButton btn_pagamento;

	/**
	 * Create the application.
	 */
	public TelaInicial() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(165, 42, 42));
		frame.setBounds(100, 100, 979, 564);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(253, 245, 230));
		panel.setForeground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 964, 97);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LANCHONETE QUASE TRÊS LANCHES");
		lblNewLabel.setBounds(0, 0, 964, 97);
		panel.add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.ITALIC, 30));
		lblNewLabel.setForeground(new Color(165, 42, 42));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(253, 245, 230));
		panel_1.setBounds(10, 108, 943, 406);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNovoPrato = new JLabel("Novo Prato");
		lblNovoPrato.setHorizontalAlignment(SwingConstants.CENTER);
		lblNovoPrato.setForeground(new Color(165, 42, 42));
		lblNovoPrato.setFont(new Font("Times New Roman", Font.ITALIC, 30));
		lblNovoPrato.setBounds(-26, 35, 288, 43);
		panel_1.add(lblNovoPrato);
		
		
		btn_pizza = new JButton("Pizza");
		btn_pizza.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btn_pizza.setForeground(new Color(253, 245, 230));
		btn_pizza.setBackground(new Color(165, 42, 42));
		btn_pizza.setBounds(48, 102, 128, 23);
		panel_1.add(btn_pizza);
		
		btn_lanche = new JButton("Lanche");
		btn_lanche.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btn_lanche.setForeground(new Color(253, 245, 230));
		btn_lanche.setBackground(new Color(165, 42, 42));
		btn_lanche.setBounds(48, 199, 128, 23);
		panel_1.add(btn_lanche);
		
	
		btn_salgado = new JButton("Salgado");
		btn_salgado.setForeground(new Color(253, 245, 230));
		btn_salgado.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btn_salgado.setBackground(new Color(165, 42, 42));
		btn_salgado.setBounds(48, 153, 128, 23);
		panel_1.add(btn_salgado);
		
		JLabel lblNovoCadastro_1 = new JLabel("Novo Cadastro");
		lblNovoCadastro_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNovoCadastro_1.setForeground(new Color(165, 42, 42));
		lblNovoCadastro_1.setFont(new Font("Times New Roman", Font.ITALIC, 30));
		lblNovoCadastro_1.setBounds(213, 35, 288, 43);
		panel_1.add(lblNovoCadastro_1);
		
		btn_cliente = new JButton("Cliente");
		btn_cliente.setForeground(new Color(253, 245, 230));
		btn_cliente.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btn_cliente.setBackground(new Color(165, 42, 42));
		btn_cliente.setBounds(278, 102, 128, 23);
		panel_1.add(btn_cliente);
		
		btn_func = new JButton("Funcionário");
		btn_func.setForeground(new Color(253, 245, 230));
		btn_func.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		btn_func.setBackground(new Color(165, 42, 42));
		btn_func.setBounds(278, 153, 128, 23);
		panel_1.add(btn_func);
		
		JLabel lblNovoCadastro = new JLabel("Pedido");
		lblNovoCadastro.setHorizontalAlignment(SwingConstants.CENTER);
		lblNovoCadastro.setForeground(new Color(165, 42, 42));
		lblNovoCadastro.setFont(new Font("Times New Roman", Font.ITALIC, 30));
		lblNovoCadastro.setBounds(449, 35, 288, 43);
		panel_1.add(lblNovoCadastro);
		
		 btn_pedido = new JButton("Novo Pedido");
		 btn_pedido.setForeground(new Color(253, 245, 230));
		 btn_pedido.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		 btn_pedido.setBackground(new Color(165, 42, 42));
		 btn_pedido.setBounds(524, 104, 148, 23);
		panel_1.add(btn_pedido);
		
		
		JLabel lblPagamento = new JLabel("Pagamento");
		lblPagamento.setHorizontalAlignment(SwingConstants.CENTER);
		lblPagamento.setForeground(new Color(165, 42, 42));
		lblPagamento.setFont(new Font("Times New Roman", Font.ITALIC, 30));
		lblPagamento.setBounds(671, 35, 288, 43);
		panel_1.add(lblPagamento);
		
		
		btn_pagamento = new JButton("Pagamento");
		btn_pagamento.setForeground(new Color(253, 245, 230));
		btn_pagamento.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btn_pagamento.setBackground(new Color(165, 42, 42));
		btn_pagamento.setBounds(747, 104, 128, 23);
		panel_1.add(btn_pagamento);
	}
	
	public void adicionarEventoBotaoPizza(ActionListener al) {
		btn_pizza.addActionListener(al);
	}
	
	public void adicionarEventoBotaoLanche(ActionListener al) {
		btn_lanche.addActionListener(al);
	}
	
	public void adicionarEventoBotaoSalgado(ActionListener al) {
		btn_salgado.addActionListener(al);
	}
	
	public void adicionarEventoBotaoFunc(ActionListener al) {
		btn_func.addActionListener(al);
	}
	
	public void adicionarEventoBotaoCliente(ActionListener al) {
		btn_cliente.addActionListener(al);
	}
	
	public void adicionarEventoBotaoPedido(ActionListener al) {
		btn_pedido.addActionListener(al);
	}
	
	public void adicionarEventoBotaoPagamento(ActionListener al) {
		btn_pagamento.addActionListener(al);
	}
}
