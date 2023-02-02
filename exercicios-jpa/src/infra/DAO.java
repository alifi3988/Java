package infra;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class DAO<E> {
    
    private static EntityManagerFactory emf;
    private EntityManager em;
    private Class<E> classe;
    
    //iniciando o atributo Entity Static (quando o Java iniciar o prog, será alimentado)
    static{
        //tratamento do erro, se caso tiver
        try{
            emf = Persistence
                    .createEntityManagerFactory("exercicios-jpa");
        } catch(Exception e){
            System.out.println("Erro: " + e.getMessage());
            //logar -> log4j ????
            
        }
    }
    
    //construção de construtores
    public DAO() {
        this(null);
    }
    
    public DAO(Class<E> classe) {
        this.classe = classe;
        em = emf.createEntityManager();
    }
    
    //métodos para realizar ações com o BD
    public DAO<E> abrirTransacao(){
        
        em.getTransaction().begin();
        
        return this;
    }
    
    //fechar a transacao
    public DAO<E> fecharTransacao(){
        
        em.getTransaction().commit();
        
        return this;
    }
    
    //incuir
    public DAO<E> incluir(E entidade){
        em.persist(entidade);
        return this;
    }
    
    //método geral em um único método
    public DAO<E> incluirAtomico(E entidade){
        return this
                .abrirTransacao()
                .incluir(entidade)
                .fecharTransacao();
    }
    
    public E obterPorID(Object id){
        return em.find(classe, id);
    }
    
    //listar os 10 primeiros
    public List<E> obterTodos(){
        //retornará os 10 primeiros
        return this.obterTodos(10, 0);
    }
    
    //listar todos os dados da Classe/Objeto definindo quantidade e valor de deslocamento
    public List<E> obterTodos(int qtde, int deslocamento){
        
        if(classe == null){
            throw new UnsupportedOperationException("Classe está nula!");
        }else{
            String jpql = "SELECT e FROM " + classe.getName() + " e";
            TypedQuery<E> query = em.createQuery(jpql, classe);
            query.setMaxResults(qtde);
            query.setFirstResult(deslocamento);
            return query.getResultList();
        }
        
    }
    
    public List<E> consultar(String nomeConsulta, Object...params){
 
        TypedQuery<E> query = em.createNamedQuery(nomeConsulta, classe);
        
        for(int i = 0; i < params.length; i+=2){
            
            query.setParameter(params[i].toString(), params[i+1]);
        }
        return query.getResultList();
    }
    
    
    public E consultarUm(String nomeConsulta, Object... params){
        
        List<E> lista = consultar(nomeConsulta, params);
        return lista.isEmpty() ? null : lista.get(0);
    }
    

    //fechando a conexão
    public void fecharConexao(){
        em.close();
    }
    
}
