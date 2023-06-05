package Trabalho_Etapa2_POO_ClaudimarCruz.View;

import java.awt.EventQueue;

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

public class TelaFuncionario extends JFrame {
	
	private static final long serialVersion = 1L;

	private JPanel contentPane;
	private JTextField textField_codigo;
	private JTextField textField_nome;
	private JTextField textField_cpf;
	private JTextField textField_endereco;
	private JTextField textField_telefone1;
	private JTextField textField_telefone2;
	private JTextField textField_salario;
	private JTextField textField_cargo;
	
	JButton btnNewButton_func;

	/**
	 * Create the frame.
	 */
	public TelaFuncionario() {
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
		
		JLabel lblNewLabel = new JLabel("Cadastro Funcionário");
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
		
		JLabel lblNewLabel_1 = new JLabel("Código");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(44, 42, 46, 14);
		panel_1.add(lblNewLabel_1);
		
		textField_codigo = new JTextField();
		textField_codigo.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textField_codigo.setBounds(183, 39, 126, 20);
		panel_1.add(textField_codigo);
		textField_codigo.setColumns(10);
		
		
		
		JLabel lblNewLabel_1_1 = new JLabel("Nome");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(44, 67, 46, 14);
		panel_1.add(lblNewLabel_1_1);
		
		textField_nome = new JTextField();
		textField_nome.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textField_nome.setColumns(10);
		textField_nome.setBounds(183, 64, 126, 20);
		panel_1.add(textField_nome);
		
		
		JLabel lblNewLabel_1_1_1 = new JLabel("CPF");
		lblNewLabel_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_1_1_1.setBounds(44, 92, 119, 14);
		panel_1.add(lblNewLabel_1_1_1);
		
		textField_cpf = new JTextField();
		textField_cpf.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textField_cpf.setColumns(10);
		textField_cpf.setBounds(183, 89, 126, 20);
		panel_1.add(textField_cpf);
		
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Endereço");
		lblNewLabel_1_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_1_1_1_1.setBounds(44, 117, 139, 14);
		panel_1.add(lblNewLabel_1_1_1_1);
		
		textField_endereco = new JTextField();
		textField_endereco .setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textField_endereco .setColumns(10);
		textField_endereco .setBounds(183, 114, 126, 20);
		panel_1.add(textField_endereco );
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Telefone 1");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_1_1_1_1_1.setBounds(44, 142, 139, 17);
		panel_1.add(lblNewLabel_1_1_1_1_1);
		
		textField_telefone1 = new JTextField();
		textField_telefone1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textField_telefone1.setColumns(10);
		textField_telefone1.setBounds(183, 140, 126, 20);
		panel_1.add(textField_telefone1);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("Telefone 2");
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_1_1_1_1_1_1.setBounds(44, 170, 119, 14);
		panel_1.add(lblNewLabel_1_1_1_1_1_1);
		
		textField_telefone2 = new JTextField();
		textField_telefone2.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textField_telefone2.setColumns(10);
		textField_telefone2.setBounds(183, 167, 126, 20);
		panel_1.add(textField_telefone2);
		
		
		JLabel lblNewLabel_1_1_1_1_1_1_1_1 = new JLabel("Salário");
		lblNewLabel_1_1_1_1_1_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_1_1_1_1_1_1_1_1.setBounds(44, 195, 119, 14);
		panel_1.add(lblNewLabel_1_1_1_1_1_1_1_1);
		
		textField_salario = new JTextField();
		textField_salario .setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textField_salario .setColumns(10);
		textField_salario .setBounds(183, 192, 126, 20);
		panel_1.add(textField_salario);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1 = new JLabel("Cargo");
		lblNewLabel_1_1_1_1_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_1_1_1_1_1_1_1.setBounds(44, 220, 119, 14);
		panel_1.add(lblNewLabel_1_1_1_1_1_1_1);
		
		textField_cargo = new JTextField();
		textField_cargo.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textField_cargo.setColumns(10);
		textField_cargo.setBounds(183, 218, 126, 22);
		panel_1.add(textField_cargo);
		
	
		btnNewButton_func = new JButton("Confirmar");
		btnNewButton_func.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnNewButton_func.setBounds(165, 300, 119, 23);
		panel_1.add(btnNewButton_func);
		

		
	}
	
	public String getCodigo() {
		return textField_codigo.getText();
	}

	public String getNome() {
		return textField_nome.getText();
	}

	public String getValorCpf() {
		return textField_cpf.getText();
	}

	public String getEnd() {
		return textField_endereco.getText();
	}
	
	public String getTel1() {
		return textField_telefone1.getText();
	}
	
	public String getTel2() {
		return textField_telefone2.getText();
	}
	
	public String getSalario() {
		return textField_salario.getText();
	}
	
	public String getCargo() {
		return textField_cargo.getText();
	}
	
	public void setBotaoBehaviorFunc(ActionListener botaoBehaviorFunc) {
		btnNewButton_func.addActionListener(botaoBehaviorFunc);
	}

	
}