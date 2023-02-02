/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teste.umpraum;

import infra.DAO;
import modelo.umpraum.Cliente;

/**
 *
 * @author alifi
 */
public class ObterClienteAssento {
    
    public static void main(String[] args) {
        
        DAO<Cliente> dao = new DAO<>(Cliente.class);
        
        Cliente cliente1 = dao.obterPorID(1L);
        Cliente cliente2 = dao.obterPorID(2L);

        
        System.out.println("\nAssento: " + cliente1.getAssento().getNome() + "| Cliente: " + cliente1.getNome());
        System.out.println("Assento: " + cliente2.getAssento().getNome() + " | Cleinte: " + cliente2);
        
        dao.fecharConexao();
    }
    
}
