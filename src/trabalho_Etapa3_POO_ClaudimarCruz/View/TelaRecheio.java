package trabalho_Etapa3_POO_ClaudimarCruz.View;

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

public class TelaRecheio extends JFrame {
	
	private static final long serialVersion = 1L;

	private JPanel contentPane;
	private JTextField textField_id;
	private JTextField textField_nome;
	private JTextField textField_valor;
	
	
	JButton btnNewButton_recheio;
	
	/**
	 * Create the frame.
	 */
	public TelaRecheio() {
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
		
		JLabel lblNewLabel = new JLabel("Novo Recheio");
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
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Valor");
		lblNewLabel_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_1_1_1.setBounds(44, 92, 119, 14);
		panel_1.add(lblNewLabel_1_1_1);
		
		textField_valor = new JTextField();
		textField_valor.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textField_valor.setColumns(10);
		textField_valor.setBounds(183, 89, 126, 20);
		panel_1.add(textField_valor);
		
		
		btnNewButton_recheio = new JButton("Confirmar");
		btnNewButton_recheio.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnNewButton_recheio.setBounds(165, 300, 119, 23);
		panel_1.add(btnNewButton_recheio);
		
	}
	
	public String getID() {
		return textField_id.getText();
	}

	public String getNome() {
		return textField_nome.getText();
	}

	public String getValorVenda() {
		return textField_valor.getText();
	}

	

	public void setBotaoBehaviorRecheio(ActionListener botaoBehaviorRecheio) {
		btnNewButton_recheio.addActionListener(botaoBehaviorRecheio);
	}

	
}
