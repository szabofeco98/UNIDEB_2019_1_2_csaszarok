package software.Entity;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;
import java.util.Optional;


public abstract class GenericDao<T> {



    protected Class<T> entityClass;
    protected EntityManager em;

    EntityManagerFactory emf ;


    public GenericDao(Class<T> entityClass) {

        this.entityClass=entityClass;
    }

    public void openEntityManager(){
        this.emf = Persistence.createEntityManagerFactory("Gamer");
        this.em = emf.createEntityManager();
    }

    public void closeEntityManager(){
        em.close();
        emf.close();
    }

    public void persist(T entity){
        em.getTransaction().begin();
        em.persist(entity);
        em.getTransaction().commit();
    }

    public void remove(T entity){
        em.getTransaction().begin();
        em.remove(entity);
        em.getTransaction().commit();
    }

    public Optional<T> find(Object primaryKey) {
        em.getTransaction().begin();
        return Optional.ofNullable(em.find(entityClass, primaryKey));

    }

    public List<T> findAll() {
        em.getTransaction().begin();
        TypedQuery<T> typedQuery = em.createQuery("FROM " + entityClass.getSimpleName(), entityClass);
        return typedQuery.getResultList();
    }






}
