package biblioteca_MVC_Claudimar_Cruz;


public class ModelLivro {
	private Integer id_livro;
	private String nome_livro;
	private String autor;
	private Integer ano_publicacao;
	
	public ModelLivro(Integer id_livro, String nome_livro, String autor, Integer ano_publicacao) {
		super();
		this.id_livro = id_livro;
		this.nome_livro = nome_livro;
		this.autor = autor;
		this.ano_publicacao = ano_publicacao;
	}
	
	public ModelLivro() {
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
	
	public Integer getAno() {
		return ano_publicacao; 
	}
	
	public void setAno(Integer ano_publicacao) {
		this.ano_publicacao = ano_publicacao;
	}
	
	
	
	
}
