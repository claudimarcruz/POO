package trabalho_Etapa3_POO_ClaudimarCruz.Model;

public class BordaModel {
	private String nome;
	private Double valor;
	private String recheio;
	
	
	public BordaModel() {
		super();
	}


	public BordaModel(String nome, Double valor, String recheio) {
		super();
		this.nome = nome;
		this.valor = valor;
		this.recheio = recheio;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Double getValor() {
		return valor;
	}


	public void setValor(Double valor) {
		this.valor = valor;
	}


	public String getRecheio() {
		return recheio;
	}


	public void setRecheio(String recheio) {
		this.recheio = recheio;
	}
	
	@Override
	public String toString() {
		return this.getNome();
	}
}
