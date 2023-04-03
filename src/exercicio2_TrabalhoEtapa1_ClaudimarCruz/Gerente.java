package exercicio2_TrabalhoEtapa1_ClaudimarCruz;

public class Gerente extends Usuarios{
	private String setor;
	
	public Gerente() {
		super();
	}

	public Gerente(Integer id, String nome, String login, String senha, String setor) {
		super(id, nome, login, senha);
		this.setor = setor;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}
	
	
	
	
}
