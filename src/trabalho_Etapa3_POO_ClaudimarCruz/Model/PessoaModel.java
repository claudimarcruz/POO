package trabalho_Etapa3_POO_ClaudimarCruz.Model;

import java.util.List;

public class PessoaModel {
	private Integer codigo;
	private String nome;
	private String cpf;
	private String endereco;
	private List<String> telefones;
	
	public PessoaModel() {
		super();
	}

	public PessoaModel(Integer codigo, String nome, String cpf, String endereco, List<String> telefones) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.telefones = telefones;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public List<String> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<String> telefones) {
		this.telefones = telefones;
	}

	@Override
	public String toString() {
		return nome;
	}
	
	
}