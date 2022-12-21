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
public class AlterarUsuario1 {
    
    public static void main(String[] args) {
        
        //realizando a conexão com o banco 
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
        EntityManager em = emf.createEntityManager();
        
        //inicindo uma conexão com o banco de dados
        em.getTransaction().begin();
        
        Usuario usr = em.find(Usuario.class, 3L);
        usr.setNome("Leonardo");
        usr.setEmail("leonardo@lanche.com.br");
        
        //realiza o uppdate
        em.merge(usr);
        
        
        //commitando para salvar as alterações
        em.getTransaction().commit();
        
        //fechando conexão
        em.close();
        emf.close();
        
        
    }
    
}
