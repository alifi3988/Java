//importações
package br.com.cod3r.calc.modelo;
import java.util.ArrayList;
import java.util.List;

//ínicio da classe memoria
public class Memoria {
    
    //criação do método TipoComando (para distinguir os tipos de função)
    private enum TipoComando{
        ZERAR, NUMERO, DIV, MULT, SUB, SOMA, IGUAL, VIRGULA,
        TROCARSINAL, RAIZ, QUADRADO, UMDIV, APAGAR1, ZERAR1,
        PORCENTAGEM;
    };
    
    private static final Memoria instancia = new Memoria();
    private final List<MemoriaObservador> observador = new ArrayList<>();
    private boolean substituir = false;
    private TipoComando ultimaOperacao = null;
    private String textoAtual = "";
    private String textoBuffer = "0";
    
    private Memoria() {}
    
    //função para retornar a instanciam ou seja, o valor da memória
    public static Memoria getInstancia() {
        return instancia;
    }
    
    public void adicionarObservador(MemoriaObservador observador){
        this.observador.add(observador);
    }
    
    //função para pegar o texto atual, o que foi digitado
    public String getTextoAtual() {
        return textoAtual.isEmpty() ? "0": textoAtual;
    }
    
    public void processarComando(String texto){
        
        TipoComando tipoComando = detectarTipoComando(texto);
        
        try{
            if(null == tipoComando){
                return;
            }else switch (tipoComando) {
                case ZERAR -> {
                    textoAtual = "";
                    textoBuffer = "0";
                    substituir = false;
                    ultimaOperacao = null;
                }
                case NUMERO, VIRGULA -> {
                    textoAtual = substituir ? texto : textoAtual + texto;
                    substituir = false;
                }
                case TROCARSINAL -> {
                    textoAtual = getTextoAtual();
                    if(textoAtual != "0"){
                        substituir = false; //responsável por substituir valores, após clicar em algum operador
                        ultimaOperacao = tipoComando;
                        textoAtual = obterResultadoOperacao();
                        ultimaOperacao = null;
                    }else if(textoAtual == "0"){
                        textoAtual = "";
                        textoBuffer = "0";
                        substituir = false;
                        ultimaOperacao = null;
                    }
                }
                case QUADRADO ->{
                    textoAtual = getTextoAtual();
                    if(textoAtual == "0"){
                        substituir = true;
                        ultimaOperacao = null;
                        textoAtual = "0";
                        textoBuffer = "0";  
                    }else{
                        substituir = true;
                        ultimaOperacao = TipoComando.MULT;
                        textoBuffer = textoAtual;
                        textoAtual = obterResultadoOperacao();
                    }

                }

                case RAIZ-> {
                    textoAtual = getTextoAtual();

                    if(textoAtual == "0" || textoAtual == "1"){
                        substituir = true;
                        ultimaOperacao = null;
                        textoBuffer = "0";
                    }else if(Integer.parseInt(textoAtual) < 0){
                        substituir = true;
                        ultimaOperacao = null;
                        textoBuffer = "0";
                        textoAtual = "NaN";
                    }else{
                        substituir = true;
                        ultimaOperacao = TipoComando.RAIZ;
                        textoBuffer = "0";
                        textoAtual = obterResultadoOperacao();
                    }
                }

                case UMDIV -> {
                    textoAtual = getTextoAtual();

                    if(Integer.parseInt(textoAtual) == 0){
                        substituir = true;
                        ultimaOperacao = null;
                        textoBuffer = "0";
                        textoAtual = "Impossível realizar divisão por ZERO!";
                    }else{
                        substituir = true;
                        ultimaOperacao = TipoComando.DIV;
                        textoBuffer = "1";
                        textoAtual = obterResultadoOperacao();
                    }
                }

                case DIV -> {
                    textoAtual = getTextoAtual();

                    if(Integer.parseInt(textoAtual) == 0){
                        substituir = true;
                        ultimaOperacao = null;
                        textoBuffer = "0";
                        textoAtual = "Impossível realizar divisão por ZERO!";
                    }else{
                        substituir = true;
                        ultimaOperacao = TipoComando.DIV;
                        textoBuffer = "1";
                        textoAtual = obterResultadoOperacao(); 
                    }
                }

                case APAGAR1 -> {
                    textoAtual = getTextoAtual();

                    if(textoAtual.length() == 1){
                        substituir = true;
                        ultimaOperacao = null;
                        textoBuffer = "0";
                        textoAtual = "0"; 
                    } else {
                        String novoTexto = "";

                        for(int i = 0; i < (textoAtual.length() - 1);i++){
                            novoTexto = novoTexto + textoAtual.charAt(i);
                        }
                        substituir = true;
                        ultimaOperacao = null;
                        textoBuffer = "0";
                        textoAtual = novoTexto; 
                    }
                }
                case ZERAR1 -> {
                    textoAtual = getTextoAtual();

                    if(textoAtual == "0"){
                        substituir = false;
                        textoAtual = "0";
                    }
                    substituir = true;
                    textoAtual = "0";
                }

                default -> {
                        substituir = true; //responsável por substituir valores, após clicar em algum operador
                        textoAtual = obterResultadoOperacao();
                        textoBuffer = textoAtual;
                        ultimaOperacao = tipoComando;
                }
            }
            observador.forEach(o -> o.valorAlterado(getTextoAtual()));
        }catch(NumberFormatException e){
            ultimaOperacao = null;
            substituir = true;
            textoAtual = "Erro!";
            textoBuffer = "0";
        }
    }
    
