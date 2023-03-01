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
                //colocando os valores nos parâmetros do SQL
                try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
                    //colocando os valores nos parâmetros do SQL
                    stmt.setString(1, nome_usuario);
                    stmt.setString(2, usuario);
                    stmt.setString(3, senha);
                    stmt.setBoolean(4, true); //passando o valor direto
                    //executando a query
                    stmt.execute();
                }
            }
            return true;
            
        } catch (SQLException e) {
            System.out.println("Error na inserção do BD: " + e.getMessage());
            return false;
        }
    }
    
    
    public Boolean cadastroLeitor(int id_usuario, String nome, String dataNascimento, String cpf, 
            String rg, String sexo, String cep, String bairro, String complemento, String endereco, String numero, 
            String estado, String telefone, Boolean status){

        try {
            //realizando a conexão com o banco de dados
            Connection conexao = FabricaConexao.getConexao();

            //realizando o SQL/Query
            String sql = "INSERT INTO tb_leitores(id_usuario, nome, dataNascimento, cpf, rg, sexo, cep, bairro, complemento, endereco, numero, estado, telefone, status) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
            
            //colocando os valores dos parâmetros
            try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
                //colocando os valores dos parâmetros
                stmt.setInt(1, id_usuario);
                stmt.setString(2, nome); 
                stmt.setString(3, dataNascimento);
                stmt.setString(4, cpf);
                System.out.println("CPF:"+cpf);
                stmt.setString(5, rg);
                stmt.setString(6, sexo);
                stmt.setString(7, cep);
                stmt.setString(8, bairro);
                stmt.setString(9, complemento);
                stmt.setString(10, endereco);
                stmt.setString(11, numero);
                stmt.setString(12, estado);
                stmt.setString(13, telefone);
                stmt.setBoolean(14, status);
                
                System.out.println(stmt);
                //executando
                stmt.execute();
            }
            return true;
            
        } catch (SQLException e) {
            
            System.out.println("Erro banco de dados cadastro leitor. " + e.getMessage());
        }

        return false;
    }
}
