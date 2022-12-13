package validarcpf;

public class Logica {
    
    private static String resultadoFinal;

    public void validar(String texto){
        
        //realizando o tratamento do texto
        String tratado = tratarTexto(texto);
        int tamanho = tratado.length();
        int vet1[] = new int[tamanho];
        int vet2[] = new int[tamanho];
        //jogando para um vet para ser separado
        int valorV9=0;
        int valorV10 =0;
        for(int i = 0; i< tamanho;i++){
            vet1[i] = Integer.parseInt(tratado.charAt(i)+"");
            vet2[i] = Integer.parseInt(tratado.charAt(i)+"");
            valorV9=vet1[9];
            valorV10 = vet1[10];
        }
        int cons = 10;
        int contador = 0;
        int digK = 0;
        int digJ = 0;
        for(int i = 0; i < (tamanho-2);i++){
            vet1[i] = vet1[i] * cons;
            cons--;
            contador = contador + vet1[i];
        }
        contador = contador % 11;
        
        if(contador == 0 || contador == 1){
            //reliza nova verificação com o vetor
            digJ = 0;
        }else if(contador > 1 && contador <= 10){
            digJ = 11 - contador;
        }
        //verificando o 1 digito
        boolean d1 = false;
        if(valorV9 == digJ) d1 = true;
        
        cons = 11;
        contador = 0;
        for(int i = 0; i < (tamanho-1);i++){
            vet2[i] = vet2[i] * cons;
            cons--;
            contador = contador + vet2[i];
        }
        contador = contador % 11;
        
        if(contador == 0 || contador == 1){
            //reliza nova verificação com o vetor
            digK = 0;
        }else if(contador > 1 && contador <= 10){
            digK = 11 - contador;
        }
        
        //verificando o 2º digito
        boolean d2 = false;
        if(valorV10 == digK) d2 = true;    
                
        //verificação final
        if(d1 == true && d2 == true){
            setResultadoFinal("VÁLIDO");
        }else{
            setResultadoFinal("INVÁLIDO");
        }
    }
    
    private String tratarTexto(String texto){
        
        // função para realizar o tratamento da String e retornar do formato necessário
        //definindo algumas variaveis
        char num = 0;
        long numero = 0;
        String resultado = "";
        
        //retornar o tamanho do texto
        int tamanho = texto.length();        
        if(tamanho == 11){
            
            //capturando caracter, por cracter e validando se é um número
            try {
                numero = Long.parseLong(texto);
            } catch (NumberFormatException e) {
               return e.toString();
            }
            resultado = resultado + numero;

        }else{
            //capturando caracter, por cracter e validando se é um número
            for(int i = 0; i< tamanho; i++){
                try {
                    num = texto.charAt(i);
                    numero = Integer.parseInt(num+"");
                    resultado = resultado + numero;
                } catch (NumberFormatException e) {

                }
            }
        }
        return resultado;
    }

    public static String getResultadoFinal() {
        return resultadoFinal;
    }

    public static void setResultadoFinal(String resultadoFinal) {
        Logica.resultadoFinal = resultadoFinal;
    }  
}
