package src.jdbc;


import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//basicamente, dessa maneira, é como se fosse realizado através de OO.
public class DAO {
    
    //realizando a criação de um atributo do tipo Connection
    private Connection conexao;
    
    //criando uma função para realizar a inclusão
    //**observa-se que ele aceitará vários Objetos, atrvés da sintaxe => Objetos...atributos
    public int incluir(String sql, Object... atributos){
        
        
        try{
            //realizando a conexão com o banco de dados, 
            //nesse caso, será retornado o ID da linha addd
            PreparedStatement stmt = getConexao().prepareStatement(
                    sql, PreparedStatement.RETURN_GENERATED_KEYS);
            
            //add os atribuotos
            adicionarAtributos(stmt, atributos);
            
            
            if(stmt.executeUpdate() > 0){
                ResultSet resultado = stmt.getGeneratedKeys();
                
                if(resultado.next()){
                    return resultado.getInt(1);
                }
            }
            return -1;
       }catch(SQLException | NullPointerException e){
            System.out.println("Erro incluir(): " + e.getMessage());
            throw new RuntimeException(e);
        }
    }
    
    //fechando a conexão com o banco de dados 
    public void close(){
        try{
            getConexao().close();
        }catch(SQLException | NullPointerException e){
            System.out.println("Erro close(): " + e.getMessage());
        }finally{
            conexao = null;
        }
    }
    
    //adicionando os atributos, para serem adicionados no banco de dados
    private void adicionarAtributos(PreparedStatement stmt, Object[] atributos) throws SQLException{
        int indice = 1;
        
        //for para percorrer no objeto que contém os atributos, e pegar cada um para add
        for(Object atributo: atributos){
            
            if(atributo instanceof String){
                stmt.setString(indice, (String) atributo);
            }else if(atributo instanceof Integer){
                stmt.setInt(indice, (int) atributo);
            }
            indice++;
        }
        
    }
    
    //realizando a conexão com o banco de dados 
    private Connection getConexao(){
        
        try {
            if (conexao != null && !conexao.isClosed()) {
                return conexao;
            }
        } catch (SQLException | NullPointerException e) {
            System.out.println("Erro getConexao(): " + e.getMessage());
        }
        return FabricaConexao.getConexao();
        
    }
}
