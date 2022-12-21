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
public class AlterarUsuario3 {
    
    public static void main(String[] args) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        
        Usuario usr = em.find(Usuario.class, 3L);
        em.detach(usr); //faz com que não o objeto seja não gerenciado
        //assim só será alterado, se o em.merge(usr); estiver ativo
        
        usr.setNome("Dedé bolsonarista");
        
        em.merge(usr); //aqui no caso
        
        em.getTransaction().commit();
        
        em.close();
        emf.close();
    }
    
}
