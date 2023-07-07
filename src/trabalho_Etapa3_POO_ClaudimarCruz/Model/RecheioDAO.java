package trabalho_Etapa3_POO_ClaudimarCruz.Model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import trabalho_Etapa3_POO_ClaudimarCruz.Conexao.ConexaoBanco;

public class RecheioDAO {
	
	private Connection connection = ConexaoBanco.getConnection();

	public List<String> selectCadastro() throws SQLException{
		List<String> result = new ArrayList<>();
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("SELECT * FROM recheio");
		while (resultSet.next()) {
            Integer id = resultSet.getInt("idRecheio");
            String nome = resultSet.getString("nome");
            Double valor = resultSet.getDouble("valor");
            result.add(nome);
        }   
		return result;
	}
	
public void insertCadastro(Integer id, String nome, Double valor) throws SQLException{
		
		//Inserindo dados
	    String sql = "INSERT INTO recheio (idRecheio, nome, valor) VALUES (?, ?, ?)";
	    PreparedStatement stmt = connection.prepareStatement(sql);
		// Configurar os parÃ¢metros da declaraÃ§Ã£o preparada
	    
	    stmt.setInt(1, id); 
	    stmt.setString(2, nome);
	    stmt.setDouble(3, valor);
	    
	    
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