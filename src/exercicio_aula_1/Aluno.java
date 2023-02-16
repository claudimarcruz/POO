package exercicio_aula_1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.text.ParseException;



public class Aluno {
	private String nome;
	private Integer cpf;
	private Date dataNascimento;
	private String e_mail;
	
	
	public Aluno(String nome, Integer cpf, Date dataNascimento, String e_mail) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.e_mail = e_mail;
	}
	
	public Aluno() {
		super();
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Integer getCpf() {
		return cpf;
	}
	
	public void setCpf (Integer cpf) {
		this.cpf = cpf;
	}
	
	
	public Date getDate() {
		return dataNascimento;
	}
	
	
	public void setDate(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public String getE_mail() {
		return e_mail;
		
	}
	
	public void setE_mail(String e_mail) {
		this.e_mail = e_mail;
	}
	
	public Integer idadeAluno(Aluno aluno){
		
		Date date = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		Integer mes = (calendar.get(Calendar.MONTH)) + 1;
		Integer dia = (calendar.get(Calendar.DATE));
		//System.out.println("mes: " + mes);
		//System.out.println("dia: " + dia);
		
		Integer idade = 0;
		Integer mesAluno = 0;
		Integer diaAluno = 0;
		Integer valorIdade = 0;
		
		
		mesAluno = aluno.getDate().getMonth() + 1; 
		diaAluno = aluno.getDate().getDate(); 
		//aluno.getDate().compareTo(date)
		
		idade = new Date().getYear() - aluno.getDate().getYear();
		
		if (mesAluno > mes){
			valorIdade = idade - 1 ;
		}
		else if (mesAluno < mes){
			valorIdade = idade ;
		}
		else if (mesAluno == mes){
			if (diaAluno > dia){
				valorIdade = idade - 1 ;
			}
			else {
				valorIdade = idade;
			}
		}
		return valorIdade ;
	}
	
	
	public Integer maiorIdade(Integer aluno1, Integer aluno2, Integer aluno3){
		Integer vetor[] = {aluno1, aluno2, aluno3};
		Integer maior= vetor[0];
		Integer posicao = 0;
		for(int i = 0; i < vetor.length; i++ ) {
			if (vetor[i] > maior) {
				maior = vetor[i];
				posicao = i ;
			}
			
		}
		return posicao;
	}
	
	
	
	
}

	


