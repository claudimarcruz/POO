package biblioteca_MVC_Claudimar_Cruz;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.LayoutManager;


import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class View extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	JTextField textID, textNome, textAutor, textAno ;
	JTextField textIdCategoria, textNomeCategoria;
	JTextField text_id_livro, text_id_categoria;
	
	JLabel visor;
	JButton botaoLivro,  botaoCategoria,  botaoPertence;
	
	public View() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setLayout(new BoxLayout(getContentPane(), BoxLayout.X_AXIS));
		//setLayout(new FlowLayout());
		setLayout((LayoutManager) new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
		//********************************************************
		JLabel label = new JLabel("Cadastro de Categorias");
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
		
		//*****************************************************
		add(new JLabel(" "));
		label = new JLabel("Cadastro de Livros ");
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
		
		//************************************
		add(new JLabel(" "));
		label = new JLabel("Cadastro de Categorias");
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
		
		//********************************************************
		label = new JLabel("Lista ");
		add(label);
		visor = new JLabel(" ");
		add(visor);
		
		//********************************************************
		
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
	
	public String get_text_id_livro() {
		return text_id_livro.getText();
	}
	
	public String get_text_id_categoria() {
		return text_id_categoria.getText();
	}
	
	public void setBotaoBehaviorPertence(ActionListener botaoBehaviorPertence) {
		botaoPertence.addActionListener(botaoBehaviorPertence);
	}
	//**************************************************************************
	public void setVisor(String result) {
		visor.setText(result);
	}
}
