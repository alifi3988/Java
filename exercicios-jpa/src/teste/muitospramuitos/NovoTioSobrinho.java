package teste.muitospramuitos;

import infra.DAO;
import java.util.List;
import modelo.muitospramuitos.Sobrinho;
import modelo.muitospramuitos.Tio;

public class NovoTioSobrinho {
    
    public static void main(String[] args) {
        
        
        Tio t1 = new Tio("Andreia"); 
        Tio t2 = new Tio("João");
        
        Sobrinho s1 = new Sobrinho("Álifi");
        Sobrinho s2 = new Sobrinho("Joaquina");
        
        //--finalização das instâncias das classes
        
        t2.getSobrinhos().add(s1);
        s1.getTios().add(t2);
      
        DAO<Object> dao = new DAO<>();
        
        try{
            dao
                    .abrirTransacao()
                    .incluir(t2)
                    .incluir(s1)
                    .fecharTransacao()
                    .fecharConexao();
        }catch(Exception e){
            System.out.println("Erro: " + e.getMessage());
        }
    }
    
}
