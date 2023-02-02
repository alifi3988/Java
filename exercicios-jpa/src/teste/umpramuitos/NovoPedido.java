package teste.umpramuitos;

import infra.DAO;
import modelo.basico.Produto;
import modelo.umpramuitos.ItemPedido;
import modelo.umpramuitos.Pedido;

public class NovoPedido {
    
    public static void main(String[] args) {

        DAO<Object> dao = new DAO<>();
        
        Produto produto1 = new Produto("Geladeira", 2789.99, 5, "Geladeira Brastemp Branca");
        Pedido pedido1 = new Pedido();
        ItemPedido item1 = new ItemPedido(pedido1, produto1, 2);
        
        //realizando a transação
        dao
                .abrirTransacao()
                .incluir(produto1)
                .incluir(pedido1)
                .incluir(item1)
                .fecharTransacao()
                .fecharConexao();
    }
    
}
