package trabalho_Etapa3_POO_ClaudimarCruz.Model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.itextpdf.text.log.SysoCounter;

import trabalho_Etapa3_POO_ClaudimarCruz.Conexao.ConexaoBanco;


public class PedidoDAO {
	
	private Connection connection = ConexaoBanco.getConnection();
	
	public List<String> selectID() throws SQLException{
		List<String> result = new ArrayList<>();
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("SELECT * FROM pedido");
		while (resultSet.next()) {
            Integer idPedido = resultSet.getInt("idPedido");
           result.add(idPedido.toString());
          
        }   
		
		return result;
	}
	
	public String selectCadastro(int id) throws SQLException {
	    StringBuilder result = new StringBuilder();
	    PreparedStatement statement = connection.prepareStatement("SELECT * FROM pedido WHERE idPedido = ?");
	    statement.setInt(1, id);
	    ResultSet resultSet = statement.executeQuery();
	    
	    while (resultSet.next()) {
	        Integer idPedido = resultSet.getInt("idPedido");
	        String nomeCliente = resultSet.getString("nomeCliente");
	        String nomeFunc = resultSet.getString("nomeFunc");
	        Double taxa = resultSet.getDouble("taxaServico");
	        String itens = resultSet.getString("itensConsumidos");
	        Integer quant = resultSet.getInt("quantidade");
	        Double valor = resultSet.getDouble("ValorTotal");
	        
	        result.append("Id do Pedido: ").append(idPedido).append("\n");
	        result.append("Nome do Cliente: ").append(nomeCliente).append("\n");
	        result.append("Nome do Funcionario: ").append(nomeFunc).append("\n");
	        result.append("Taxa de Servico: ").append(taxa).append("\n");
	        result.append("Item Consumido: ").append(itens).append("\n");
	        result.append("Quantidade: ").append(quant).append("\n");
	        result.append("Valor Total: ").append(valor).append("\n");
	        result.append("##############################").append("\n");
	    }   
	    
	    return  result.toString();
	}

	public double selectValorTotal(int id) throws SQLException {
	    PreparedStatement statement = connection.prepareStatement("SELECT * FROM pedido WHERE idPedido = ?");
	    statement.setInt(1, id);
	    ResultSet resultSet = statement.executeQuery();
	    
	    if (resultSet.next()) {
	        double valor = resultSet.getDouble("ValorTotal");
	        return valor;
	    } else {
	        return 0.0;
	    }
	}
	
	
public void insertCadastro(Integer id, String nomeCliente,String nomeFunc, Double taxa,
			String itens, Integer quant, Double valor) throws SQLException{
		
		//Inserindo dados
	    String sql = "INSERT INTO pedido (idPedido, nomeCliente, nomeFunc, taxaServico, itensConsumidos, quantidade, valorTotal) VALUES (?, ?, ?, ?, ?, ?, ?)";
	    PreparedStatement stmt = connection.prepareStatement(sql);
		// Configurar os parÃ¢metros da declaraÃ§Ã£o preparada
	    
	    stmt.setInt(1, id); 
	    stmt.setString(2, nomeCliente);
	    stmt.setString(3, nomeFunc);
	    stmt.setDouble(4, taxa);
	    stmt.setString(5, itens); 
	    stmt.setInt(6, quant);
	    stmt.setDouble(7, valor);
	    
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
