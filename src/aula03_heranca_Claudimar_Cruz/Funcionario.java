package aula03_heranca_Claudimar_Cruz;

import java.util.Date;

public class Funcionario extends Pessoa {
	private Float salario;
	private Date dataAdmissao;
	private String cargo;
	
	public Funcionario() {
		super();
	}
	
	
	public Funcionario(String nome, String cpf, Date dataNascimento, Float salario, Date dataAdmissao, String cargo) {
		super(nome, cpf, dataNascimento);
		this.salario = salario;
		this.dataAdmissao = dataAdmissao;
		this.cargo = cargo;
	}


	public Float getSalario() {
		return salario;
	}


	public void setSalario(Float salario) {
		this.salario = salario;
	}


	public Date getDataAdmissao() {
		return dataAdmissao;
	}


	public void setDataAdmissao(Date dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}


	public String getCargo() {
		return cargo;
	}


	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	
	
	
	
}
