package software.persistent;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class Database {

     static EntityManager em=null;

     static EntityManagerFactory emf=null ;

     public Database(){
             openEntityManager();
     }

     private  void openEntityManager(){
         if(em!=null && emf!=null) {
             if (em.isOpen()) {
                 closeEntityManager();
             }
         }
         emf = Persistence.createEntityManagerFactory("persistent");
         em = emf.createEntityManager();
     }

     private void closeEntityManager(){
         em.close();
         emf.close();
     }

     public <T> void persist(T entity) {
         if(!em.getTransaction().isActive())
         em.getTransaction().begin();
         em.persist(entity);
         try {
             em.getTransaction().commit();
         } catch (Exception e) {
             System.err.println("Létetik a felhasználó");
         }
     }


     public <T> void remove(T entity){
         if(!em.getTransaction().isActive())
         em.getTransaction().begin();
         em.remove(entity);
         em.getTransaction().commit();
     }

     public List<Player> getAllPlayer(){
         if(!em.getTransaction().isActive())
         em.getTransaction().begin();
         return em.createNativeQuery("select * from player",Player.class).getResultList();
     }
}
