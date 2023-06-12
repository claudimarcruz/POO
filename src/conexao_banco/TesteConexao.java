package conexao_banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class TesteConexao {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/petshop";
        String user = "teste";
        String password = "";

        try {
            // Registrar o driver JDBC
            Class.forName("com.mysql.jdbc.Driver");

            // Estabelecer a conexÃ£o com o banco de dados
            Connection connection = DriverManager.getConnection(url, user, password);

            // Executar consultas ou operaÃ§Ãµes no banco de dados
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM animais");
            
            // insert
            String sql = "INSERT INTO animais(idAnimal, cor, nome, idade, raca, sexo) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, 19);
            stmt.setString(2, "Preto");
            stmt.setString(3, "Blue");
            stmt.setInt(4, 5);
            stmt.setString(5, "Vira lata");
            stmt.setString(6, "f");
            
            int rowsInserted = stmt.executeUpdate();
            if (rowsInserted > 0) {
            	System.out.println("Operação realizada!");
            }else {
            	System.out.println("Erro!");
            }
            
            
            //update
            
            String sql1 = "UPDATE animais SET nome=?, idade=? WHERE IdAnimal = ?";
            PreparedStatement stmt1 = connection.prepareStatement(sql1);
            stmt1.setString(1, "Lotus");
            stmt1.setInt(2, 7);
            stmt1.setInt(3, 19);
            
            int rowsInserted1 = stmt1.executeUpdate();
            if (rowsInserted1 > 0) {
            	System.out.println("Operação realizada!");
            }else {
            	System.out.println("Erro!");
            }
            

            // Processar os resultados
            while (resultSet.next()) {
                int idAnimal = resultSet.getInt("idAnimal");
                String nome = resultSet.getString("nome");
                // FaÃ§a algo com os dados recuperados...
                System.out.println("ID: "+idAnimal+" Nome: "+nome);
            }

            // Fechar a conexÃ£o
            resultSet.close();
            statement.close();
            connection.close(); 

        } catch (ClassNotFoundException e) {
            System.out.println("Driver JDBC nÃ£o encontrado");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Erro ao conectar ao banco de dados");
            e.printStackTrace();
        }
    }
}