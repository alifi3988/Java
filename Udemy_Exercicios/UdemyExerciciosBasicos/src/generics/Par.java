/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package generics;

/**
 *
 * @author alifi
 */
public class Par<C, V> {
    
    private C chave;
    private V valor;

    public Par(C chave, V valor) {
        this.chave = chave;
        this.valor = valor;
    }
    
    public C getChave() {
        return chave;
    }

    public V getValor() {
        return valor;
    }

    public void setChave(C chave) {
        this.chave = chave;
    }

    public void setValor(V valor) {
        this.valor = valor;
    }
    
    @Override
    public int hashCode() {
        return super.hashCode(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }


    
    
    
}
