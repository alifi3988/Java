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
public class AlterarUsuario2 {
    
    public static void main(String[] args) {
        
        //criação da conexão
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
        EntityManager em = emf.createEntityManager();
        
        //criando uma transição
        em.getTransaction().begin();
        
        //chamando a classe Usuário
        Usuario usr = em.find(Usuario.class, 3L);
        usr.setNome("Leonardo Alterado");
        usr.setEmail("Leonardo@lanche.com.br");
        
        //realiza a modificação
        //em.merge(usr);
        //Como o objeto está no estado gerenciado, ele atualização mesmo que o em.merge(usr) está comentado
        //no caso para que isso não ocorra, tem que desabilitar o objeto no modo gerenciado (AlterarUsuario3)
        
        
        
        //commitando a transição
        em.getTransaction().commit(); 
        
        em.close();
        emf.close();
        
        
        
        
    }
    
}
