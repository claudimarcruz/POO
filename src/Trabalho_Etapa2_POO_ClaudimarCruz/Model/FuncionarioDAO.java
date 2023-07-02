package Trabalho_Etapa2_POO_ClaudimarCruz.Model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import Trabalho_Etapa2_POO_ClaudimarCruz.Conexao.ConexaoBanco;

public class FuncionarioDAO {
	
	private Connection connection = ConexaoBanco.getConnection();
	
	public void selectCadastro() throws SQLException{
		
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("SELECT * FROM funcionario");
		System.out.println("Resultado para o select na tabela de funcionario: ");
		
		while (resultSet.next()) {
            Integer codigo = resultSet.getInt("codigo");
            String nome = resultSet.getString("nome");
            String cpf = resultSet.getString("cpf");
            String endereco = resultSet.getString("endereco");
            String tel = resultSet.getString("telefone");
            Float salario = resultSet.getFloat("salario");
            String cargo = resultSet.getString("cargo");
           
            
            // FaÃ§a algo com os dados recuperados...
            System.out.println(" > Codigo: "+codigo+" - Nome: "+nome+" - CPF: "+cpf+" - Endereco: "+endereco 
            		+ " - Telefone: "+ tel + " - Salario: " + salario + " - Cargo: " + cargo);
        }   
		
	}
	
	
public void insertCadastro(Integer cod, String nome,String cpf, String end, List<String> tel, Float salario, String cargo) throws SQLException{
		
		//Inserindo dados
	    String sql = "INSERT INTO cliente (codigo, nome, cpf, endereco, telefone, salario, cargo) VALUES (?, ?, ?, ?, ?, ?, ?)";
	    PreparedStatement stmt = connection.prepareStatement(sql);
		// Configurar os parÃ¢metros da declaraÃ§Ã£o preparada
	    String telefones = String.join(",",tel);
	    
	    stmt.setInt(1, cod); 
	    stmt.setString(2, nome);
	    stmt.setString(3, cpf);
	    stmt.setString(4, end);
	    stmt.setString(5, telefones); 
	    stmt.setFloat(6, salario);
	    stmt.setString(7, cargo);
	    
	    
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