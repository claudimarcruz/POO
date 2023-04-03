package exercicio1_trabalhoEtapa1_ClaudimarCruz;

import java.util.Date;

public class Prato {
	private Integer id;
	private String nome;
	private String recheio;
	private Float precoVenda;
	private Date dataValidade;
	private Float peso;
	
	public Prato() {
		super();
	}

	public Prato(Integer id, String nome, String recheio, Float precoVenda, Date dataValidade, Float peso) {
		super();
		this.id = id;
		this.nome = nome;
		this.recheio = recheio;
		this.precoVenda = precoVenda;
		this.dataValidade = dataValidade;
		this.peso = peso;
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

	public String getRecheio() {
		return recheio;
	}

	public void setRecheio(String recheio) {
		this.recheio = recheio;
	}

	public Float getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda(Float precoVenda) {
		this.precoVenda = precoVenda;
	}

	public Date getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(Date dataValidade) {
		this.dataValidade = dataValidade;
	}

	public Float getPeso() {
		return peso;
	}

	public void setPeso(Float peso) {
		this.peso = peso;
	}
	
}
