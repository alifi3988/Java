/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.basico;

import java.text.DecimalFormat;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author alifi
 */
@Entity
@Table(name="tb_produtos")
//o esquema realiza uma forçação, onde faz com que busca o schema expecífico. 
//É bom para quando tem muitas tables
public class Produto{
    
    //atributos   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //faz com que o ID seja auto-increment
    private long id;
    
    @Column(name="nm_produto", length = 120, nullable = false) //definindo o nome, o tamanho e que não pode haver valores nullos
    private String nome_produto;
    
    @Column(nullable = false,precision = 11, scale = 2) //definindo as casas decimais e o valor máximo de casas ao total
    private double preco;
    
    private int qtd_estoque;
    
    private String inf_prod;
    
    //construtor padrão (OBRIGATÓRIO)

    public Produto() {
    }
    
    public Produto(String nome_produto, double preco, int qtd_estoque, String inf_prod) {
        super();
        this.nome_produto = nome_produto;
        this.preco = preco;
        this.qtd_estoque = qtd_estoque;
        this.inf_prod = inf_prod;
    }
      
    //métodos
    
    //GETS
    public long getId() {
        return id;
    }

    public String getInf_prod() {
        return inf_prod;
    }

    public String getNome_produto() {
        return nome_produto;
    }

    public double getPreco() {
        return preco;
    }

    public int getQtd_estoque() {
        return qtd_estoque;
    }
    
    //SETS

    public void setId(long id) {
        this.id = id;
    }

    public void setInf_prod(String inf_prod) {
        this.inf_prod = inf_prod;
    }

    public void setNome_produto(String nome_produto) {
        this.nome_produto = nome_produto;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setQtd_estoque(int qtd_estoque) {
        this.qtd_estoque = qtd_estoque;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#,###.00");
        
        String inf = "ID: " + getId()
                + "Produto: " + getNome_produto()
                + "Estoque: " + getQtd_estoque()
                + "Valor Unitário: R$" + (df.format(getPreco()));
        return inf;
    }  
}
