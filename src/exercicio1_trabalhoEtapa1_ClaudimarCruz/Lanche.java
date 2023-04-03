package exercicio1_trabalhoEtapa1_ClaudimarCruz;

import java.util.Date;

public class Lanche extends Prato {
	private String pao;
	private String molho;
	
	public Lanche() {
		super();
	}

	public Lanche(Integer id, String nome, String pao, String recheio, String molho, Float precoVenda, Date dataValidade, Float peso) {
		super(id, nome, recheio, precoVenda, dataValidade, peso);
		this.pao = pao;
		this.molho = molho;
	}

	public String getPao() {
		return pao;
	}

	public void setPao(String pao) {
		this.pao = pao;
	}

	public String getMolho() {
		return molho;
	}

	public void setMolho(String molho) {
		this.molho = molho;
	}
	
	public Float calcularPreco(Integer quant, Float valor ) {
		return quant * valor;
	}
	
	
}
