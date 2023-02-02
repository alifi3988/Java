
package teste.umpraum;

import infra.DAO;
import modelo.umpraum.Assento;
import modelo.umpraum.Cliente;

public class NovoClienteAssento2 {
    
    public static void main(String[] args) {
        
        Assento ass = new Assento("4D");        
        Cliente cl = new Cliente("Rodrigo", ass);
        
        DAO<Cliente> dao = new DAO<>(Cliente.class);        
        dao.incluirAtomico(cl);
        
    }
    
}
