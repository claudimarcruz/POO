package Trabalho_Etapa2_POO_ClaudimarCruz.Model;

import java.util.List;

public class FuncionarioModel extends PessoaModel {
	private Double salario;
	private String cargo;
	
	public FuncionarioModel() {
		super();
	}

	public FuncionarioModel(Integer codigo, String nome, String cpf, Double salario, String cargo, String endereco, List<String> telefones) {
		super(codigo, nome, cpf, endereco, telefones);
		this.salario = salario;
		this.cargo = cargo;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
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
