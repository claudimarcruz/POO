package exercicio2_TrabalhoEtapa1_ClaudimarCruz;

public class Empregado extends Usuarios{
	private String funcao;
	
	public Empregado() {
		super();
	}

	public Empregado(Integer id, String nome, String login, String senha, String funcao) {
		super(id, nome, login, senha);
		this.funcao = funcao;
	}

	public String getSetor() {
		return funcao;
	}

	public void setSetor(String funcao) {
		this.funcao = funcao;
	}
	
	
	
	
}
