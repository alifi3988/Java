package classes.bancoDados;

import classes.Leitor;
import classes.Livros;
import classes.Mensagens;
import classes.Usuarios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RecuperacaoDados{
    
    
    
    //recuperação de dados - usuário
    public List recuperacaoDadosLogin(String usuario, String senha){
                
        try {
            PreparedStatement stmt;
            List<Usuarios> NovoUsuario;
            //criando a query para pesquisa no BD
            try ( //realizando a conexão com o banco de dados
                    Connection conexao = FabricaConexao.getConexao()) {
                //criando a query para pesquisa no BD
                
                String sql = "SELECT * FROM tb_usuarios WHERE usuario LIKE ?;";
                stmt = conexao.prepareStatement(sql);
                //colocando os valores nos parâmetros da sql
                stmt.setString(1, "%" + usuario + "%");
                //executando a query e colhendo os resultados
                ResultSet resultado = stmt.executeQuery();
                //criando uma lista de usuários, para ser realizado um armazenamento temporário
                NovoUsuario = new ArrayList<>();
                //verificando do resultado
                if(resultado == null) return null;
                //fazendo a verificação e colhendo os resultados
                while (resultado.next()) {
                    
                    //pegando os dados
                    int id = resultado.getInt("id_usuario");
                    String nome = resultado.getString("nome_usuario");
                    String usr = resultado.getString("usuario");
                    String passd = resultado.getString("senha");
                    Boolean status = resultado.getBoolean("estado");
                    
                    //pegando os dados
                    Usuarios user = new Usuarios(id, nome, usr, passd, status);
                    
                    //add os usuário recuperados
                    NovoUsuario.add(user);
                }   
            }
            return NovoUsuario;
            
        //se o dado recuperado for somente um, então vai fazer uma verificação inicial
        } catch (SQLException e) {
            new Mensagens().mensagemErro(e.getMessage());
        }
        return null;
    }//fechamento do método 

    public static List receuparacaoDadosLeitores(String tipoDado, String dado){
        
        List<Leitor> leitoresRecuperado = new ArrayList<>();
        String valor = "";
        if(null != tipoDado)switch (tipoDado) {
            case "id_leitor" -> valor = tipoDado;
            case "nome" -> valor = tipoDado;
            case "cpf" -> valor = tipoDado;
            case "rg" -> valor = tipoDado;
        }
        if(valor != "id_leitor"){
            String sql = "SELECT * FROM tb_leitores WHERE " + valor + " LIKE ? ORDER BY id_leitor;";
            try ( //realizando a conexão com o banco de dados
                    Connection conexao = FabricaConexao.getConexao()) {

                //finalizando a conexão com o banco de dados
                //Serão recuperados os seguintes dados: nome, cpf, telefone

                ResultSet resultado = null;

                try(PreparedStatement stmt = conexao.prepareStatement(sql)){
                    stmt.setString(1, "%"+dado+"%");
                    //executando a query e colhendo os resultados
                    resultado = stmt.executeQuery();
                }catch(SQLException e){
                    new Mensagens().mensagemErro(e.getMessage());
                }

                if(resultado == null) return null;

                while(resultado.next()){
                    Leitor leitor = new Leitor();
                    if(resultado.getBoolean("status") == true){
                        leitor.adicionarLeitor(

                                resultado.getInt("id_leitor"),
                                resultado.getInt("id_usuario"),
                                resultado.getString("nome"),
                                resultado.getString("datanascimento"),
                                resultado.getString("cpf"),
                                resultado.getString("rg"),
                                resultado.getString("sexo"),
                                resultado.getString("cep"),
                                resultado.getString("bairro"),
                                resultado.getString("complemento"),
                                resultado.getString("endereco"),
                                resultado.getString("numero"),
                                resultado.getString("estado"),
                                resultado.getString("telefone"),
                                resultado.getBoolean("status"),
                                resultado.getString("cidade"));
                        leitoresRecuperado.add(leitor);
                    }
                }               
                return leitoresRecuperado;
            }catch(Exception e){
                new Mensagens().mensagemAlerta(e.getMessage());
            }
        }else if(valor == "id_leitor"){
            String sql = "SELECT * FROM tb_leitores WHERE " + valor + " = ?;";
            try ( //realizando a conexão com o banco de dados
                    Connection conexao = FabricaConexao.getConexao()) {

                //finalizando a conexão com o banco de dados
                //Serão recuperados os seguintes dados: nome, cpf, telefone

                ResultSet resultado = null;

                try(PreparedStatement stmt = conexao.prepareStatement(sql)){
                    stmt.setInt(1, Integer.parseInt(dado));
                    //executando a query e colhendo os resultados
                    resultado = stmt.executeQuery();
                }catch(SQLException e){
                    new Mensagens().mensagemErro(e.getMessage());
                }

                if(resultado == null) return null;

                while(resultado.next()){
                    Leitor leitor = new Leitor();
                    if(resultado.getBoolean("status") == true){
                        leitor.adicionarLeitor(

                                resultado.getInt("id_leitor"),
                                resultado.getInt("id_usuario"),
                                resultado.getString("nome"),
                                resultado.getString("datanascimento"),
                                resultado.getString("cpf"),
                                resultado.getString("rg"),
                                resultado.getString("sexo"),
                                resultado.getString("cep"),
                                resultado.getString("bairro"),
                                resultado.getString("complemento"),
                                resultado.getString("endereco"),
                                resultado.getString("numero"),
                                resultado.getString("estado"),
                                resultado.getString("telefone"),
                                resultado.getBoolean("status"),
                                resultado.getString("cidade"));
                        leitoresRecuperado.add(leitor);
                    }
                }               
                return leitoresRecuperado;
            }catch(Exception e){
                new Mensagens().mensagemAlerta(e.getMessage());
            }
        }
        return null;
    }
    
    public static List recuperacaoDadosLivros(String tipoDado, String dado){
        
        List<Livros> livros = new ArrayList<>();
        PreparedStatement stmt;
        
        try{
            Connection conexao = FabricaConexao.getConexao();
            
            if(tipoDado == "id_livro"){
                String sql = "SELECT * FROM tb_livros WHERE id_livro = ?";
                stmt = conexao.prepareStatement(sql);
                stmt.setInt(1, Integer.parseInt(tipoDado));

            }else{
                String sql = "SELECT * FROM tb_livros WHERE ? = ?";
                stmt = conexao.prepareStatement(sql);
                stmt.setString(1, tipoDado);
                stmt.setString(2, dado);

            }
            
            ResultSet resultado = stmt.executeQuery();
            
            if(resultado == null) return null;
            
            
            while (resultado.next()) {
                Livros lvr = new Livros(
                        resultado.getString("nome_Livro"), 
                        resultado.getString("autora"), 
                        resultado.getString("editora"), 
                        resultado.getString("dataEntrada"), 
                        resultado.getString("genero"), 
                        resultado.getBoolean("status"),
                        resultado.getString("corredor"),
                        resultado.getString("pratilheira"),
                        resultado.getString("setor")
                );
                
                livros.add(lvr);
            }
            
            return livros;
        }catch(SQLException ex){
            new Mensagens().mensagemErro(ex.getMessage());
        }
        return null;
    }
}
    

