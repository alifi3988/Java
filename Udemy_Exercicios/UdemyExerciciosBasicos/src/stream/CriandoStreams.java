/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stream;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.stream.Stream;

/**
 *
 * @author alifi
 */
public class CriandoStreams {
    
    public static void main(String[] args) {
        
        
        Consumer <String> print = System.out::println;
        
        print.accept("olá mundo");
        
        Stream<String> langs = Stream.of("Java ", "Lua ", "JS\n ");
        langs.forEach(print);
        
        String[] maisLangs = {"Python", "Lisp", "Perl", "Go\n"};
        
        Stream.of(maisLangs).forEach(print);
        
        Arrays.stream(maisLangs).forEach(print);
        Arrays.stream(maisLangs, 1, 2).forEach(print);
        
    }
    
}
