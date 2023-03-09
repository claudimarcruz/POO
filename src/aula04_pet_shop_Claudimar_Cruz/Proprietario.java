package aula04_pet_shop_Claudimar_Cruz;

import java.util.Date;

public class Proprietario {
	private String nome;
	private Date data_nascimento;
	private String CPF;
	private String telefone;
	private String endereco;
	
	public Proprietario() {
		super();
	}

	public Proprietario(String nome, Date data_nascimento, String CPF, String telefone, String endereco) {
		super();
		this.nome = nome;
		this.data_nascimento = data_nascimento;
		this.CPF = CPF;
		this.telefone = telefone;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getData_nascimento() {
		return data_nascimento;
	}

	public void setData_nascimento(Date data_nascimento) {
		this.data_nascimento = data_nascimento;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String CPF) {
		this.CPF = CPF;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
	
	
	
	
}
