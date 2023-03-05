package aula03_heranca_Claudimar_Cruz;

import java.util.Date;

public class Aluno extends Pessoa  {
	private Integer matricula;
	
	public Aluno(Integer matricula, String nome, String cpf, Date dataNascimento) {
		super(nome, cpf, dataNascimento);
		this.matricula = matricula;
	}
	
	public Aluno() {
		super();
	}

	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}
	
	public Double tirarCopias(Integer numCopias) {
		return numCopias * 0.05;
	}
	
	
}


