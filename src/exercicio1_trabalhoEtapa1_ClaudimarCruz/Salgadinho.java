package exercicio1_trabalhoEtapa1_ClaudimarCruz;

import java.util.Date;

public class Salgadinho extends Prato {
	private String massa;
	private String tipo;
	
	public Salgadinho() {
		super();
	}

	

	public Salgadinho(Integer id, String nome, String recheio, String massa, String tipo, Float precoVenda, Date dataValidade, Float peso) {
		super(id, nome, recheio, precoVenda, dataValidade, peso);
		this.massa = massa;
		this.tipo = tipo;
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
	
	public Float calcularPreco(Integer quant, Float valor ) {
		return quant * valor;
	}

	
	
}
