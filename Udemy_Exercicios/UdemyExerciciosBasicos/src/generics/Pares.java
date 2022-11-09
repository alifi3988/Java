/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package generics;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

/**
 *
 * @author alifi
 * @param <C>
 */
public class Pares<C extends Number, V> {
    
    private final Set<Par<C, V>> itens = new HashSet<>();
    
    public void adicionar(C chave, V valor){
        if(chave == null) return;
        
        Par<C,V> novoPar = new Par<C,V>(chave, valor);
        
        if(itens.contains(novoPar)) //removendo para poder atualizar o valor que contém na chave
            itens.remove(novoPar);
        itens.add(novoPar);
        
    }
    
    public V getValor(C chave){
        if(chave == null) return null;
        
        Optional<Par<C, V>> parOpcional = itens.stream()
                .filter(par -> chave.equals(par.getChave()))
                .findFirst();
        
        return parOpcional.isPresent() ? parOpcional.get().getValor() : null;
    }
    
}
