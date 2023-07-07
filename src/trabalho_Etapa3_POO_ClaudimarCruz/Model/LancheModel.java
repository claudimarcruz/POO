package trabalho_Etapa3_POO_ClaudimarCruz.Model;

import java.util.Date;

public class LancheModel extends PratoModel{
	private String pao;
	private String recheio;
	private String molho;
	
	
	public LancheModel() {
		super();
	}


	public LancheModel(Integer id, String nome, String pao, String recheio, String molho, Double precoVenda, Date dataValidade, Double peso) {
		super(id, nome, precoVenda, dataValidade, peso);
		this.pao = pao;
		this.recheio = recheio;
		this.molho = molho;
	}


	public String getPao() {
		return pao;
	}


	public void setPao(String pao) {
		this.pao = pao;
	}


	public String getRecheio() {
		return recheio;
	}


	public void setRecheio(String recheio) {
		this.recheio = recheio;
	}


	public String getMolho() {
		return molho;
	}


	public void setMolho(String molho) {
		this.molho = molho;
	}


	@Override
	public String toString() {
		return this.getNome();
	}
	
	
	
	
}
