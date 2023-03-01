package classes;

import java.util.Calendar;

public class VerificadorString {
    
 
    //Funções públicas na classe, para ser utilizado por várias classes.
    //resolvi fazer dess maneira para ficar mais fácil e acessível
    
    
    public void verificarString(String str){
        
        
        
        
        
    }
    
    public Boolean validarData(String dataNascimento){
        //realizando a separação da data para fazer verificação
        String[] dataSeparada = dataNascimento.split("/");
        int dia = Integer.parseInt(dataSeparada[0]);
        int mes = Integer.parseInt(dataSeparada[1]);
        int ano = Integer.parseInt(dataSeparada[2]);
        //o dia tem que ser maior que 0 e menor que 31
        if(dia > 0 && dia < 31){
            //o mes tem que ser maior que 0 e menor que 13
            if(mes > 0 && mes < 13){
                //o ano tem que ser maior que 1900 e menor que o ano atual -15
                if(ano > 1900 && ano < Calendar.getInstance().get(Calendar.YEAR)-15){
                    return true;
                }
            }
        }
        return false;
    }
    
    public Boolean validarCPF(String texto){
        
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
            return true;
        }else{
            return false;
        }
    }
    
    public String tratarTexto(String texto){
        
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

    public Boolean tratarDados(String str){
        
        String sinais = "[^\\p{}]-./*+1234567890();:?^~´'`|+=+ªº°§$%¨@!#&";
        
        
        for(int i = 0; i < str.length(); i++){
            if(sinais.contains(""+str.charAt(i))){
                return false;
            }
        }
        return true;
    }
    
    public Boolean verificarHaSql(String str){
    
        return !(str.toUpperCase().contains("SELECT") || 
                str.toUpperCase().contains("DROP") || 
                str.toUpperCase().contains("DELETE") ||
                str.toUpperCase().contains("RESTORE"));
    }
        
}
