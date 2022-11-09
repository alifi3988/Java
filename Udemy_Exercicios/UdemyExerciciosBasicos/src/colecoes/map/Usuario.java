/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colecoes.map;

import java.util.Objects;

/**
 *
 * @author alifi
 */
public class Usuario {
    String nome;
    
    Usuario(String usuario){
        this.nome = usuario;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
    

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        return Objects.equals(this.nome, other.nome);
    }
}
