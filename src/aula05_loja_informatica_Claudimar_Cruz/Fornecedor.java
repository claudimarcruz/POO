package aula05_loja_informatica_Claudimar_Cruz;

import java.util.Date;
import java.util.List;

public class Fornecedor {
	private Integer id;
	private String nome;
	private String cnpj;
	private String e_mail;
	private String endereco;
	private Date data_abertura;
	private List<String> telefone; 	
	
	public Fornecedor() {
		super();
	}

	public Fornecedor(Integer id,String nome, String cnpj, String e_mail, String endereco, Date data_abertura,
			List<String> telefone) {
		super();
		this.id = id;
		this.nome = nome;
		this.cnpj = cnpj;
		this.e_mail = e_mail;
		this.endereco = endereco;
		this.data_abertura = data_abertura;
		this.telefone = telefone;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getE_mail() {
		return e_mail;
	}

	public void setE_mail(String e_mail) {
		this.e_mail = e_mail;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Date getData_abertura() {
		return data_abertura;
	}

	public void setData_abertura(Date data_abertura) {
		this.data_abertura = data_abertura;
	}

	public List<String> getTelefone() {
		return telefone;
	}

	public void setTelefone(List<String> telefone) {
		this.telefone = telefone;
	}
	
	
	
	
	
	
}
