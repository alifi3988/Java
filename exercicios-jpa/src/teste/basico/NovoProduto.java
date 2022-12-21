package teste.basico;

import infra.DAO;
import modelo.basico.Produto;

public class NovoProduto {
    
    public static void main(String[] args) {
        
        Produto produto = new Produto("Caneta Verde", 7.45, 10, "Caneta BIG cor Verde");
        
        System.out.println(produto.toString());
        
        try{
            DAO<Produto> dao = new DAO<>(Produto.class);
            dao.incluirAtomico(produto);
        }catch(Exception e){
            System.out.println("Erro: " + e.getMessage());
        }
        
       
        
    }  
}
