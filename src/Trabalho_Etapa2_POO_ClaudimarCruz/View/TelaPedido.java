package Trabalho_Etapa2_POO_ClaudimarCruz.View;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.util.List;

import Trabalho_Etapa2_POO_ClaudimarCruz.Controller.ClienteController;
import Trabalho_Etapa2_POO_ClaudimarCruz.Controller.FuncionarioController;
import Trabalho_Etapa2_POO_ClaudimarCruz.Controller.LancheController;
import Trabalho_Etapa2_POO_ClaudimarCruz.Controller.PizzaController;
import Trabalho_Etapa2_POO_ClaudimarCruz.Controller.SalgadoController;
import Trabalho_Etapa2_POO_ClaudimarCruz.Model.ClienteModel;
import Trabalho_Etapa2_POO_ClaudimarCruz.Model.FuncionarioModel;
import Trabalho_Etapa2_POO_ClaudimarCruz.Model.LancheModel;
import Trabalho_Etapa2_POO_ClaudimarCruz.Model.PizzaModel;
import Trabalho_Etapa2_POO_ClaudimarCruz.Model.SalgadinhoModel;

public class TelaPedido extends JFrame {
	
	private static final long serialVersion = 1L;

	private JPanel contentPane;
	private JTextField textField_id_pedido;
	//private JTextField textField_id_cliente;
	//private JTextField textField_id_func;
	private JTextField textField_taxa;
	//private JTextField textField_itens;
	private JTextField textField_quantidade;
	private JTextField textField_valor_total;
	
	JButton btnNewButton_pedido;
	
	@SuppressWarnings("rawtypes")
	JComboBox comboBox_cliente;
	@SuppressWarnings("rawtypes")
	JComboBox comboBox_func; 
	@SuppressWarnings("rawtypes")
	JComboBox comboBox_prato;
	
