package teste.umpraum;

import infra.DAO;
import modelo.umpraum.Assento;
import modelo.umpraum.Cliente;

public class NovoClienteAssento {
    public static void main(String[] args) {
        
        Assento assento = new Assento("11K");
        
        Cliente cliente = new Cliente("Jaqueline Junqueira", assento);
        
        DAO<Object> dao = new DAO<>();
        
        //o correto é que quando tem dependencia, coloque a ordem.
        //Por mais que coloque em desordem, o sistema coloca após reconhecer a dependencia
        //Todavia, se add e depois o outro, mostraria um erro
        try{
            dao.abrirTransacao()
                    .incluir(assento)
                    .incluir(cliente);
        }catch(Exception e){
            System.out.println("Erro: " + e.getMessage());
        }
        
        dao.fecharTransacao().fecharConexao();
        
    }
}
