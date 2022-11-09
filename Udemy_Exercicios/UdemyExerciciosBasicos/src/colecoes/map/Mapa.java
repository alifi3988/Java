package colecoes.map;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        
        Map<Integer, String> usuarios = new HashMap<Integer, String>();
        
        //adicionar
        usuarios.put(1, "Alifi");
        
        System.out.println(usuarios.keySet());
        System.out.println(usuarios.entrySet());
        
        System.out.println(usuarios.values());
        
        usuarios.remove(1, "Alifi");
        
        
        

        
    }
}
