package trabalho_Etapa3_POO_ClaudimarCruz.Model;

import java.util.Date;

public class SalgadinhoModel extends PratoModel{
	private String recheio;
	private String massa;
	private String tipo;
	
	public SalgadinhoModel() {
		super();
	}

	public SalgadinhoModel(Integer id, String nome, String recheio, String massa, String tipo,  Double precoVenda, Date dataValidade, Double peso) {
		super(id, nome, precoVenda, dataValidade, peso);
		this.recheio = recheio;
		this.massa = massa;
		this.tipo = tipo;
	}

	public String getRecheio() {
		return recheio;
	}

	public void setRecheio(String recheio) {
		this.recheio = recheio;
	}

	public String getMassa() {
		return massa;
	}

	public void setMassa(String massa) {
		this.massa = massa;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return this.getNome();
	}
	
	
	
	
}
