package src.jdbc;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


public class FabricaConexao {
    
     public static Connection getConexao(){
         
         //try | catch para tratamento de erro
         try {
             Properties prop = getProperties();
             System.out.println("Teste 1");
             //criando os dados de aceso ao BD
             final String url = prop.getProperty("banco.url");
             final String usr = prop.getProperty("banco.urs");
             final String psswd = prop.getProperty("banco.pssd");
             System.out.println("Teste 2");
             
             //retornando a conexão com o banco de dados
             return DriverManager.getConnection(url, usr, psswd);
             
         //caso não der certo a conexão com o banco    
         } catch (SQLException | IOException | NullPointerException e) {
             System.out.println("Erro getConexao(): " + e.getMessage());
            throw new RuntimeException(e);
        }
     }
     
     private static Properties getProperties() throws IOException{
         
        try {
            String caminho = "conexao.properties";
            Properties prop = new Properties();
            
            prop.load(FabricaConexao.class.getResourceAsStream(caminho));

            return prop;       
            
         } catch (NullPointerException e) {
             
             System.out.println("Erro getProperties(): " + e.getMessage());
             return null;
         }
 
     }
}
 