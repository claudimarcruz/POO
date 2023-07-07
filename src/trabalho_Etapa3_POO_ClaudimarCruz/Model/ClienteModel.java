package trabalho_Etapa3_POO_ClaudimarCruz.Model;

import java.util.Date;
import java.util.List;

public class ClienteModel extends PessoaModel{
	private Date nasc;
	
	
	public ClienteModel() {
		super();
	}


	public ClienteModel(Integer codigo, String nome, String cpf, String endereco, List<String> telefones, Date aniversario) {
		super(codigo, nome, cpf, endereco, telefones);
		this.nasc = aniversario;
	}


	public Date getNasc() {
		return nasc;
	}


	public void setNasc(Date aniversario) {
		this.nasc = aniversario;
	}

	@Override
	public String toString() {
		return this.getNome();
	}
	
}
