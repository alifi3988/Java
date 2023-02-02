
package teste.consulta;

import infra.DAO;
import java.util.List;
import modelo.muitospramuitos.Atores;
import modelo.muitospramuitos.Filmes;

public class ObterFilmes {
    
    public static void main(String[] args) {
        
        DAO<Filmes> dao = new DAO<>(Filmes.class);
        
        List<Filmes> filmes = dao.consultar("obterfilmesComNotaMaiorQue", "nota", 8.05);
        
        for(Filmes f: filmes){
            
            System.out.println("Nome do Filme: " + f.getNome() + " | Nota" + f.getNota());
            
            for(Atores a: f.getAtores()){
                System.out.println("Atores: " + a.getNome());
            }
        }
       
        
    }
    
}
