package cadastro_banco.model;

import java.util.Date;

public class Pessoa {
	
	private String cpf;
	private String nome;
	private String endereco;
	private Date dataNasc;
	
	public Pessoa(String cpf, String nome, String endereco, Date dataNasc) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.endereco = endereco;
		this.dataNasc = dataNasc;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public Date getDataNascimento() {
		return dataNasc;
	}
	public void setDataNascimento(Date dataNasc) {
		this.dataNasc = dataNasc;
	}
	
	
	
	

}