package aula03_heranca_Claudimar_Cruz;

import java.util.Date;
import java.util.List;

public class Professor extends Pessoa {
	private Float salario;
	private List<String> disciplina;
	
	public Professor() {
		super();
		
	}
	public Professor(String nome, String cpf, Date dataNascimento, Float salario, List<String> disciplina ) {
		super(nome, cpf, dataNascimento);
		this.salario = salario;
		this.disciplina = disciplina;
		
	}
	public Float getSalario() {
		return salario;
	}
	public void setSalario(Float salario) {
		this.salario = salario;
	}
	public List<String> getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(List<String> disciplina) {
		this.disciplina = disciplina;
	}
	
	public Double tirarCopias(Integer numCopias) {
		return numCopias * 0.10;
	}

}


