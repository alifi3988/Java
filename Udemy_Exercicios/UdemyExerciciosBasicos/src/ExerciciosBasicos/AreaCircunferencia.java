package ExerciciosBasicos;

public class AreaCircunferencia {
    public static void main(String[] args){
        //Introduzindo o conceito de variavel e constante
        //com o exemplo d conta da área de um círculo
        final double PI = 3.14159; // no caso é utilizado o final para declarar como constante
        //ou seja, não pode ser modificada 
        
        double raio = 10.0;
        double area;
        //variável do tipo double (real), pode ser modificada
        
        area = PI * raio;
        System.out.println("AREA: " + area);
               
    }
}
