package src.jdbc;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ConsultarPessoa1 {
    
    public static List PesquisaBanco()throws SQLException{
        
        //realizando a conexão com o Banco de dados
        Connection conexao = FabricaConexao.getConexao();
        
        //Definindo o Select
        String  sql = "SELECT * FROM tb_pessoas;";
        
        Statement stmt = conexao.createStatement();
        
        //colhendo o resultado da pesquisa
        ResultSet resultado = stmt.executeQuery(sql);
        
        List<Pessoa> pessoa = new ArrayList<>();
        
        
        while(resultado.next()){
            int codigo = resultado.getInt("id_pessoa");
            String nome = resultado.getString("nome");
            
            pessoa.add(new Pessoa(codigo, nome));
        }
             
        //finalizando a conexão
        stmt.close();
        conexao.close();
        
        //retornando dados
        return pessoa;
    }

    public static void main(String[] args) throws SQLException {
        
        //recenedo o valor da pesquisa
        List<Pessoa> resultado = PesquisaBanco();
        
        for (Pessoa p:resultado){
            System.out.println("Código: " + p.getCodigo());
            System.out.println("Nome: " + p.getNome());
            System.out.println("-----------------------------------------------");
        }        
    }
}
