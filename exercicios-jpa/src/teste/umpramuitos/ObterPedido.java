/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teste.umpramuitos;

import infra.DAO;
import modelo.umpramuitos.ItemPedido;
import modelo.umpramuitos.Pedido;

/**
 *
 * @author alifi
 */
public class ObterPedido {
    
    public static void main(String[] args) {
        
        DAO<Pedido> dao = new DAO<>(Pedido.class);

        Pedido pedido = dao.obterPorID(2L);
        
        for(ItemPedido item: pedido.getItens()){
            System.out.println("Produto: " + item.getProduto().getNome_produto() + " | Quantidade: " + item.getQtd());
        }
        
        dao.fecharConexao();
    }
    
}
