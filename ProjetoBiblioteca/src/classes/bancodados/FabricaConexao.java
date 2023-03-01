
package classes.bancodados;

import classes.Mensagens;
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
            return conexao;

            //solução de erros
        } catch (SQLException | NullPointerException e) {
            
            new Mensagens().mensagemErro(e.getMessage());
            
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
             new Mensagens().mensagemErro(e.getMessage());
         }
        return null;
    }
    
}
