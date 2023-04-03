package exercicio2_TrabalhoEtapa1_ClaudimarCruz;

public class Cliente_PJ extends Cliente{
	private String cnpj;
	
	public Cliente_PJ() {
		super();
	}

	public Cliente_PJ(Integer id , String cnpj,String nome, String telefone, String endereco) {
		super(id, nome, telefone, endereco);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	
	
	
}
