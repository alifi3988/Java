package classes.bancodados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CadastroDados {
    
    public Boolean cadastroUsuario(String nome_usuario, String usuario, String senha){
        
        //realizando a conexão com o banco de dados
        try {
            
            //query de cadastro
            try ( //iniciando a conexão com o Banco de dados
                    Connection conexao = FabricaConexao.getConexao()) {
                //query de cadastro
                String sql = "INSERT INTO tb_usuarios(nome_usuario, usuario, senha, estado) VALUES (?,?,?,?);";
                PreparedStatement stmt = conexao.prepareStatement(sql);
                
                System.out.println(nome_usuario);
                System.out.println(usuario);
                System.out.println(senha);
                
                //colocando os valores nos parâmetros do SQL
                stmt.setString(1, nome_usuario);
                stmt.setString(2, usuario);
                stmt.setString(3, senha);
                stmt.setBoolean(4, true); //passando o valor direto
                //executando a query
                stmt.execute();
                //fechando a conexao
            }
            return true;
            
        } catch (SQLException e) {
            System.out.println("Error na inserção do BD: " + e.getMessage());
            return false;
        }
    }
    
}
