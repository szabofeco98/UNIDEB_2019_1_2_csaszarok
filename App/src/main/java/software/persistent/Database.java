package software.persistent;

import org.hibernate.query.NativeQuery;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class Database {

     static EntityManager em=null;

     static EntityManagerFactory emf=null ;

     public static final Database database=new Database();

     public Database(){
             openEntityManager();
     }

    /**
     * Létre hozza az EntityManager objektumot amely szükséges a
     * perzisztencia műveletekhez.
     */
    private  void openEntityManager(){
         if(em!=null && emf!=null) {
             if (em.isOpen()) {
                 closeEntityManager();
             }
         }
         emf = Persistence.createEntityManagerFactory("persistent");
         em = emf.createEntityManager();
     }

    /**
     * Bezárja a kapcsolatot az adatbázissal.
     */
    private void closeEntityManager(){
         em.close();
         emf.close();
     }

    /**
     * Hozzá fűzi az adatbázishoz a paraméterül kapott
     * entitás objektumot
     *
     * @param entity entitás objektum
     * @param <T> az entitás típusa
     */
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

    /**
     * Törli a paraméterül kapott entitás objektumot
     * az adatbázisból
     *
     * @param entity entitás objektum
     * @param <T> az entitás típusa
     */
     public <T> void remove(T entity){
         if(!em.getTransaction().isActive())
         em.getTransaction().begin();
         try {
             em.remove(entity);
         } catch (Exception e) {
                 System.err.println("baj van");
         }
         em.getTransaction().commit();
     }

     /**
     * Kilistázza az összes Player objektumot az adatbázisból.
     * @return Lista az adatbázisbeli objektumokkal.
     */
    public List<Player> getAllPlayer(){
         if(!em.getTransaction().isActive())
         em.getTransaction().begin();
         return em.createNativeQuery("select * from player",Player.class).getResultList();
    }

    /**
     * Megadja az adott felhasználó adatbázisban lévő
     * a felhasználóhoz tartozó szavakat.
     *
     * @param player adatbázisban lévő felhasználó
     * @return felhasználóhoz tartozó szavak listája.
     */
     public List<Word> getAllWordByPlayer(Player player){
         if(!em.getTransaction().isActive())
             em.getTransaction().begin();
         Query sql= em.createNativeQuery("select * from word where player_id = ?",Word.class);
         sql.setParameter(1,player.getId());
         return sql.getResultList();
     }

    /**
     * Vissza adja azt a felhasználót amelynek az idja az
     * adatbázisban megegyezik a kapott id-val.
     *
     * @param id Felhasználó azonositója
     * @return Az adatbázisban lévő megegyező id-val rendelkező Player.
     */
     public Player getPlayer(long id){
         if(!em.getTransaction().isActive())
             em.getTransaction().begin();
         Query sql= em.createNativeQuery("select * from Player where id = ?",Player.class);
         sql.setParameter(1,id);
         return (Player) sql.getResultList().get(0);
     }

     public Player getPlayerByName(String uname){
         if(!em.getTransaction().isActive())
             em.getTransaction().begin();
         Query sql= em.createNativeQuery("select * from Player where username = ?",Player.class);
         sql.setParameter(1,uname);
         return (Player) sql.getResultList().get(0);
     }

     public Word getWordById(long id){
         if(!em.getTransaction().isActive())
             em.getTransaction().begin();
         Query sql= em.createNativeQuery("select * from WORD where id = ?",Word.class);
         sql.setParameter(1,id);
         return (Word) sql.getResultList().get(0);
     }

    public <T> void update(T entity){
        if(!em.getTransaction().isActive())
            em.getTransaction().begin();
        try {
            em.merge(entity);
        } catch (Exception e) {
            System.err.println("baj van");
        }
        em.getTransaction().commit();
    }

}
