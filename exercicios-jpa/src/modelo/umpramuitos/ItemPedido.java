
package modelo.umpramuitos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import modelo.basico.Produto;

@Entity(name = "tb_itempedido")
public class ItemPedido {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne
    private Pedido pedido;
    
    @ManyToOne
    private Produto produto;
    
    @Column(nullable = false)
    private int qtd;
    
    @Column(nullable = false)
    private Double preco;

    public ItemPedido() {
    }

    public ItemPedido(Pedido pedido, Produto produto, int qtd) {
        super();
        this.pedido = pedido;
        this.produto = produto;
        this.qtd = qtd;
        this.setPreco(produto.getPreco());
    }
    
    //métodos GETS e SETS

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }
    
    public double getPreco(){
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
    
    
    //método de finalização do Pedido
    
    
    
    
    
    
    
    
    
    
}