    //método que vai retornar um tipo de comando     
    private TipoComando detectarTipoComando(String texto){
        
        //não digitar vários zeros
        if(textoAtual.isEmpty() && texto == "0"){
            return null;
        }      
     
        try {
            // no caso está verificando se o valor passado(texto) 
            // é do tipo numero ou não
            Integer.parseInt(texto);
            return TipoComando.NUMERO;
            
        } catch (NumberFormatException e) {
            //se não for número, vai cair no Catch, e fazer a devida validação, testes
            if("C".equals(texto)){
                return TipoComando.ZERAR;
            }else if("/".equals(texto)){
                return TipoComando.DIV;
            }else if("+".equals(texto)){
                return TipoComando.SOMA;
            }else if("-".equals(texto)){
                return TipoComando.SUB;
            }else if("x".equals(texto)){
                return TipoComando.MULT;
            }else if(",".equals(texto) && !textoAtual.contains(",")){
                return TipoComando.VIRGULA;
            }else if("=".equals(texto)){
                return TipoComando.IGUAL;
            }else if("+/-".equals(texto)){
                return TipoComando.TROCARSINAL;
            }else if("√x".equals(texto)){
                return TipoComando.RAIZ;
            }else if("x²".equals(texto)){
                return TipoComando.QUADRADO;
            }else if("1/x".equals(texto)){
                return TipoComando.UMDIV;
            }else if("⌫".equals(texto)){
                return TipoComando.APAGAR1;
            }else if("CE".equals(texto)){
                return TipoComando.ZERAR1;
            }else if("%".equals(texto)){
                return TipoComando.PORCENTAGEM;
            }
        }
        return null;
    }
    
    private String obterResultadoOperacao() {
        if(ultimaOperacao == null || ultimaOperacao == TipoComando.IGUAL) return this.textoAtual;
        
        //pegando o texto do Buffer, subistituindo a vírgula pelo ".", para realizar a operação
        double numeroBuffer = Double.parseDouble(textoBuffer.replace(",", "."));
        double numeroAtual = Double.parseDouble(textoAtual.replace(",", "."));
        
        double resultado = 0;
        String resultadoString = "";
        
        //operações dos botões
        if(numeroAtual == 0 && ultimaOperacao == TipoComando.DIV) {
            return "Erro! Impossível divisão por 0";
        }else{
            switch (ultimaOperacao) {
                case SOMA -> resultado = numeroBuffer + numeroAtual;
                case SUB -> resultado = numeroBuffer - numeroAtual;
                case MULT -> resultado = numeroBuffer * numeroAtual;
                case DIV -> {
                    if(numeroBuffer == 0) resultado = 0;
                    else{
                        resultado = numeroBuffer / numeroAtual;
                    }
                }
                case TROCARSINAL -> {
                    resultado = (numeroAtual) * (-1);
                }
                
                case RAIZ -> {
                    resultado = Math.sqrt(numeroAtual);
                }
              
                default -> throw new AssertionError();
            }
        }
        resultadoString = Double.toString(resultado).replace(".", ",");
        
        //se caso retornar um número ",00" passará para inteiro
        boolean inteiro = resultadoString.endsWith(",0");
        return inteiro ? resultadoString.replace(",0", "") : resultadoString;
    }
}
