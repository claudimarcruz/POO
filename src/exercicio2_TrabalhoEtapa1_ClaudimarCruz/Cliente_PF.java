package exercicio2_TrabalhoEtapa1_ClaudimarCruz;

public class Cliente_PF extends Cliente{
	private String cpf;
	
	public Cliente_PF() {
		super();
	}

	public Cliente_PF(Integer id, String cpf, String nome, String telefone, String endereco) {
		super(id, nome, telefone, endereco);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
}
