package aula03_heranca_Claudimar_Cruz;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import exercicio_biblioteca.Livro;

public class Principal {
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
		
		Date dataAluno1 = formato.parse("18/02/1995");
		Aluno aluno1 = new Aluno(12015, "Bia", "00.000.000-00", dataAluno1);
		Double valor1 =aluno1.tirarCopias(1000);
		
		System.out.println("Dados do Aluno");
		System.out.println("Matricula: " + aluno1.getMatricula());
		System.out.println("Nome: " + aluno1.getNome());
		System.out.println("CPF: " + aluno1.getCpf());
		System.out.println("Data de Nascimento: " + formato.format(dataAluno1));
		System.out.println("Valor das cópias: R$ " + String.format("%.2f",valor1));
		
		
		
		
		List <String> disciplina = new ArrayList<String>();
		disciplina.add("Física");
		disciplina.add("Matemática");
		
		
		Date dataProfessor1 = formato.parse("08/07/1975");
		Professor professor1 = new Professor("Fábio", "111.111.111-11", dataProfessor1, 3500.00f, disciplina);
		Double valor2 =professor1.tirarCopias(1000);
		
		System.out.println("*********************************************************************");
		System.out.println("Dados do Professor");
		System.out.println("Nome: " + professor1.getNome());
		System.out.println("CPF: " + professor1.getCpf());
		System.out.println("Data de Nascimento: "+ formato.format(dataProfessor1));
		System.out.println("Salário: R$ " + professor1.getSalario());
		System.out.println("Disciplinas lecionadas: " + professor1.getDisciplina());
		System.out.println("Valor das cópias: R$ " + String.format("%.2f",valor2));
		
		
		
		Date dataFuncionario1 = formato.parse("02/12/1985");
		Date dataAdmissao = formato.parse("07/02/2015");
		Funcionario funcionario1 = new Funcionario("Fábio", "222.222.222-22", dataFuncionario1, 2200.00f, dataAdmissao, "Agente administrativo");
		Double valor3 = funcionario1.tirarCopias(1000);
		
		System.out.println("*********************************************************************");
		System.out.println("Dados do Funcionário");
		System.out.println("Nome: " + funcionario1.getNome());
		System.out.println("CPF: " + funcionario1.getCpf());
		System.out.println("Data de Nascimento: "+ formato.format(dataFuncionario1));
		System.out.println("Salário: R$ " + funcionario1.getSalario());
		System.out.println("Data de admissão: " + formato.format(dataAdmissao));
		System.out.println("Cargo: " + funcionario1.getCargo());
		System.out.println("Valor das cópias: R$ " + String.format("%.2f",valor3));
	}
	
	

}
