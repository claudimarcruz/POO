package pet_shop_MVC.View;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ViewExibe extends JFrame{
	
private static final long serialVersionUID = 1L;
	
	JTextField text_cpf_proprietario;
	
	JTextArea visorAnimal;
	
	JTextArea visorLista;

	JButton botaoExibeAnimal;
	
	JButton botaoExibeLista;

	public ViewExibe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setLayout(new BoxLayout(getContentPane(), BoxLayout.X_AXIS));
		setLayout(new FlowLayout());
		//setLayout((LayoutManager) new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
		//********************************************************
		
		JLabel label = new JLabel("Digite o CPF do proprietario >>>");
		add(label);
		add(new JLabel(" "));
		
		text_cpf_proprietario = new JTextField(8);
		add(text_cpf_proprietario);
		
		botaoExibeAnimal= new JButton("Exibir Animal");
		add(botaoExibeAnimal);
		
		botaoExibeLista = new JButton("Exibir Lista Completa");
		add(botaoExibeLista);
		
		
		label = new JLabel("Lista: ");
		add(label);
		visorAnimal = new JTextArea(" ");
		add(visorAnimal);
		
		visorLista = new JTextArea(" ");
		add(visorLista);
		
		pack();
		setVisible(true);
	}
	
	
	//**********************************************************************
	
	public String get_text_cpf_prop() {
		return text_cpf_proprietario.getText();
	}
	
	public void setBotaoBehaviorAnimal(ActionListener botaoBehaviorAnimal) {
		botaoExibeAnimal.addActionListener(botaoBehaviorAnimal);
	}
	public void setBotaoBehaviorExibir(ActionListener botaoBehaviorExibir) {
		botaoExibeLista.addActionListener(botaoBehaviorExibir);
	}
	
	public void setVisor(String result) {
		visorAnimal.setText(result);
	}
	public void setVisorLista(String result) {
		visorLista.setText(result);
	}
}