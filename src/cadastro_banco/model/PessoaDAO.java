package cadastro_banco.model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import cadastro_banco.conexao.ConexaoBanco;



public class PessoaDAO {
	
	private Connection connection = ConexaoBanco.getConnection();
	
	public void selectCadastro() throws SQLException{
		
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("SELECT * FROM cadastro");
		System.out.println("Resultado para o select na tabela de cadastro: ");
		
		while (resultSet.next()) {
            String cpf = resultSet.getString("cpf");
            String nome = resultSet.getString("nome");
            String endereco = resultSet.getString("endereco");
            Date dataNascimento = resultSet.getDate("dataNasc");
            // FaÃ§a algo com os dados recuperados...
            System.out.println(" > CPF: "+cpf+" - Nome: "+nome+" - EndereÃ§o: "+endereco+" - Data de Nascimento: "+dataNascimento);
        }   
		
	}
	
	
public void insertCadastro(String cpf, String nome,String endereco, Date dataNasc) throws SQLException{
		
		//Inserindo dados
	    String sql = "INSERT INTO cadastro (cpf, nome, endereco, dataNasc) VALUES (?, ?, ?, ?)";
	    PreparedStatement stmt = connection.prepareStatement(sql);
		// Configurar os parÃ¢metros da declaraÃ§Ã£o preparada
	    
	    stmt.setString(1, cpf); 
	    stmt.setString(2, nome);
	    stmt.setString(3, endereco);
	    stmt.setDate(4, dataNasc);
	    
	 // Executar a declaraÃ§Ã£o preparada
        int linhasAfetadas = stmt.executeUpdate();

        // Verificar se a inserÃ§Ã£o foi bem-sucedida
        if (linhasAfetadas > 0) {
            System.out.println("Dados inseridos com sucesso!");
        } else {
            System.out.println("Falha ao inserir os dados.");
        }
	}

public void updateCadastro(String cpf, String nome) throws SQLException{
	
	//Inserindo dados
    String sql = "UPDATE cadastro SET cpf=?, nome=?  WHERE CPF=(SELECT cpf FROM cadastro ORDER BY cpf LIMIT 2, 1)";
    PreparedStatement stmt = connection.prepareStatement(sql);
	// Configurar os parÃ¢metros da declaraÃ§Ã£o preparada
    
    stmt.setString(1, nome);
    stmt.setString(2, cpf);
    
 // Executar a declaraÃ§Ã£o preparada
    int linhasAfetadas = stmt.executeUpdate();

    // Verificar se a inserÃ§Ã£o foi bem-sucedida
    if (linhasAfetadas > 0) {
        System.out.println("Dados atualizados com sucesso!");
    } else {
        System.out.println("Falha ao atualizar os dados.");
    }
}

public void deleteCadastro(String cpf) throws SQLException{
	
	//Inserindo dados
    String sql = "DELETE FROM cadastro WHERE cpf = ?";
    PreparedStatement stmt = connection.prepareStatement(sql);
	// Configurar os parÃ¢metros da declaraÃ§Ã£o preparada
    
    stmt.setString(1, cpf);
    
 // Executar a declaraÃ§Ã£o preparada
    int linhasAfetadas = stmt.executeUpdate();

    // Verificar se a inserÃ§Ã£o foi bem-sucedida
    if (linhasAfetadas > 0) {
        System.out.println("Dados apagados com sucesso!");
    } else {
        System.out.println("Falha ao apagar os dados.");
    }
}


public void deleteAll() throws SQLException{
	
	//Inserindo dados
    String sql = "DELETE FROM cadastro";
    PreparedStatement stmt = connection.prepareStatement(sql);
	// Configurar os parÃ¢metros da declaraÃ§Ã£o preparada 
    
 // Executar a declaraÃ§Ã£o preparada
    int linhasAfetadas = stmt.executeUpdate();

    // Verificar se a inserÃ§Ã£o foi bem-sucedida
    if (linhasAfetadas > 0) {
        System.out.println("Dados apagados com sucesso!");
    } else {
        System.out.println("Falha ao apagar os dados.");
    }
}
}


