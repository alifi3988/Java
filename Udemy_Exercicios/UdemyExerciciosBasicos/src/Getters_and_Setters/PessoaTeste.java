package Getters_and_Setters;

public class PessoaTeste {
    
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(-22);
        
        System.out.println(p1.getIdade());

        
        p1.setIdade(22);
        
        System.out.println(p1.getIdade());
                
    }
    
}
