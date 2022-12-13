
package src.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.PreparedStatement;

public class NovaPessoa {
    
    public static void insercaoTable(String nome) throws SQLException{
        
        Connection conexao = FabricaConexao.getConexao();
        
        //preparando o código, passando dois parâmetros na String
        String sql = "INSERT INTO tb_pessoas(nome) VALUES (?);";
        
        //essa passagem fazer entender que o que está sendo passado é uma string e não um código SQL
        PreparedStatement stmt = conexao.prepareStatement(sql);
        
        //alimentando os parâmetros passados
        stmt.setString(1, nome);
                
        stmt.execute();
        conexao.close();
        
        System.out.println("Dado inserido com sucesso!");
    }

    public static void main(String[] args) throws SQLException{
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Informe o nome: ");
        String nome = entrada.nextLine();
        
        insercaoTable(nome);

        ///fechamento da entrada
        entrada.close();
    }
}
