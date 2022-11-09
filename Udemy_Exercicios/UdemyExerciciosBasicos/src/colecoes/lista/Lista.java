/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colecoes.lista;

import java.util.ArrayList;

/**
 *
 * @author alifi
 */
public class Lista {
    public static void main(String[] args) {
        
        ArrayList<Usuario> lista = new ArrayList<>();
        
        Usuario u1 = new Usuario("Alifi");
        lista.add(u1);
        
        lista.add(new Usuario("Ana"));
        lista.add(new Usuario("João"));
        
        System.out.println(lista.get(2).nome); //buscando pelo id da lista
        
        for(Usuario u: lista){
            System.out.println(u); //mostrando conforme o ToString
        }
        //verificando se contem
        System.out.println("Contém: " + lista.contains(new Usuario("Alifi")));
        //removendo
        System.out.println("Removido: " + lista.remove(new Usuario("Alifi")));
        
    }
}
