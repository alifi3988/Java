/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.muitospramuitos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 *
 * @author alifi
 */

@Entity
@Table(name = "tb_filmes")
public class Filmes implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String nome;
    
    @Column(nullable = false)
    private Double nota;
    
    @ManyToMany(cascade = CascadeType.PERSIST)
    @Column(nullable = false)
    @JoinTable(
            name="atores_filmes",
            joinColumns = @JoinColumn(name = "filme_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "ator_id", referencedColumnName = "id")
    )
    private List<Atores> atores;
    
    //CONSTRUTORES

    public Filmes() {
    }
    
    
    public Filmes(String nome, Double nota) {
        super();
        this.nome = nome;
        this.nota = nota;
    }
    
    //MÉTODOS GETS E SETS

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public List<Atores> getAtores() {
        if(atores == null){
            atores = new ArrayList<>();
        }
        return atores;
    }

    public void setAtores(List<Atores> atores) {
        this.atores = atores;
    }
    
    //relizando a inserção facilitada
    public void adicionarAtor(Atores ator){
        if(ator != null && getAtores().contains(ator)){
            getAtores().add(ator);
            if(!ator.getFilmes().contains(this)){
                ator.getFilmes().add(this);
            }
        }
    }
}
