//tive como referência para essa classe do site:
//https://pt.wikibooks.org/wiki/PostgreSQL_Pr%C3%A1tico/Fun%C3%A7%C3%B5es_Internas/Data_e_Hora

//acho que realizar a formatação de hora no SQL é bem mais fácil, pois já traz funçõe prontas praticamente

package classes.bancoDados;

import classes.Mensagens;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

/**
 *
 * @author alifi
 */
public class recuperacaoData {
    
    
    public static String retornarSomaData(String dataAtual, String tipo, String tempo){
        
        try{
            //realizando a conexão com o banco de dados
            Connection conexao = FabricaConexao.getConexao();
            PreparedStatement stmt;
            if(null != tipo)switch (tipo) {
                case "dia" -> {
                    String sql = "SELECT CAST(? AS DATE) + INTERVAL '? DAYS' AS Data;";
                    stmt = conexao.prepareStatement(sql);
                    stmt.setString(1, dataAtual);
                    stmt.setString(2, tempo);
                    
                    ResultSet resultado = stmt.executeQuery();
                    
                    return resultado.getString("Data");
                    
                    }
                
                case "semana" -> {
                    String sql = "SELECT CAST(? AS DATE) + INTERVAL '? DAYS' AS Data;";
                    }
                
                case "mes" -> {
                }

            }
        }catch(SQLException ex){
            new Mensagens().mensagemErro(ex.getMessage());
        }
        
        return null;
        
    }
    
}
