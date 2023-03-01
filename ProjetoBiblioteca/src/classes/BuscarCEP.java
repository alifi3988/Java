//essa classe tem como referÊncia a página web https://www.blogson.com.br/busca-automatica-de-cep-em-java-netbeans/

package classes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class BuscarCEP {
    
    String logradouro;      
    String bairro;
    String cidade;
    String estado;
    
    public void buscarCEP(String CEP) throws IOException{
        
        String json;
        
        try{
            
            //buscando as informações na WEB (Ou seja, precisa ter conexão com a internet)
            URL url = new URL("http://viacep.com.br/ws/"+ CEP +"/json");
            URLConnection urlConnection = url.openConnection();
            InputStream is = urlConnection.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            
            
            StringBuilder jsonSb = new StringBuilder();
            
            br.lines().forEach(l -> jsonSb.append(l.trim()));
            json = jsonSb.toString();
            
            json = json.replaceAll("[{},:]", "");
            json = json.replaceAll("\"", "\n");                       
            String array[];
            array = new String[30];
            array = json.split("\n");
            
            setLogradouro(array[7]);            
            setBairro(array[15]);
            setCidade(array[19]);
            setEstado(array[23]);
            
        }catch(MalformedURLException e){
            System.out.println("Error: " + e.getMessage());
        }
        
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String uf) {
        this.estado = uf;
    }
    
    

}
