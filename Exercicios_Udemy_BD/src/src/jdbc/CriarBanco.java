package src.jdbc;


//importações do BD
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarBanco {
    
    public static void main(String[] args) throws SQLException {
        
        
        
        
        //criando os dados de aceso ao BD
//        final String url = "jdbc:mysql://localhost";
//        final String usr = "root";
//        final String psswd = "Familia308@";
        
        //realizando a conexão
//        Connection conexao = DriverManager.
//                getConnection(url, usr, psswd);

        //Conexão direta com a classe FabricaConexao
        Connection conexao = FabricaConexao.getConexao();
        
        //confirmação de conexão
        System.out.println("Conexão realiza com sucesso!");
        
        //criação do banco de dados
        Statement stmt = conexao.createStatement();
        //realizando o código SQL para criação do BD se não existir
        stmt.execute("CREATE DATABASE IF NOT EXISTS curso_java;");
        //confirmação da criação do BD
        System.out.println("Banco de dados criado com sucesso!");
        
        //finalização da conexão com o banco de dados
        conexao.close();
        
        
        
    }
    
}
