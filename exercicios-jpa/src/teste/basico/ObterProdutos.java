/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teste.basico;

import infra.ProdutoDAO;
import java.util.List;
import modelo.basico.Produto;

/**
 *
 * @author alifi
 */
public class ObterProdutos {
    public static void main(String[] args) {
        
        ProdutoDAO dao = new ProdutoDAO();
        
        List<Produto> produtos = dao.obterTodos();
        
        for(Produto p: produtos){
            System.out.println("ID: " + p.getId() + ", Nome: " + p.getNome_produto());
        }
        
        double precoTotal = produtos.stream()
                .map(p -> p.getPreco())
                .reduce(0.0, (t,p) -> t+p)
                .doubleValue();
        System.out.println("O Valor total é R$ " + precoTotal);
        
    }
}
