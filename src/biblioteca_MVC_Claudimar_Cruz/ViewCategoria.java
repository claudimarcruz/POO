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


public class ViewCategoria extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	JTextField textIdCategoria, textNomeCategoria;
	
	JTextArea visorCat;

	JButton botaoCategoria;
	
	JFrame minhaJanela = new JFrame();
	
	public ViewCategoria() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setLayout(new BoxLayout(getContentPane(), BoxLayout.X_AXIS));
		setLayout(new FlowLayout());
		//setLayout((LayoutManager) new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
		//********************************************************
		
		minhaJanela.setSize(600,400);
		JLabel label = new JLabel("Cadastro de Categorias >>>");
		add(label);
		add(new JLabel(" "));
		
		
		label = new JLabel("ID");
	    add(label);
	    textIdCategoria = new JTextField(8);
		add(textIdCategoria);
		
		label = new JLabel("Nome");
	    add(label);
	    textNomeCategoria = new JTextField(8);
		add(textNomeCategoria);
		
		botaoCategoria = new JButton("Salvar");
		add(botaoCategoria);
		
		add(new JLabel(" "));
		label = new JLabel("Lista de Categorias: ");
		add(label);
		
		visorCat = new JTextArea(" ");
		add(visorCat);
		
		pack();
		setVisible(true);
	}	
		
	public String getTextIdCategoria() {
		return textIdCategoria.getText();
	}
	
	public String getTextNomeCategoria() {
		return textNomeCategoria.getText();
	}
	
	public void setBotaoBehaviorCategoria(ActionListener botaoBehaviorCategoria) {
		botaoCategoria.addActionListener(botaoBehaviorCategoria);
	}

	
	public void setVisorCat(String result) {
		visorCat.setText(result);
	}
}
