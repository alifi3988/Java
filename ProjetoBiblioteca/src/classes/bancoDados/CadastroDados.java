package classes.bancoDados;

import classes.Livros;
import classes.Mensagens;
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
            String estado, String telefone, Boolean status, String cidade){

        try {
            //realizando a conexão com o banco de dados
            Connection conexao = FabricaConexao.getConexao();

            //realizando o SQL/Query
            String sql = "INSERT INTO tb_leitores(id_usuario, nome, dataNascimento, cpf, rg, sexo, cep, bairro, complemento, endereco, numero, estado, telefone, status, cidade) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
            
            //colocando os valores dos parâmetros
            try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
                //colocando os valores dos parâmetros
                stmt.setInt(1, id_usuario);
                stmt.setString(2, nome); 
                stmt.setString(3, dataNascimento);
                stmt.setString(4, cpf);
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
                stmt.setString(15, cidade);
                
                //executando
                stmt.execute();
            }
            return true;
            
        } catch (SQLException e) {
            
            System.out.println("Erro banco de dados cadastro leitor. " + e.getMessage());
        }

        return false;
    }
    
    
    public Boolean cadastroLivro(Livros livro){
        
        try {
            //realizando a conexão com o banco de dados
            Connection conexao = FabricaConexao.getConexao();
            String sql = "INSERT INTO tb_livros(nome_livro, autora, editora, dataEntrada, genero, status, corredor, pratilheira, setor) VALUES (?,?,?,?,?,?,?,?,?);";
            PreparedStatement stmt = conexao.prepareStatement(sql);
            
            stmt.setString(1, livro.getNome());
            stmt.setString(2, livro.getAutor());
            stmt.setString(3, livro.getEditora());
            stmt.setString(4, livro.getDataEntrada());
            stmt.setString(5, livro.getGenero());
            stmt.setBoolean(6, livro.isStatus());
            stmt.setString(7, livro.getCorredor());
            stmt.setString(8, livro.getPratilheira());
            stmt.setString(9, livro.getSetor());
            
            stmt.execute();
            
            return true;
            
        } catch (SQLException sqlex) {
            new Mensagens().mensagemErro(sqlex.getMessage());
        }
        
        return false;
    }
}
