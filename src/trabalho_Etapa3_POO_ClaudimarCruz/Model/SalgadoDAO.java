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

public class SalgadoDAO {
	
	private Connection connection = ConexaoBanco.getConnection();
	
	public List<String> selectCadastro() throws SQLException{
		List<String> result = new ArrayList<>();
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("SELECT * FROM salgadinho");
		System.out.println("Resultado para o select na tabela de pizza: ");
		
		while (resultSet.next()) {
            Integer id = resultSet.getInt("idSalgado");
            String nome = resultSet.getString("nome");
            Double precoVenda = resultSet.getDouble("precoVenda");
            Date data = resultSet.getDate("dataValidade");
            Double peso = resultSet.getDouble("peso");
            String recheio = resultSet.getString("recheio");
            String massa = resultSet.getString("massa");
            String tipo = resultSet.getString("tipo");
           
           result.add(nome);
        }   
		return result;
	}
	
	
public void insertCadastro(Integer id, String nome, Double preco, Date data, Double peso, String recheio, String massa, String tipo) throws SQLException{
		
		//Inserindo dados
	    String sql = "INSERT INTO salgadinho (idSalgado, nome, precoVenda, dataValidade, peso, recheio, massa, tipo) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
	    PreparedStatement stmt = connection.prepareStatement(sql);
		// Configurar os parÃ¢metros da declaraÃ§Ã£o preparada
	    
	    stmt.setInt(1, id); 
	    stmt.setString(2, nome);
	    stmt.setDouble(3, preco);
	    stmt.setDate(4, data);
	    stmt.setDouble(5, peso);
	    stmt.setString(6, recheio); 
	    stmt.setString(7, massa); 
	    stmt.setString(8, tipo); 
	    
	    
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