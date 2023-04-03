package exercicio2_TrabalhoEtapa1_ClaudimarCruz;

public class Terceirizado extends Usuarios {
	private String funcao;
	
	public Terceirizado() {
		super();
	}

	public Terceirizado(Integer id, String nome, String login, String senha, String funcao) {
		super(id, nome, login, senha);
		this.funcao = funcao;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	
	
	
}
