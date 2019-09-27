package software.Entity;

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

     public void addPlayer(Player player) {
         if(!em.getTransaction().isActive())
         em.getTransaction().begin();
         em.persist(player);
         try {
             em.getTransaction().commit();
         } catch (Exception e) {
             System.err.println("Létetik a felhasználó");
         }
     }

     public void addWord(Word word){
         if(!em.getTransaction().isActive())
         em.getTransaction().begin();
         em.persist(word);
         em.getTransaction().commit();

     }

     public void removePlayer(Player player){
         if(!em.getTransaction().isActive())
         em.getTransaction().begin();
         em.remove(player);
         em.getTransaction().commit();
     }

     public void removeWord(Word word){
         if(!em.getTransaction().isActive())
         em.getTransaction().begin();
         em.remove(word);
         em.getTransaction().commit();
     }

     public List<Player> getAllPlayer(){
         if(!em.getTransaction().isActive())
         em.getTransaction().begin();
         Query query=em.createNativeQuery("select * from player",Player.class);
         return  query.getResultList();
     }
}
