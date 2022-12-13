package src.jdbc;

//importações do banco de dados
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;



public class CriarTabelaPessoas {
    
    public static void criarTable(String table) throws SQLException{
        
        //realizando a conexão com o banco de dados
        Connection conexao = FabricaConexao.getConexao();
        
        Statement stmt = conexao.createStatement();
        stmt.execute(table);
        System.out.println("Tabela Criada com sucesso!");
        conexao.close();
    }
    
    public static void main(String[] args) {
        
        try {
            //Chamando o método para criar a table
            String sql = "CREATE TABLE IF NOT EXISTS tb_pessoas("
                    + "id_pessoa INT AUTO_INCREMENT, "
                    + "nome VARCHAR(80) NOT NULL, "
                    + "CONSTRAINT tb_pess_id PRIMARY KEY (id_pessoa)"
                    + ");";
            
            criarTable(sql);            
        } catch (SQLException ex) {
            System.out.println("Erro: " + ex.getMessage());
        }   
    }
}
