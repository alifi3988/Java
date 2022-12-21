/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teste.basico;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import modelo.basico.Usuario;

/**
 *
 * @author alifi
 */
public class ObterUsuarios {
    
    public static void main(String[] args) {
            
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
        EntityManager em = emf.createEntityManager();
        
        
        String jpql = "SELECT u FROM Usuario u";
        
        TypedQuery<Usuario> query = em.createQuery(jpql, Usuario.class);
        query.setMaxResults(5); //setando a quantidade máxima de resultados
        
        List<Usuario> usr = query.getResultList();
        
        for(Usuario u:usr){
            System.out.println("ID: " + u.getId() + " | Nome: " + u.getNome());
        }
        
        
        em.close();
        emf.close();
    }
    

    
    
    
    
    
}
