package exercicio_aula_1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;

public class Principal{
	public static void main (String[] args) throws ParseException {
		
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
		Date dataAluno1 = formato.parse("18/02/1995");
		
		Aluno aluno1 = new Aluno("Nilmar", 64321698, dataAluno1, "nilmar@gmail.com");
		Integer idadeAluno1 = aluno1.idadeAluno(aluno1);
		
		//System.out.println("\n------------------------------------------------------------- \n");
		
		System.out.println("Dados dos alunos: \n");
		System.out.println("Nome: " + aluno1.getNome());
		System.out.println("CPF: " + aluno1.getCpf());
		System.out.println("Data Nascimento: " + formato.format(dataAluno1));
		System.out.println("E_mail: " + aluno1.getE_mail());
		System.out.println("Idade: " + idadeAluno1 );
		
		
		
		
		
		Date dataAluno2 = formato.parse("17/02/1998");
		Aluno aluno2 = new Aluno("Fabio", 89541551, dataAluno2, "fabio@gmail.com");
		Integer idadeAluno2 = aluno1.idadeAluno(aluno2);
		
		System.out.println("\n------------------------------------------------------------- \n");
		System.out.println("Nome: " + aluno2.getNome());
		System.out.println("CPF: " + aluno2.getCpf());
		System.out.println("Data Nascimento: " + formato.format(dataAluno2));
		System.out.println("E_mail: " + aluno2.getE_mail());
		System.out.println("Idade: " + idadeAluno2 );
		
		
		
		
		
		Date dataAluno3 = formato.parse("16/08/1990");
		Aluno aluno3 = new Aluno("Lucas", 82135592, dataAluno3, "lucas@gmail.com");
		Integer idadeAluno3 = aluno1.idadeAluno(aluno3);
		
		System.out.println("\n------------------------------------------------------------- \n");
		System.out.println("Nome: " + aluno3.getNome());
		System.out.println("CPF: " + aluno3.getCpf());
		System.out.println("Data Nascimento: " + formato.format(dataAluno3));
		System.out.println("E_mail: " + aluno3.getE_mail());
		System.out.println("Idade: " + idadeAluno3 );
		
		System.out.println("\n------------------------------------------------------------- \n");
		//Aluno aluno
		
		/*
		Integer vetor[] = {idadeAluno1, idadeAluno2, idadeAluno3};
		Integer maior= vetor[0];
		Integer posicao = 0;
		//Integer cont = 0;
		for(int i = 0; i < vetor.length; i++ ) {
			if (vetor[i] > maior) {
				//cont ++;
				maior = vetor[i];
				posicao = i ;
				
			}
			
		}
		*/
		
		
		Aluno aluno = new Aluno();
		
		
		Integer posicaoAluno = 	aluno.maiorIdade(aluno1.idadeAluno(aluno1),
								aluno2.idadeAluno(aluno2),
								aluno3.idadeAluno(aluno3));
		
		
		
		//public static Integer alunoMaisVelho(Integer indice){//}
		//System.out.println("Posicao: " + posicaoAluno );
		//System.out.println("Nome: " + aluno.getDate() );
		
		//System.out.println("O aluno mais velho é " + aluno[posicaoAluno].getNome() + " com " + idadeAluno[posicaoAluno] + " anos de idade." );
		
		
		
		if(posicaoAluno == 0) {
			System.out.println("O aluno mais velho é " + aluno1.getNome() + " com " + idadeAluno1 + " anos de idade." );
		}
		if(posicaoAluno == 1) {
			System.out.println("O aluno mais velho é " + aluno2.getNome() + " com " + idadeAluno2 + " anos de idade." );
		}
		if(posicaoAluno == 2) {
			System.out.println("O aluno mais velho é " + aluno3.getNome() + " com " + idadeAluno3 + " anos de idade." );
		}
		
	}

}


