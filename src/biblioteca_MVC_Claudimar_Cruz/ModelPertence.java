package biblioteca_MVC_Claudimar_Cruz;

public class ModelPertence {
	//private Integer numControle;
	private Integer  id_do_livro;
	private Integer id_da_categoria;
	
	public ModelPertence(Integer id_do_livro, Integer id_da_categoria) {
		super();
		this.id_do_livro = id_do_livro;
		this.id_da_categoria = id_da_categoria;
	}
	
	public ModelPertence() {
		super();
	}
	

	public Integer get_id_do_livro() {
		return id_do_livro;
	}
	
	public void set_id_do_livro(Integer id_do_livro) {
		this.id_do_livro = id_do_livro;
	}
	
	public Integer get_id_da_categoria() {
		return id_da_categoria;
	}
	
	public void set_id_da_categoria(Integer id_da_categoria) {
		this.id_da_categoria = id_da_categoria;
	}
}
