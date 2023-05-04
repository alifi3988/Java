/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes.bancoDados;

import classes.Leitor;
import classes.Mensagens;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


/**
 *
 * @author alifi
 */
public class UpdateDados {
    
    //pensar em como posso realizar a transição do ID do Usuário pelo programa sem variaveis globais
    
    public Boolean editarDadosCompleto(Leitor leitor){
        
        //realizando a conexão com o banco de dados
        Connection conexao = FabricaConexao.getConexao();
        String sql = "UPDATE tb_leitores SET nome = ?, datanascimento = ?, cpf = ?, rg = ?, sexo = ?, cep = ?, bairro = ?, complemento = ?, endereco = ?, numero = ?, estado = ?, telefone = ?, cidade = ? WHERE id_leitor = ?";
        try {
            
            PreparedStatement stmt = conexao.prepareStatement(sql);
            
            stmt.setString(1, leitor.getNome());
            stmt.setString(2, leitor.getDataNascimento());
            stmt.setString(3, leitor.getCpf());
            stmt.setString(4, leitor.getRg());
            stmt.setString(5, leitor.getSexo());
            stmt.setString(6, leitor.getCep());
            stmt.setString(7, leitor.getBairro());
            stmt.setString(8, leitor.getComplemento());
            stmt.setString(9, leitor.getEndereco());
            stmt.setString(10, leitor.getNumero());
            stmt.setString(11, leitor.getEstado());
            stmt.setString(12, leitor.getTelefone());
            stmt.setInt(13, leitor.getId_leitor());
            stmt.setString(14, leitor.getCidade());
            
            stmt.execute();
            return true;
            
        } catch (SQLException ex) {
            new Mensagens().mensagemErro(ex.getMessage());
        }
        
        return false;
    }
    
    
}
