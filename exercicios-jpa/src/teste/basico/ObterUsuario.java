/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import modelo.basico.Usuario;

/**
 *
 * @author alifi
 */
public class ObterUsuario {
    
    public static void main(String[] args) {
        
        EntityManagerFactory emf = Persistence
                .createEntityManagerFactory("exercicios-jpa");
        EntityManager em = emf.createEntityManager();
        
        Usuario usr1 = em.find(Usuario.class, 3L);
        
        System.out.println("Nome do usuário: " + usr1.getNome());
        
        em.close();
        emf.close();
        
        
        
        
        
    }
    
}
