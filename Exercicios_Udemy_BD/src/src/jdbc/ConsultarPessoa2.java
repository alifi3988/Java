
package src.jdbc;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

//importações do BD
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;


//realizando a consulta no BD na tb_pessoa, com o Like dinâmico, deixando o usuário definir o que deseja procurar
public class ConsultarPessoa2 {
    
    public static List pesquisaTable(String palavra){
        
        try {
            //realizando a conexão com o Banco de Dados
            Connection conexao = FabricaConexao.getConexao();
            
            //realizando a instrução de pesquisa
            String sql = "SELECT * FROM tb_pessoas WHERE nome LIKE ?;";
            
            //essa passagem fazer entender que o que está sendo passado é uma string e não um código SQL
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, "%" + palavra + "%");
                        
            ResultSet resultado = stmt.executeQuery();

            List<Pessoa> pessoa = new ArrayList<>();
            
            
            while(resultado.next()){
                
                int codigo = resultado.getInt("id_pessoa");
                String nome = resultado.getString("nome");
                
                pessoa.add(new Pessoa(codigo, nome));
            }
            
            stmt.close();
            conexao.close();
                
            return pessoa;
        } catch (SQLException ex) {
            System.out.println("Erro: " + ex.getMessage());
        }
        return null;
    }
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);      
        List<Pessoa> pessoa = new ArrayList<>();
        
       
        System.out.print("Informe um palavra para ser pesquisa na tabela de nomes:");
        String palavra = entrada.next();
        
        pessoa = pesquisaTable(palavra);
        
        System.out.println("Palavra pesquisada: " + palavra);
        System.out.println("--------------------------------------------------------------------");
        if(pessoa == null){
            System.out.println("Resultado retornado foi NULL");
        }else{
            for(Pessoa p: pessoa){
                System.out.print("Código: " + p.getCodigo());
                System.out.println(" | Nome: " + p.getNome());
                System.out.println("--------------------------------------------------------------------");
            }
        }
        
 
    }
    
}
