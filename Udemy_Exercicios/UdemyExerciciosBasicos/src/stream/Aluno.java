/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stream;

import java.util.Objects;

/**
 *
 * @author alifi
 */
public class Aluno {
    
    String nome;
    double media;
    boolean bomComportamento;
    
    public Aluno(String nome, double media){
        this(nome, media, true);
    }

    public Aluno(String nome, double media, boolean bomComportamento) {
        this.nome = nome;
        this.media = media;
        this.bomComportamento = bomComportamento;
    }

    @Override
    public String toString() {
        return this.nome;
    }

    @Override
    public boolean equals(Object obj) {
        
        if(this == obj) return true;
        if(obj == null) return false;
        if(getClass() != obj.getClass()) return false;
        Aluno other = (Aluno) obj;
        if(bomComportamento != other.bomComportamento) return false;
        if(nome == null)
            if(other.nome != null) return false;
        else if(!nome.equals(other.nome)) return false;
        if(Double.doubleToLongBits(media) != Double.doubleToLongBits(other.media)) return false;
        return true;       
        
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.nome);
        hash = 43 * hash + (int) (Double.doubleToLongBits(this.media) ^ (Double.doubleToLongBits(this.media) >>> 32));
        hash = 43 * hash + (this.bomComportamento ? 1 : 0);
        return hash;
    }
   
    
}
