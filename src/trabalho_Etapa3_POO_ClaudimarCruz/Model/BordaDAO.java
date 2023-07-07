package trabalho_Etapa3_POO_ClaudimarCruz.Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import trabalho_Etapa3_POO_ClaudimarCruz.Conexao.ConexaoBanco;

public class BordaDAO {
	
	private Connection connection = ConexaoBanco.getConnection();

	public List<String> selectCadastro() throws SQLException{
		List<String> result = new ArrayList<>();
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("SELECT * FROM borda");
		while (resultSet.next()) {
            String nome = resultSet.getString("nome");
            Double valor = resultSet.getDouble("valor");
            String recheio = resultSet.getString("recheio");
            result.add(nome);
        }   
		return result;
	}
	
public void insertCadastro(String nome, Double valor, String recheio) throws SQLException{
		
		//Inserindo dados
	    String sql = "INSERT INTO borda (nome, valor, recheio) VALUES (?, ?, ?)";
	    PreparedStatement stmt = connection.prepareStatement(sql);
		// Configurar os parÃ¢metros da declaraÃ§Ã£o preparada
	    
	    stmt.setString(1, nome); 
	    stmt.setDouble(2, valor);
	    stmt.setString(3, recheio);
	    
	    
	 // Executar a declaraÃ§Ã£o preparada
        int linhasAfetadas = stmt.executeUpdate();

        // Verificar se a inserÃ§Ã£o foi bem-sucedida
        if (linhasAfetadas > 0) {
            System.out.println("Dados inseridos com sucesso!");
        } else {
            System.out.println("Falha ao inserir os dados.");
        }
	}


}