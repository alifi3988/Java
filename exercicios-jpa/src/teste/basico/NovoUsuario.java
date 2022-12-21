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
public class NovoUsuario {
    
    public static void main(String[] args) {
       try {
           
           //cada atributo da classe Usuario vai se tornar uma coluna
           
           //passando a conexão
            EntityManagerFactory emf = Persistence
                    .createEntityManagerFactory("exercicios-jpa");
            EntityManager em = emf.createEntityManager();
            
            //adicionando, informando os dados
            Usuario usr1 = new Usuario("Gabriel", "GabrielJesus@gmail.com");
            
            em.getTransaction().begin();
            em.persist(usr1);
            em.getTransaction().commit(); //tem que realizar o commmit para inserir os dados
            
            //fechando a conexão
            em.close();
            emf.close();
            
        } catch (Exception e) {
            
            System.out.println("Erro: " + e.getMessage());
            
        }
        

        
        
    }
  
}
