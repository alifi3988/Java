package src.jdbc;


//importações do banco de dados
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class UppdatePessoa {
    
    //criando um método para atualizar BD
    //no casoess atualização será simples
    public static List updateTabela(String table, String campo, String valor, int id){
        
        try {
            
            //realizando a sintaxe do update
            String sql = "UPDATE tb_pessoas SET nome = ? WHERE id_pessoa = ?;";
                        
            //abrira conexão com o banco de dados
            Connection conexao = FabricaConexao.getConexao();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            
            //colocando os valores dos parâmetros
            stmt.setString(1, valor);
            stmt.setInt(2, id);
                        
            //executando a primeira query
            stmt.execute();
            stmt.close();
            
            //realizando o select
                        
            //realizando o select
            String sql2 = "SELECT * FROM tb_pessoas WHERE id_pessoa = ?;";
            PreparedStatement stmt2 = conexao.prepareStatement(sql2);
            
            //pssagem dos parâmetros
            stmt2.setInt(1, id);
            
            //executando a segunda query e capturando o resultado
            ResultSet resultado = stmt2.executeQuery();
            
            
            List<Pessoa> pessoa = new ArrayList<>();
            
            if(pessoa == null) return null;
            
            while(resultado.next()) {
                int id_pessoa = resultado.getInt("id_pessoa");
                String nome = resultado.getString("nome");
                
                pessoa.add(new Pessoa(id_pessoa, nome));  
            }
           
            stmt2.close();
            conexao.close();   
            return pessoa;
            
        } catch (SQLException ex) {
            System.out.println("Erro: " + ex.getMessage());
        }
        return null;
    }
   
    public static void main(String[] args) {
        
        List<Pessoa> pessoa = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe o ID que será modificado: ");
        int id = entrada.nextInt();
        
        
        System.out.println("\nInforme o nome para ser atualizado: ");
        entrada.nextLine();
        String valor = entrada.nextLine();
        
        pessoa = updateTabela("tb_pessoas", "nome", valor, id); 
        
        //verificação do dado recebido
        if(pessoa == null){
            System.out.println("Não foi modificado ou recuperado nenhum dado!");
        }else{
            for(Pessoa p: pessoa){
                System.out.println("---------------------------------------------");
                System.out.println("ID: " + p.getCodigo() + " | Nome (atualizado): " + p.getNome());
            }
        }
        
        entrada.close();
    }  
}
