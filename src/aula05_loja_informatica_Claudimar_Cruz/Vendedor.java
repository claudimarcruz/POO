package aula05_loja_informatica_Claudimar_Cruz;

import java.util.Date;
import java.util.List;

public class Vendedor extends Funcionario { 
	private Integer id;
	
	public Vendedor() {
		super();
	}

	public Vendedor(Integer id, String nome, String cpf, String e_mail, String endereco, Date data_nascimento,
			List<String> telefone, Date data_admissao, String cargo) {
		super(nome, cpf, e_mail, endereco, data_nascimento, telefone, data_admissao, cargo);
		this.id = id;
	}
	
	// caso de herança, a classe vendedor é filha da classe funcionário e herda as características 

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
}
