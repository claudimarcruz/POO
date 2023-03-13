package aula05_loja_informatica_Claudimar_Cruz;

import java.util.Date;
import java.util.List;

public class Funcionario {
	private String nome;
	private String cpf;
	private String e_mail;
	private String endereco;
	private Date data_nascimento;
	private List<String> telefone;
	private Date data_admissao;
	private String cargo;
	
	
	public Funcionario() {
		super();
	}


	public Funcionario(String nome, String cpf, String e_mail, String endereco, Date data_nascimento,
			List<String> telefone, Date data_admissao, String cargo) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.e_mail = e_mail;
		this.endereco = endereco;
		this.data_nascimento = data_nascimento;
		this.telefone = telefone;
		this.data_admissao = data_admissao;
		this.cargo = cargo;
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


	public String getE_mail() {
		return e_mail;
	}


	public void setE_mail(String e_mail) {
		this.e_mail = e_mail;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public Date getData_nascimento() {
		return data_nascimento;
	}


	public void setData_nascimento(Date data_nascimento) {
		this.data_nascimento = data_nascimento;
	}


	public List<String> getTelefone() {
		return telefone;
	}


	public void setTelefone(List<String> telefone) {
		this.telefone = telefone;
	}


	public Date getData_admissao() {
		return data_admissao;
	}


	public void setData_admissao(Date data_admissao) {
		this.data_admissao = data_admissao;
	}


	public String getCargo() {
		return cargo;
	}


	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	
	
}
