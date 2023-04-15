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


public class View extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	JTextField textID, textNome, textAutor, textAno ;

	JTextArea visor;
	JLabel visor2;

	JButton botaoLivro;
	
	public View() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setLayout(new BoxLayout(getContentPane(), BoxLayout.X_AXIS));
		setLayout(new FlowLayout());
		//setLayout((LayoutManager) new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
		//********************************************************
		
		JLabel label = new JLabel("Cadastro de Livros >>>");
		add(label);
		add(new JLabel(" "));
		
		
		label = new JLabel("ID");
	    add(label);
		textID = new JTextField(8);
		add(textID);
		//add(new JLabel(" "));
		
		label = new JLabel("Nome");
	    add(label);
		textNome = new JTextField(8);
		add(textNome);
		
		
		label = new JLabel("Autor");
	    add(label);
		textAutor = new JTextField(8);
		add(textAutor);
		
		label = new JLabel("Ano Publicação");
	    add(label);
		textAno = new JTextField(8);
		add(textAno);
		
		botaoLivro = new JButton("Salvar");
		add(botaoLivro);
		
		add(new JLabel(" "));
		label = new JLabel("Lista de livros: ");
		add(label);
		
		add(new JLabel(" "));
		visor2 = new JLabel(" ");
		add(visor2);
		add(new JLabel(" "));
		
		visor = new JTextArea(" ");
		add(visor);
		
		pack();
		setVisible(true);
	}
	

	//*********************************************
	
	public String getID() {
		return textID.getText();
	}
	
	public String getNome() {
		return textNome.getText();
	}
	
	public String getAutor() {
		return textAutor.getText();
	}
	
	public String getAno() {
		return textAno.getText();
	}
	
	public void setBotaoBehaviorLivro(ActionListener botaoBehaviorLivro) {
		botaoLivro.addActionListener(botaoBehaviorLivro);
	}
	//**********************************************************************
	
	
	public void setVisor(String result) {
		visor.setText(result);
	}
	
	public void setVisor2(String result) {
		visor2.setText(result);
	}
	
	
}
