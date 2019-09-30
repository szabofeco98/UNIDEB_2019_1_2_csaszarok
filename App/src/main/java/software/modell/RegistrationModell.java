package software.modell;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.validator.routines.EmailValidator;
import software.persistent.Database;
import software.persistent.Player;

import java.util.List;

public class RegistrationModell {
    /**
     * Adatbázis kapcsolathoz és műveletekhez szükséges Objektum
     */
    private Database database=Database.database;

    /**
     * A player tábla elemeit tartalmazó lista
     */
    List<Player> players;

    /**
     * Vizsgálja hogy létezik-e a felhasználó által
     * megadott felhasználónév az adatbázisban.
     *
     * @param username Felhasználótól kapott felhasználónév
     * @return true ha már létezik ilyen felhasználónév false ha nem létezik.
     */
    public boolean userExist(String username) {
        boolean exist=false;
        System.out.println(players.size());
        for (Player player : players) {
            System.out.println("tábla username:"+player.getUsername()+"-megadott username:"+username);
            if(player.getUsername()!=null)
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
            if(player.getEmail()!=null)
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
    public String updatePlayer(Player player,String repassword){
        players=database.getAllPlayer();


        if (!userIsValid(player.getUsername())){
            return "userInvalid";
        }

        if(!emailIsValid(player.getEmail())){
            return "emailInvalid";
        }

        if(!passwordIsValid(player.getPassword(),repassword)){
            return "passwordInvalid";
        }
        if(userExist(player.getUsername())){
            System.out.println(true);
            return "userExist";
        }
        if(emaiExist(player.getEmail())){
            System.out.println(true);
            return "emailExist";
        }
        player.setPassword(DigestUtils.sha256Hex(player.getPassword()));
        database.persist(player);
        return "sucess";
    } 

    public boolean passwordIsValid(String password,String repassword){
        return password.equals(repassword) && password.length()>3;
    }

    public boolean userIsValid(String username){
        return username.length()>3;
    }

    public boolean emailIsValid(String email){
       return EmailValidator.getInstance().isValid(email);
    }

    public String  updateUser(String newUser, Player player){
        players=database.getAllPlayer();
        if(userExist(newUser)) {
            System.out.println("létezik gec");
            return "wrong";
        }
        player.setUsername(newUser);
        database.update(player);
        System.out.println("update");
        return "sucess";
    }

    public String updatePassword(String newPass,String repass,Player player){
        if(passwordIsValid(newPass,repass)) {
            player.setPassword(DigestUtils.sha256Hex(newPass));
            database.update(player);
            return "sucess";
        }return "wrong";
    }
}