	/**
	 * Create the frame.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public TelaPedido() {
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
		
		JLabel lblNewLabel = new JLabel("Pedido");
		lblNewLabel.setBounds(10, 0, 968, 97);
		panel.add(lblNewLabel);
		lblNewLabel.setForeground(new Color(165, 42, 42));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.ITALIC, 30));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(272, 108, 426, 405);
		contentPane.add(panel_1);
		panel_1.setBackground(new Color(253, 245, 230));
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Id");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(44, 42, 46, 14);
		panel_1.add(lblNewLabel_1);
		
		textField_id_pedido = new JTextField();
		textField_id_pedido.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textField_id_pedido.setBounds(183, 39, 126, 20);
		panel_1.add(textField_id_pedido);
		textField_id_pedido.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Cliente");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(44, 67, 46, 14);
		panel_1.add(lblNewLabel_1_1);
		 

		comboBox_cliente = new JComboBox();
		 comboBox_cliente.setBounds(183, 64, 126, 20);
		
		 comboBox_cliente.addAncestorListener(new AncestorListener() {
			public void ancestorAdded(AncestorEvent event) {
				
				ClienteController cliente = new ClienteController();
				
				List<ClienteModel> listaCliente = cliente.getLista();
				
				 comboBox_cliente.removeAll();
				
				for(ClienteModel cm : listaCliente) {
					 comboBox_cliente.setSelectedItem(null);
					 comboBox_cliente.addItem(cm);
				}
			}
			public void ancestorMoved(AncestorEvent event) {
			}
			public void ancestorRemoved(AncestorEvent event) {
			}
		});
		panel_1.add( comboBox_cliente);
		
		
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Funcionario");
		lblNewLabel_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_1_1_1.setBounds(44, 92, 119, 14);
		panel_1.add(lblNewLabel_1_1_1);
		
	
		comboBox_func = new JComboBox();
		comboBox_func.setBounds(183, 89, 126, 20);
		
		comboBox_func.addAncestorListener(new AncestorListener() {
			public void ancestorAdded(AncestorEvent event) {
				
			FuncionarioController func = new FuncionarioController();
				
			List<FuncionarioModel> listaFuncionario = func.getLista();
				
			comboBox_func.removeAll();
				
				for(FuncionarioModel fm : listaFuncionario) {
					comboBox_func.setSelectedItem(null);
					comboBox_func.addItem(fm);
				}
			}
			public void ancestorMoved(AncestorEvent event) {
			}
			public void ancestorRemoved(AncestorEvent event) {
			}
		});
		panel_1.add(comboBox_func);
		
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Taxa de Serviço");
		lblNewLabel_1_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_1_1_1_1.setBounds(44, 117, 139, 14);
		panel_1.add(lblNewLabel_1_1_1_1);
		
		textField_taxa = new JTextField();
		textField_taxa.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textField_taxa.setColumns(10);
		textField_taxa.setBounds(183, 114, 126, 20);
		panel_1.add(textField_taxa);
		
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Prato Consumido");
		 lblNewLabel_1_1_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		 lblNewLabel_1_1_1_1_1.setBounds(44, 142, 139, 17);
		panel_1.add( lblNewLabel_1_1_1_1_1);
		
		
		comboBox_prato = new JComboBox();
		comboBox_prato .setBounds(183, 140, 126, 20);
		
		comboBox_prato .addAncestorListener(new AncestorListener() {
			public void ancestorAdded(AncestorEvent event) {
				
				PizzaController pizza = new PizzaController();
				SalgadoController salgado = new SalgadoController();
				LancheController lanche = new LancheController();
				
				List<PizzaModel> listaPizza = pizza.getLista();
				List<SalgadinhoModel> listaSalgado = salgado.getLista();
				List<LancheModel> listaLanche = lanche.getLista();
				
				comboBox_prato.removeAll();
				
				for(PizzaModel pm : listaPizza){
					comboBox_prato.setSelectedItem(null);
					comboBox_prato.addItem(pm);
				}
				
				for(SalgadinhoModel sm : listaSalgado){
					comboBox_prato.setSelectedItem(null);
					comboBox_prato.addItem(sm);
				}
				
				for(LancheModel lm : listaLanche){
					comboBox_prato.setSelectedItem(null);
					comboBox_prato.addItem(lm);
				}
							
	
			}
			public void ancestorMoved(AncestorEvent event) {
			}
			public void ancestorRemoved(AncestorEvent event) {
			}
		});
		panel_1.add(comboBox_prato );
		
		
		JLabel lblNewLabel_6= new JLabel("Quantidade");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_6.setBounds(44, 170, 119, 14);
		panel_1.add(lblNewLabel_6);
		
		textField_quantidade = new JTextField();
		textField_quantidade.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textField_quantidade.setColumns(10);
		textField_quantidade.setBounds(183, 167, 126, 20);
		panel_1.add(textField_quantidade);
		
		
		JLabel lblNewLabel_7 = new JLabel("Valor Total");
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_7.setBounds(44, 195, 119, 14);
		panel_1.add(lblNewLabel_7);
		
		textField_valor_total = new JTextField();
		textField_valor_total .setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textField_valor_total .setColumns(10);
		textField_valor_total .setBounds(183, 192, 126, 20);
		panel_1.add(textField_valor_total );
		

	
		btnNewButton_pedido= new JButton("Confirmar");
		btnNewButton_pedido.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnNewButton_pedido.setBounds(165, 300, 119, 23);
		panel_1.add(btnNewButton_pedido);
		

		
	}
	
	public String getID() {
		return textField_id_pedido.getText();
	}
	
	public String getNomeCliente() {
		return comboBox_cliente.getSelectedItem().toString();
	}

	public String getNomeFunc() {
		return comboBox_func.getSelectedItem().toString();
	}


	public String getTaxa() {
		return textField_taxa.getText();
	}
	
	public String getPratoCons() {
		return comboBox_prato.getSelectedItem().toString();
	}
	
	public String getQuant() {
		return textField_quantidade.getText();
	}
	
	public String getValorTotal() {
		return textField_valor_total.getText();
	}
	
	
	public void setBotaoBehaviorPedido(ActionListener botaoBehaviorPedido) {
		btnNewButton_pedido.addActionListener(botaoBehaviorPedido);
	}
	
	

	
}