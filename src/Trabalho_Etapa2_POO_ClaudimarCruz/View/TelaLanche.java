package Trabalho_Etapa2_POO_ClaudimarCruz.View;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;

public class TelaLanche extends JFrame {
	
	private static final long serialVersion = 1L;

	private JPanel contentPane;
	private JTextField textField_id;
	private JTextField textField_nome;
	private JTextField textField_venda;
	private JTextField textField_data;
	private JTextField textField_peso;
	private JTextField textField_pao;
	private JTextField textField_recheio;
	private JTextField textField_molho;
	
	JButton btnNewButton_lanche;

	/**
	 * Create the frame.
	 */
	public TelaLanche() {
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
		
		JLabel lblNewLabel = new JLabel("Lanche");
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
		
		JLabel lblNewLabel_1_1_1_1_1_1_1 = new JLabel("Tipo de Pão");
		lblNewLabel_1_1_1_1_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_1_1_1_1_1_1_1.setBounds(44, 170, 119, 14);
		panel_1.add(lblNewLabel_1_1_1_1_1_1_1);
		
		textField_pao = new JTextField();
		textField_pao.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textField_pao.setColumns(10);
		textField_pao.setBounds(183, 167, 126, 20);
		panel_1.add(textField_pao);
		
		
		JLabel lblNewLabel_1_1_1_1_1_1_1_1 = new JLabel("Recheio");
		lblNewLabel_1_1_1_1_1_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_1_1_1_1_1_1_1_1.setBounds(44, 195, 119, 14);
		panel_1.add(lblNewLabel_1_1_1_1_1_1_1_1);
		
		textField_recheio = new JTextField();
		textField_recheio.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textField_recheio.setColumns(10);
		textField_recheio.setBounds(183, 192, 126, 20);
		panel_1.add(textField_recheio);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("Molho");
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_1_1_1_1_1_1.setBounds(44, 220, 119, 14);
		panel_1.add(lblNewLabel_1_1_1_1_1_1);
		
		textField_molho = new JTextField();
		textField_molho.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textField_molho.setColumns(10);
		textField_molho.setBounds(183, 218, 126, 22);
		panel_1.add(textField_molho);
	
		btnNewButton_lanche = new JButton("Confirmar");
		btnNewButton_lanche.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnNewButton_lanche.setBounds(165, 300, 119, 23);
		panel_1.add(btnNewButton_lanche);
		

		
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
	
	
	public String getPao() {
		return textField_pao.getText();
	}
	
	public String getRecheio() {
		return textField_recheio.getText();
	}
	
	public String getMolho() {
		return textField_molho.getText();
	}
	
	
	public void setBotaoBehaviorLanche(ActionListener botaoBehaviorLanche) {
		btnNewButton_lanche.addActionListener(botaoBehaviorLanche);
	}

	
}
