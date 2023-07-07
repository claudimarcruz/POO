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

public class ClienteDAO {
	
	private Connection connection = ConexaoBanco.getConnection();
	
	public List<String> selectCadastro() throws SQLException{
		List<String> result = new ArrayList<>();
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("SELECT * FROM cliente");
		//System.out.println("Resultado para o select na tabela de cliente: ");
		
		while (resultSet.next()) {
            Integer codigo = resultSet.getInt("codigo");
            String nome = resultSet.getString("nome");
            String cpf = resultSet.getString("cpf");
            String endereco = resultSet.getString("endereco");
            String tel = resultSet.getString("telefone");
            Date aniv = resultSet.getDate("aniversario");
           
            result.add(nome);
           
        }   
		return result;
	}
	
	
public void insertCadastro(Integer cod, String nome,String cpf, String end, List<String> tel, Date aniv) throws SQLException{
		
		//Inserindo dados
	    String sql = "INSERT INTO cliente (codigo, nome, cpf, endereco, telefone, aniversario) VALUES (?, ?, ?, ?, ?, ?)";
	    PreparedStatement stmt = connection.prepareStatement(sql);
		// Configurar os parÃ¢metros da declaraÃ§Ã£o preparada
	    String telefones = String.join(",",tel);
	    
	    stmt.setInt(1, cod); 
	    stmt.setString(2, nome);
	    stmt.setString(3, cpf);
	    stmt.setString(4, end);
	    stmt.setString(5, telefones); 
	    stmt.setDate(6, aniv);
	    
	    
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