
package src.jdbc;

public class DAOTeste {
    
    
    public static void main(String[] args) {
        
        DAO dao = new DAO();
        
        String sql = "INSERT INTO tb_pessoas (nome) VALUES (?)";
        
        System.out.println("ID add: " + dao.incluir(sql, "João da SIlva de OLiveira"));
        System.out.println("ID add: " + dao.incluir(sql, "Gabriela Tallamini"));
        System.out.println("ID add: " + dao.incluir(sql, "Paola Frazão"));
        System.out.println("ID add: " + dao.incluir(sql, "Itálo David"));
        
        dao.close();
    }
    
}
