package aula05_loja_informatica_Claudimar_Cruz;

import java.util.Date;
import java.util.List;

public class Cadastro_clientes {
	private Integer id; //encapsulamento, com o private o método é visísel somente dentro da classe
	private String nome;
	private String cpf;
	private String e_mail;
	private String endereco;
	private Date data_nascimento;
	private List<String> telefone;
	
	public Cadastro_clientes() {
		super();
	}


	public Cadastro_clientes(Integer id,String nome, String cpf, String e_mail, String endereco, Date data_nascimento,
			List<String> telefone) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.e_mail = e_mail;
		this.endereco = endereco;
		this.data_nascimento = data_nascimento;
		this.telefone = telefone;
		
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
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

	
}
