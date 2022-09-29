package Repeticao;
import java.util.Scanner;

public class While {
    
    public static void main(String[] args) {
        
        //usa o while normalmente quando não sabe o final
        //nas aulas de C++ utilizava muito para fazer menus...
        
        Scanner entrada = new Scanner(System.in);
        
        int valor = 0;
        
        //repetir, enquanto o valor passado for verdadeiro
        
        //verificando se é par ou impar
        while(valor >= 0){
            System.out.println("Digite valores negativos, se deseja parar!");

            System.out.print("Informe um valor: ");
            valor = entrada.nextInt();
            
            if(valor%2 == 0){
                System.out.println(valor + " é par!");
            }else if(valor < 0){
                break;
            }else{
                System.out.println(valor + " é ímpar!");
            }
            System.out.println();
        }      
    }
}
