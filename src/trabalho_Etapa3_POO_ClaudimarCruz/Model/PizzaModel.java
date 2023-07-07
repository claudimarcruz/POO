package trabalho_Etapa3_POO_ClaudimarCruz.Model;

import java.util.Date;


public class PizzaModel extends PratoModel {
	private String molho;
	private String recheio1;
	private String recheio2;
	private String borda;
	
	public PizzaModel() {
		super();
	}

	
	public PizzaModel(Integer id, String nome, Double precoVenda, Date dataValidade, Double peso, String molho, String recheio1, String recheio2, String borda ) {
		super(id, nome, precoVenda, dataValidade, peso);
		// TODO Auto-generated constructor stub
		this.molho = molho;
		this.recheio1 = recheio1;
		this.recheio2 = recheio2;
		this.borda = borda;
	}


	public String getMolho() {
		return molho;
	}

	public void setMolho(String molho) {
		this.molho = molho;
	}

	

	public String getRecheio1() {
		return recheio1;
	}


	public void setRecheio1(String recheio1) {
		this.recheio1 = recheio1;
	}


	public String getRecheio2() {
		return recheio2;
	}


	public void setRecheio2(String recheio2) {
		this.recheio2 = recheio2;
	}


	public String getBorda() {
		return borda;
	}

	public void setBorda(String borda) {
		this.borda = borda;
	}


	@Override
	public String toString() {
		return this.getNome();
	}
	
	
	
	
}
