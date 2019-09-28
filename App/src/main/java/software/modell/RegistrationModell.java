package software.modell;

import software.persistent.Database;
import software.persistent.Player;

import java.util.List;

public class RegistrationModell {
    /**
     * Adatbázis kapcsolathoz és műveletekhez szükséges Objektum
     */
    private Database database=new Database();

    /**
     * A player tábla elemeit tartalmazó lista
     */
    List<Player> players=database.getAllPlayer();

    /**
     * Vizsgálja hogy létezik-e a felhasználó által
     * megadott felhasználónév az adatbázisban.
     *
     * @param username Felhasználótól kapott felhasználónév
     * @return true ha már létezik ilyen felhasználónév false ha nem létezik.
     */
    public boolean userExist(String username) {
        boolean exist=false;
        for (Player player : players) {
            System.out.println("tábla username:"+player.getUsername()+"-megadott username:"+username);
            if(player.getUsername().equals(username)) exist=true;
        }
        return exist;
    }

    /**
     * Vizsgálja hogy létezik-e a felhasználó által
     * megadott emailcím az adatbázisban.
     *
     * @param email Felhasználótól kapott username
     * @return true ha már létezik ilyen emailcím false ha nem létezik.
     */
    public boolean emaiExist(String email){
        boolean exist=false;
        for (Player player : players) {
            System.out.println("táble email:"+player.getEmail()+"-medadott email"+email);
            if(player.getEmail().equals(email)){
                exist=true;
            }
        }
        return exist;
    }

    /**
     * Amennyiben false a @Code{userExist} metódus vissza térisi értéke
     * és @Code{emaiExist} metódus vissza térési értéke is false felviszi
     * az adatbázisba a paraméterül kapott felhasználót.
     *
     * @param player Felhasználó által megadott adatokból létrehozott Entitás objektum
     * @return "sucess" amenyiben sikeresen felkerült az adatbázisba "userExist" amennyiben
     * már létezik a felhasználónév és "emailExist" ha már lézik felhasználó ezzel az email címmel.
     */
    public String updatePlayer(Player player){
        if(userExist(player.getUsername())){
            System.out.println(true);
            return "userExist";
        }
        if(emaiExist(player.getEmail())){
            System.out.println(true);
            return "emailExist";
        }

        database.persist(player);
        return "sucess";

    }
}
