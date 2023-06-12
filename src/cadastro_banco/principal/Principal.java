package cadastro_banco.principal;

import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;

import cadastro_banco.conexao.ConexaoBanco;
import cadastro_banco.model.PessoaDAO;


public class Principal {
	@SuppressWarnings("static-access")
	public static void main (String[] args) throws SQLException {
		
		ConexaoBanco conexaoBanco = new ConexaoBanco();
		
//		
//		//Testando a ConexÃ£o com o Banco
//		if (conexaoBanco.testarConexÃ£o()) {
//			System.out.println("Banco OK");
//		}else {
//			System.out.println("Falha o Banco");
//		}
//		//Fim do teste de conexÃ£o
		
		
		conexaoBanco.conectarBanco();
		PessoaDAO pessoaDAO = new PessoaDAO();
		
		//pessoaDAO.selectCadastro();
		//pessoaDAO.insertCadastro("3", "nome1", "Endereco1", new Date(0));
		
		// b Inserir 5 registros de pessoas na tabela cadastro
		
//		pessoaDAO.insertCadastro("4", "nome2", "Endereco2", new Date(0));
//		pessoaDAO.insertCadastro("5", "nome3", "Endereco3", new Date(0));
//		pessoaDAO.insertCadastro("6", "nome4", "Endereco4", new Date(0));
//		pessoaDAO.insertCadastro("7", "nome5", "Endereco5", new Date(0));
//		pessoaDAO.insertCadastro("8", "nome6", "Endereco6", new Date(0));
//		pessoaDAO.selectCadastro();
		
		// d Atualizar o 3 registro alterando o CPF para “1234567890” e o nome para “Beltrano”
		
		//pessoaDAO.updateCadastro("1234567890", "Beltrano");
		//pessoaDAO.selectCadastro();
		
		
		//f Deletar 3 desses 5 registros
		
		//pessoaDAO.deleteCadastro("3");
		//pessoaDAO.deleteCadastro("4");
		//pessoaDAO.deleteCadastro("6");
		//pessoaDAO.selectCadastro();
		
		
		//h Realizar o delete de todos os registros;
		
		pessoaDAO.deleteAll();
		pessoaDAO.selectCadastro();
			
		ConexaoBanco.fecharConexao();	
	}
}