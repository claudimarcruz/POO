package exercicio_biblioteca;

import java.util.Date;

public class Livro {
	private Integer id_livro;
	private String nome_livro;
	private String autor;
	private Date ano_publicacao;
	private String categoria;
	
	public Livro(Integer id_livro, String nome_livro, String autor, Date ano_publicacao, String categoria ) {
		super();
		this.id_livro = id_livro;
		this.nome_livro = nome_livro;
		this.autor = autor;
		this.ano_publicacao = ano_publicacao;
		this.categoria = categoria;
	}
	
	public Livro() {
		super();
	}
	
	
	public Integer getId(){
		return id_livro;
	}
	
	public void setId(Integer id_livro) {
		this.id_livro = id_livro;
	}
	
	public String getNome(){
		return nome_livro;
	}
	
	public void setNome(String nome_livro) {
		this.nome_livro = nome_livro;
	}
	
	public String GetAutor() {
		return autor;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public Date getAno() {
		return ano_publicacao; 
	}
	
	public void setAno(Date ano_publicacao) {
		this.ano_publicacao = ano_publicacao;
	}
	
	public String getCategoria() {
		return categoria;
	}
	
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
}

