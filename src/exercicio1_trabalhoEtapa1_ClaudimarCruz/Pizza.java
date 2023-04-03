package exercicio1_trabalhoEtapa1_ClaudimarCruz;

import java.util.Date;

public class Pizza extends Prato{
	private Boolean borda;
	
	public Pizza() {
		super();
	}

	
	
	public Pizza(Integer id, String nome, Boolean borda, String recheio, Float precoVenda, Date dataValidade, Float peso) {
		super(id, nome, recheio, precoVenda, dataValidade, peso);
		this.borda = borda;
	}
	


	public Boolean getBorda() {
		return borda;
	}



	public void setBorda(Boolean borda) {
		this.borda = borda;
	}



	public Float calcularPreco(Integer quant, Float valor ) {
		return quant * valor;
	}

}
