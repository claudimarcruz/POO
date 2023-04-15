package biblioteca_MVC_Claudimar_Cruz;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.LayoutManager;


import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class ViewPertence extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	JTextField text_id_livro, text_id_categoria;
	
	JTextArea visor;
	JLabel visorLista;

	JButton botaoPertence;
	
	public ViewPertence() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setLayout(new BoxLayout(getContentPane(), BoxLayout.X_AXIS));
		setLayout(new FlowLayout());
		//setLayout((LayoutManager) new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
		//********************************************************
		
		JLabel label = new JLabel("Relação Livro / Categoria >>>");
		add(label);
		add(new JLabel(" "));
		
		label = new JLabel("ID do Livro");
	    add(label);
		text_id_livro = new JTextField(8);
		add(text_id_livro);
		
		label = new JLabel("ID da Categoria");
	    add(label);
		text_id_categoria = new JTextField(8);
		add(text_id_categoria );
		
		botaoPertence = new JButton("Salvar");
		add(botaoPertence);
		
		label = new JLabel("Lista: ");
		add(label);
		visor = new JTextArea(" ");
		add(visor);
		
		pack();
		setVisible(true);
	}
	
	
	//**********************************************************************
	
	public String get_text_id_livro() {
		return text_id_livro.getText();
	}
	
	public String get_text_id_categoria() {
		return text_id_categoria.getText();
	}
	
	public void setBotaoBehaviorPertence(ActionListener botaoBehaviorPertence) {
		botaoPertence.addActionListener(botaoBehaviorPertence);
	}
	public void setBotaoBehaviorExibir(ActionListener botaoBehaviorExibir) {
		botaoPertence.addActionListener(botaoBehaviorExibir);
	}
	public void setVisor(String result) {
		visor.setText(result);
	}
	public void setVisorLista(String result) {
		visorLista.setText(result);
	}
	
	
}