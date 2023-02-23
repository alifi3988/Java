package classes.bancodados;

import classes.Usuarios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RecuperacaoDados{
    
    
    
    //recuperação de dados - usuários
    public List recuperacaoDadosLogin(String usuario, String senha){
                
        try {
            //realizando a conexão com o banco de dados
            Connection conexao = FabricaConexao.getConexao();
            
            //criando a query para pesquisa no BD
            String sql = "SELECT * FROM tb_usuarios WHERE usuario LIKE ?;";
            
            
            PreparedStatement stmt = conexao.prepareStatement(sql);

            //colocando os valores nos parâmetros da sql
            stmt.setString(1, "%" + usuario + "%");

            //executando a query e colhendo os resultados
            ResultSet resultado = stmt.executeQuery();
            
            //criando uma lista de usuários, para ser realizado um armazenamento temporário
            List<Usuarios> NovoUsuario = new ArrayList<>();
            
            //verificando do resultado
            if(resultado == null) return null;
            
            //fazendo a verificação e colhendo os resultados
            while (resultado.next()) {
                
                //pegando os dados
                int id = resultado.getInt("id_usuario");
                String nome = resultado.getString("nome_usuario");
                String usr = resultado.getString("usuario");
                String passd = resultado.getString("senha");
                Boolean status = resultado.getBoolean("estado");
                
                //pegando os dados
                Usuarios user = new Usuarios(id, nome, usr, passd, status);
                
                //add os usuário recuperados
                NovoUsuario.add(user);   
            }
            
            stmt.close();
            System.out.println("Retornando a lista de novos usuarios");
            return NovoUsuario;
            
        //se o dado recuperado for somente um, então vai fazer uma verificação inicial
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Retornando lista de null");
        return null;
    }//fechamento do método 

 
}
