
package modelo.umpramuitos;

import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_pedido")
public class Pedido {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_pedido;
    
    @Column(nullable = false)
    private Date data;
    
    @OneToMany(mappedBy = "pedido")
    private List<ItemPedido> itens;
    

    public Pedido() {
        this(new Date());
    }

    public Pedido(Date data) {
        super();
        this.data = data;
    }

    public Long getId() {
        return id_pedido;
    }

    public void setId(Long id_pedido) {
        this.id_pedido = id_pedido;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public void setItens(List<ItemPedido> itens) {
        this.itens = itens;
    }
    
    
    
    
    
    
    
    
}
