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
public class RemoverUsuario {
    
    public static void main(String[] args) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
        EntityManager em = emf.createEntityManager();
        
        Usuario usr = em.find(Usuario.class, 3L);
        
        //if de verificação se o valor passado não é null
        if(usr != null){
            em.getTransaction().begin();
            em.remove(usr);
            em.getTransaction().commit();
        }else{
            System.out.println("Dado selecionado não existe!");
        }
        em.close();
        emf.close();
        
    }
    
}
