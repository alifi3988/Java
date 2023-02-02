/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teste.muitospramuitos;

import infra.DAO;
import modelo.muitospramuitos.Atores;
import modelo.muitospramuitos.Filmes;

/**
 *
 * @author alifi
 */
public class NovoFilmeAtor {
    
    public static void main(String[] args) {
        
        Filmes f1 = new Filmes("Star Wars Ep. 4", 8.7);
        Filmes f2 = new Filmes("Em busc de uma vingança", 5.6);
        
        Atores a1 = new Atores("Harrison Ford");
        Atores a2 = new Atores("Carrie Fisher");
        
        f1.getAtores().add(a1);
        a1.getFilmes().add(f1);
       
        f2.adicionarAtor(a2);
        a2.getFilmes().add(f2);
        
        f1.getAtores().add(a2);
        a2.getFilmes().add(f1);
        
        f2.getAtores().add(a1);
        a1.getFilmes().add(f2);

        DAO<Filmes> dao = new DAO<>();
        dao.incluirAtomico(f1);
        
        
    }
    
}
