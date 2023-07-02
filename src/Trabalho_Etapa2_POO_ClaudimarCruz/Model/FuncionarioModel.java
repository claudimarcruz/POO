package Trabalho_Etapa2_POO_ClaudimarCruz.Model;

import java.util.List;

public class FuncionarioModel extends PessoaModel {
	private Float salario;
	private String cargo;
	
	public FuncionarioModel() {
		super();
	}

	public FuncionarioModel(Integer codigo, String nome, String cpf, Float salario, String cargo, String endereco, List<String> telefones) {
		super(codigo, nome, cpf, endereco, telefones);
		this.salario = salario;
		this.cargo = cargo;
	}

	public Float getSalario() {
		return salario;
	}

	public void setSalario(Float salario) {
		this.salario = salario;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	@Override
	public String toString() {
		return this.getNome();
	}
}
