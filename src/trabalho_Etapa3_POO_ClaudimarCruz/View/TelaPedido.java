package trabalho_Etapa3_POO_ClaudimarCruz.View;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;

import trabalho_Etapa3_POO_ClaudimarCruz.Conexao.ConexaoBanco;
import trabalho_Etapa3_POO_ClaudimarCruz.Controller.ClienteController;
import trabalho_Etapa3_POO_ClaudimarCruz.Controller.FuncionarioController;
import trabalho_Etapa3_POO_ClaudimarCruz.Controller.LancheController;
import trabalho_Etapa3_POO_ClaudimarCruz.Controller.PizzaController;
import trabalho_Etapa3_POO_ClaudimarCruz.Controller.SalgadoController;
import trabalho_Etapa3_POO_ClaudimarCruz.Model.ClienteDAO;
import trabalho_Etapa3_POO_ClaudimarCruz.Model.ClienteModel;
import trabalho_Etapa3_POO_ClaudimarCruz.Model.FuncionarioDAO;
import trabalho_Etapa3_POO_ClaudimarCruz.Model.FuncionarioModel;
import trabalho_Etapa3_POO_ClaudimarCruz.Model.LancheDAO;
import trabalho_Etapa3_POO_ClaudimarCruz.Model.LancheModel;
import trabalho_Etapa3_POO_ClaudimarCruz.Model.MolhoDAO;
import trabalho_Etapa3_POO_ClaudimarCruz.Model.MolhoModel;
import trabalho_Etapa3_POO_ClaudimarCruz.Model.PizzaDAO;
import trabalho_Etapa3_POO_ClaudimarCruz.Model.PizzaModel;
import trabalho_Etapa3_POO_ClaudimarCruz.Model.PratoModel;
import trabalho_Etapa3_POO_ClaudimarCruz.Model.SalgadinhoModel;
import trabalho_Etapa3_POO_ClaudimarCruz.Model.SalgadoDAO;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
	static JComboBox comboBox_cliente;
	@SuppressWarnings("rawtypes")
	static JComboBox comboBox_func; 
	//static JComboBox<PratoModel>comboBox_prato;
	@SuppressWarnings("rawtypes")
	static JComboBox comboBox_prato;
	
	/**
	 * Create the frame.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes", "static-access" })
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
		//comboBox_cliente.removeAll();
		//comboBox_cliente.setSelectedItem(null);
		comboBox_cliente.addItem("<Selecione>");
		comboBox_cliente.addAncestorListener(new AncestorListener() {
		    public void ancestorAdded(AncestorEvent event) {
		    	try {
		            ClienteDAO clienteDAO = new ClienteDAO();
		            List<String> items = clienteDAO.selectCadastro();
		            for (String item : items) {
		            	
		                comboBox_cliente.addItem(item);
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
		panel_1.add(comboBox_cliente);
		
		

		
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Funcionario");
		lblNewLabel_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_1_1_1.setBounds(44, 92, 119, 14);
		panel_1.add(lblNewLabel_1_1_1);
		
	
		comboBox_func = new JComboBox();
		comboBox_func.setBounds(183, 89, 126, 20);
		//comboBox_func.removeAll();
		//comboBox_func.setSelectedItem(null);
		comboBox_func.addItem("<Selecione>");
		comboBox_func.addAncestorListener(new AncestorListener() {
		    public void ancestorAdded(AncestorEvent event) {
		    	try {
		            FuncionarioDAO funcDAO = new FuncionarioDAO();
		            List<String> items = funcDAO.selectCadastro();
		            for (String item : items) {
		            	
		                comboBox_func.addItem(item);
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
		
		ConexaoBanco conexao = new ConexaoBanco();
		conexao.conectarBanco();
		
		
		comboBox_prato = new JComboBox();
		comboBox_prato .setBounds(183, 140, 126, 20);
		//comboBox_prato.setSelectedItem(null);
		comboBox_prato.addItem("<Selecione>");
		
		comboBox_prato.addAncestorListener(new AncestorListener() {
		    public void ancestorAdded(AncestorEvent event) {
		    	try {
		            LancheDAO lancheDAO = new LancheDAO();
		            List<String> items = lancheDAO.selectCadastro();
		            for (String item : items) {
		                comboBox_prato.addItem(item);
		            }
		            
		            
		            SalgadoDAO salgadoDAO = new SalgadoDAO();
		            List<String> items2 = salgadoDAO.selectCadastro();
		            for (String item2 : items2) {
		                comboBox_prato.addItem(item2);
		            }
		            
		            PizzaDAO pizzaDAO = new PizzaDAO();
		            List<String> items3 = pizzaDAO.selectCadastro();
		            for (String item3 : items3) {
		                comboBox_prato.addItem(item3);
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
		panel_1.add(comboBox_prato);
		
		

		
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
	
	public  static void atualizarComboCliente(ArrayList<ClienteModel> clientes){
		
		comboBox_cliente.setModel(new DefaultComboBoxModel<>(clientes.toArray(new ClienteModel[0])));
	}
	
	public  static void atualizarComboFunc(ArrayList<FuncionarioModel> funcs){
		
		comboBox_func.setModel(new DefaultComboBoxModel<>(funcs.toArray(new FuncionarioModel[0])));
	}
	
//	public  static void atualizarComboLanche(ArrayList<LancheModel> pratos){
//		
//		comboBox_prato.setModel(new DefaultComboBoxModel<>(pratos.toArray(new LancheModel[0])));
//	}
//	
//	public  static void atualizarComboSalgado(ArrayList<SalgadinhoModel> pratos){
//		
//		comboBox_prato.setModel(new DefaultComboBoxModel<>(pratos.toArray(new SalgadinhoModel[0])));
//	}
//	
//	


	
}