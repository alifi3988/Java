
package classes.bancodados;

import classes.Mensagens;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DesativacaoDados {
    
    //a desativação do leitor, vai ser a alteração do campo Status somente, não haverá remoção do banco de dados
    public Boolean desativarDados(int IdLeitor){
        
        
        try {

            //criando o sql
            String sql = "UPDATE tb_leitores SET status = false WHERE id_leitor = ?;";
            //realizando a conexão com o BD
            Connection conexao = FabricaConexao.getConexao();
            try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
                stmt.setInt(1, IdLeitor);
                
                stmt.execute();
            }
            
            return true;
        } catch (SQLException e) {
            new Mensagens().mensagemErro(e.getMessage());
        }
        return false;
    }
    
}
