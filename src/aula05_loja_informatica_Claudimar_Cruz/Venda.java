package aula05_loja_informatica_Claudimar_Cruz;

public class Venda {
	private String nome_cliente;
	private String nome_produto;
	private String nome_fornecedor;
	private String nome_vendedor;
	private Float valor_total;
	private Float valor_final;
	
	public Venda() {
		super();
	}

	public Venda(String nome_cliente, String nome_produto, String nome_fornecedor, String nome_vendedor,
			Float valor_total, Float valor_final) {
		super();
		this.nome_cliente = nome_cliente;
		this.nome_produto = nome_produto;
		this.nome_fornecedor = nome_fornecedor;
		this.nome_vendedor = nome_vendedor;
		this.valor_total = valor_total;
		this.valor_final = valor_final;
	}

	public String getNome_cliente() {
		return nome_cliente;
	}

	public void setNome_cliente(String nome_cliente) {
		this.nome_cliente = nome_cliente;
	}

	public String getNome_produto() {
		return nome_produto;
	}

	public void setNome_produto(String nome_produto) {
		this.nome_produto = nome_produto;
	}

	public String getNome_fornecedor() {
		return nome_fornecedor;
	}

	public void setNome_fornecedor(String nome_fornecedor) {
		this.nome_fornecedor = nome_fornecedor;
	}

	public String getNome_vendedor() {
		return nome_vendedor;
	}

	public void setNome_vendedor(String nome_vendedor) {
		this.nome_vendedor = nome_vendedor;
	}

	public Float getValor_total() {
		return valor_total;
	}

	public void setValor_total(Float valor_total) {
		this.valor_total = valor_total;
	}

	public Float getValor_final() {
		return valor_final;
	}

	public void setValor_final(Float valor_final) {
		this.valor_final = valor_final;
	}

	
	
	
}

