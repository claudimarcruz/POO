package exercicio_biblioteca;

public class Categoria {
	private Integer id_categoria;
	private String nome_categoria;
	
	
	public Categoria(Integer id_categoria, String nome_categoria) {
		super();
		this.id_categoria = id_categoria;
		this.nome_categoria = nome_categoria;
		
	}
	
	public Categoria() {
		super();
	}
	
	public Integer get_id_categoria() {
		return id_categoria;
	}
	
	public void set_id_categoria(Integer id_categoria) {
		this.id_categoria = id_categoria;
	}
	
	public String get_nome_categoria() {
		return nome_categoria;
	}
	
	public void set_nome_categoria(String nome_categoria) {
		this.nome_categoria = nome_categoria;
	}

}

