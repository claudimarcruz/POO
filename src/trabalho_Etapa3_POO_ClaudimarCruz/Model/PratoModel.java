package trabalho_Etapa3_POO_ClaudimarCruz.Model;

import java.util.Date;

public class PratoModel {
	private Integer id;
	private String nome;
	private Double precoVenda;
	private Date dataValidade;
	private Double peso;
	
	public PratoModel() {
		super();
	}

	public PratoModel(Integer id, String nome, Double precoVenda, Date dataValidade, Double peso) {
		super();
		this.id = id;
		this.nome = nome;
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

	public Double getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda(Double precoVenda) {
		this.precoVenda = precoVenda;
	}

	public Date getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(Date dataValidade) {
		this.dataValidade = dataValidade;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}
	
	
}