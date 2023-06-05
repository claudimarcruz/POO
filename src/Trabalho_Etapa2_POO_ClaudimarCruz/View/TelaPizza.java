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

import Trabalho_Etapa2_POO_ClaudimarCruz.Controller.BordaController;
import Trabalho_Etapa2_POO_ClaudimarCruz.Controller.MolhoController;
import Trabalho_Etapa2_POO_ClaudimarCruz.Controller.RecheioController;
import Trabalho_Etapa2_POO_ClaudimarCruz.Model.BordaModel;
import Trabalho_Etapa2_POO_ClaudimarCruz.Model.MolhoModel;
import Trabalho_Etapa2_POO_ClaudimarCruz.Model.RecheioModel;



public class TelaPizza extends JFrame {
	
	private static final long serialVersion = 1L;

	private JPanel contentPane;
	private JTextField textField_id;
	private JTextField textField_nome;
	private JTextField textField_venda;
	private JTextField textField_data;
	private JTextField textField_peso;
	//private JTextField textField_molho;
	//private JTextField textField_borda;
	
	JButton btnNewButton_pizza;
	JButton btn_molho;
	JButton btn_recheio;
	JButton btn_borda;
	
	@SuppressWarnings("rawtypes")
	JComboBox comboBox_molho;
	JComboBox comboBox_borda;
	JComboBox comboBox_recheio1;
	JComboBox comboBox_recheio2;


