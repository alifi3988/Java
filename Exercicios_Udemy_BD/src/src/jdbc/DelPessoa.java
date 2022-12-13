package src.jdbc;


import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;

import java.util.Scanner;


public class DelPessoa {
    static String deletePessoa(int id){
        try {
            Connection conexao = FabricaConexao.getConexao();
            String sql = "DELETE FROM tb_pessoas WHERE id_pessoa = ?";
            PreparedStatement stmt = conexao.prepareStatement(sql);
            
            stmt.setInt(1, id);
            //stmt.execute();
            
            int cont = stmt.executeUpdate();
            
            stmt.close();
            conexao.close();
            
            
            return "Dado excluído com sucesso! \nForam modificados: " + cont + " linhas";
            
        } catch (SQLException ex) {
            return "Dado não excluído. Erro: " + ex.getMessage();
        }
    }
    
    public static void main(String[] args) throws SQLException {
        
        //Entrando com os dados
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Informe o ID para ser excluído: ");
        int id = entrada.nextInt();
        
        String saida = deletePessoa(id);
        
        System.out.println(saida);

    }
}
