package aula05_loja_informatica_Claudimar_Cruz;

public class Cadastro_produtos {
	private Integer id;
	private String nome;
	private Float precoUnitario;
	private Integer id_fornecedor;
	
	public Cadastro_produtos() {
		super();
	}

	public Cadastro_produtos(Integer id, String nome, Float precoUnitario, Integer id_fornecedor) {
		super();
		this.id = id;
		this.nome = nome;
		this.precoUnitario = precoUnitario;
		this.id_fornecedor = id_fornecedor;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Float getPrecoUnitario() {
		return precoUnitario;
	}

	public void setPrecoUnitario(Float precoUnitario) {
		this.precoUnitario = precoUnitario;
	}

	public Integer getId_fornecedor() {
		return id_fornecedor;
	}

	public void setId_fornecedor(Integer id_fornecedor) {
		this.id_fornecedor = id_fornecedor;
	}

	
	
	
	
	
}
