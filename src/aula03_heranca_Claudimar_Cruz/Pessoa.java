package aula03_heranca_Claudimar_Cruz;

import java.util.Date;


public abstract class Pessoa {
	private String nome;
	private String cpf;
	private Date dataNascimento;
	
	
	public Pessoa (String nome, String cpf, Date dataNascimento) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
	}
	
	public Pessoa() {
		super();
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

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public Double tirarCopias(Integer numCopias) {
		return numCopias * 0.10;
	}
	
	
	
	

}

