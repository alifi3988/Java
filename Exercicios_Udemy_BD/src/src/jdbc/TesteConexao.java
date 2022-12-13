package src.jdbc;

//importações do sql
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//para o sucesso da conexão, tem que realizar o dwld da biblioteca
//https://dev.mysql.com/downloads/file/?id=513754
// e add em Libraries

public class TesteConexao  {
    
    public static void main(String[] args) throws SQLException{
        
        //Dados para a conexão com o BD
        final String url = "jdbc:mysql://localhost"; // se caso tivesse alguma porta de conexão expecífica, colocaria mais ':(porta)'
        //final String url = "jdbc:mysql://localhost?verifyServerCertificate=false&useSSL=true"; // realizando a conexão, sem verificar o certificado do servidor
        final String user = "root";
        final String psswd = "Familia308@";
        
        //realizando a conexão com os dados
        Connection conexao = DriverManager.getConnection(url, user, psswd);
        
        System.out.println("Conexão efetuada com sucesso!");
        
        
        //finalizando a conexão
        conexao.close();
            
    }
}
