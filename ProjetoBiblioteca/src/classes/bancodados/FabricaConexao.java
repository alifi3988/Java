
package classes.bancodados;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class FabricaConexao {
    
    public static Connection getConexao(){
                
        try {
            Properties prop = getProperties();
            
            //criando os dados de aceso ao BD, puxando do arquivo conexao.properties
            final String url = prop.getProperty("banco.url");
            final String ususario = prop.getProperty("banco.urs");
            final String senha = prop.getProperty("banco.pssd");
            
            
            
            //retornando a conexao com o banco de dados
            Connection conexao = DriverManager.getConnection(url, ususario, senha);
            System.out.println("Conexão realizada com sucesso!");
            return conexao;
            
            
            
            
            //solução de erros
        } catch (SQLException | NullPointerException e) {
            
            System.out.println("""
                               Erro na conexão com o banco de dados.
                               Descrição: """ + e.getMessage());
            
            throw new RuntimeException(e);
        }
    }

    private static Properties getProperties() {
         
        try {
            
            String caminho = "conexao.properties";
            Properties prop = new Properties();
            
            prop.load(FabricaConexao.class.getResourceAsStream(caminho));

            return prop;       
            
         } catch (NullPointerException | IOException e) {
             
             System.out.println("Erro getProperties(): " + e.getMessage());
             return null;
         }
    }
    
}