	/**
	 * Create the frame.
	 */
	@SuppressWarnings("unchecked")
	public TelaPizza() {
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
		
		JLabel lblNewLabel = new JLabel("Pizza");
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
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(44, 42, 46, 14);
		panel_1.add(lblNewLabel_1);
		
		textField_id = new JTextField();
		textField_id.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textField_id.setBounds(183, 39, 126, 20);
		panel_1.add(textField_id);
		textField_id.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Nome");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(44, 67, 46, 14);
		panel_1.add(lblNewLabel_1_1);
		
		textField_nome = new JTextField();
		textField_nome.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textField_nome.setColumns(10);
		textField_nome.setBounds(183, 64, 126, 20);
		panel_1.add(textField_nome);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Preço de Venda");
		lblNewLabel_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_1_1_1.setBounds(44, 92, 119, 14);
		panel_1.add(lblNewLabel_1_1_1);
		
		textField_venda = new JTextField();
		textField_venda.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textField_venda.setColumns(10);
		textField_venda.setBounds(183, 89, 126, 20);
		panel_1.add(textField_venda);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Data de Validade");
		lblNewLabel_1_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_1_1_1_1.setBounds(44, 117, 139, 14);
		panel_1.add(lblNewLabel_1_1_1_1);
		
		textField_data = new JTextField();
		textField_data.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textField_data.setColumns(10);
		textField_data.setBounds(183, 114, 126, 20);
		panel_1.add(textField_data);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Peso");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_1_1_1_1_1.setBounds(44, 142, 139, 17);
		panel_1.add(lblNewLabel_1_1_1_1_1);
		
		textField_peso = new JTextField();
		textField_peso.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textField_peso.setColumns(10);
		textField_peso.setBounds(183, 140, 126, 20);
		panel_1.add(textField_peso);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("Molho");
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_1_1_1_1_1_1.setBounds(44, 170, 119, 14);
		panel_1.add(lblNewLabel_1_1_1_1_1_1);
		
	
		//@SuppressWarnings("rawtypes")
		comboBox_molho = new JComboBox();
		comboBox_molho.setBounds(183, 167, 126, 20);
		
		comboBox_molho.addAncestorListener(new AncestorListener() {
			
			public void ancestorAdded(AncestorEvent event) {
				
				MolhoController molho = new MolhoController();
				
				List<MolhoModel> listaMolho = molho.getLista();
				
				comboBox_molho.removeAll();
				
				for(MolhoModel mm : listaMolho) {
					comboBox_molho.setSelectedItem(null);
					comboBox_molho.addItem(mm);
				}
				}
			public void ancestorMoved(AncestorEvent event) {
			}
			public void ancestorRemoved(AncestorEvent event) {
			}
		});
		panel_1.add(comboBox_molho);
		
		
		JLabel lblNewLabel_1_1_1_1_1_1_1 = new JLabel("Borda");
		lblNewLabel_1_1_1_1_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_1_1_1_1_1_1_1.setBounds(44, 195, 119, 14);
		panel_1.add(lblNewLabel_1_1_1_1_1_1_1);
		
		//@SuppressWarnings("rawtypes")
		comboBox_borda = new JComboBox();
		comboBox_borda.setBounds(183, 192, 126, 20);
		
		comboBox_borda.addAncestorListener(new AncestorListener() {
			
			public void ancestorAdded(AncestorEvent event) {
				
				BordaController borda = new BordaController();
				
				List<BordaModel> listaBorda = borda.getLista();
				
				comboBox_borda.removeAll();
				
				for(BordaModel bm : listaBorda) {
					comboBox_borda.setSelectedItem(null);
					comboBox_borda.addItem(bm);
				}
			}
			public void ancestorMoved(AncestorEvent event) {
			}
			public void ancestorRemoved(AncestorEvent event) {
			}
		});
		panel_1.add(comboBox_borda);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1_1 = new JLabel("Recheio 1");
		lblNewLabel_1_1_1_1_1_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_1_1_1_1_1_1_1_1.setBounds(44, 220, 119, 14);
		panel_1.add(lblNewLabel_1_1_1_1_1_1_1_1);
		
		//@SuppressWarnings("rawtypes")
		comboBox_recheio1 = new JComboBox();
		comboBox_recheio1.setBounds(183, 218, 126, 22);
		
		comboBox_recheio1.addAncestorListener(new AncestorListener() {
			
			public void ancestorAdded(AncestorEvent event) {
				
				RecheioController recheio = new RecheioController();
				
				List<RecheioModel> listaRecheio = recheio.getLista();
				
				 comboBox_recheio1.removeAll();
				
				for(RecheioModel rm : listaRecheio) {
					 comboBox_recheio1.setSelectedItem(null);
					 comboBox_recheio1.addItem(rm);
				}
			}
			public void ancestorMoved(AncestorEvent event) {
			}
			public void ancestorRemoved(AncestorEvent event) {
			}
		});
		panel_1.add(comboBox_recheio1);
		
		
		JLabel lblNewLabel_1_1_1_1_1_1_1_1_1 = new JLabel("Recheio 2");
		lblNewLabel_1_1_1_1_1_1_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_1_1_1_1_1_1_1_1_1.setBounds(44, 245, 119, 14);
		panel_1.add(lblNewLabel_1_1_1_1_1_1_1_1_1);
		
		//@SuppressWarnings("rawtypes")
		comboBox_recheio2 = new JComboBox();
		 comboBox_recheio2.setBounds(183, 245, 126, 22);
		
		 comboBox_recheio2.addAncestorListener(new AncestorListener() {
			
			public void ancestorAdded(AncestorEvent event) {
				
				RecheioController recheio = new RecheioController();
				
				List<RecheioModel> listaRecheio = recheio.getLista();
				
				 comboBox_recheio2.removeAll();
				
				for(RecheioModel rm : listaRecheio) {
					 comboBox_recheio2.setSelectedItem(null);
					 comboBox_recheio2.addItem(rm);
				}
			}
			public void ancestorMoved(AncestorEvent event) {
			}
			public void ancestorRemoved(AncestorEvent event) {
			}
		});
		panel_1.add(comboBox_recheio2);
		//*****************
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(new Color(253, 245, 230));
		panel_2.setBounds(10, 211, 252, 235);
		contentPane.add(panel_2);
		
		JLabel lblNewLabe2 = new JLabel("Criar Novo(a)");
		lblNewLabe2.setBounds(10, 0, 232, 97);
		panel_2.add(lblNewLabe2);
		lblNewLabe2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabe2.setForeground(new Color(165, 42, 42));
		lblNewLabe2.setFont(new Font("Times New Roman", Font.ITALIC, 25));
		
		btn_molho = new JButton("Molho");
		btn_molho.setBounds(59, 84, 128, 23);
		btn_molho.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btn_molho.setForeground(new Color(253, 245, 230));
		btn_molho.setBackground(new Color(165, 42, 42));
		panel_2.add(btn_molho);
		
		btn_recheio = new JButton("Recheio");
		btn_recheio.setForeground(new Color(253, 245, 230));
		btn_recheio.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btn_recheio.setBackground(new Color(165, 42, 42));
		btn_recheio.setBounds(59, 128, 128, 23);
		panel_2.add(btn_recheio);
		
		btn_borda = new JButton("Borda");
		btn_borda.setForeground(new Color(253, 245, 230));
		btn_borda.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btn_borda.setBackground(new Color(165, 42, 42));
		btn_borda.setBounds(59, 173, 128, 23);
		panel_2.add(btn_borda);
		

		btnNewButton_pizza = new JButton("Confirmar");
		btnNewButton_pizza.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnNewButton_pizza.setBounds(165, 300, 119, 23);
		panel_1.add(btnNewButton_pizza);
		
		
		

		
	}
	
	public String getID() {
		return textField_id.getText();
	}

	public String getNome() {
		return textField_nome.getText();
	}

	public String getValorVenda() {
		return textField_venda.getText();
	}

	public String getData() {
		return textField_data.getText();
	}
	
	public String getPeso() {
		return textField_peso.getText();
	}
	
	
	public String getMolho() {
		return comboBox_molho.getSelectedItem().toString();   
	}
	
	public String getBorda() {
		return comboBox_borda.getSelectedItem().toString(); 
	}
	
	public String getRecheio1() {
		return comboBox_recheio1.getSelectedItem().toString(); 
	}
	
	public String getRecheio2() {
		return comboBox_recheio2.getSelectedItem().toString(); 
	}
	
	public void adicionarEventoBotaoMolho(ActionListener al) {
		btn_molho.addActionListener(al);
	}
	
	public void adicionarEventoBotaoRecheio(ActionListener al) {
		btn_recheio.addActionListener(al);
	}
	
	public void adicionarEventoBotaoBorda(ActionListener al) {
		btn_borda.addActionListener(al);
	}

	public void setBotaoBehaviorPizza(ActionListener botaoBehaviorPizza) {
		btnNewButton_pizza.addActionListener(botaoBehaviorPizza);
	}

	
}
