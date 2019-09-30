package software.modell;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import software.persistent.Database;
import software.persistent.Player;

import org.apache.commons.codec.digest.DigestUtils;

import java.util.List;

public class LoginModell {

    private static Logger logger = LoggerFactory.getLogger(LoginModell.class);

    private Database database = Database.database;

    List<Player> players;
    String passwd;


    public int login(String examinedUsername, String examinedPassword) {
        players = database.getAllPlayer();
        boolean exist = false;
        if (examinedUsername.length() > 3 && examinedPassword.length() > 3) {

            for (Player player : players) {
                logger.info("Getusername:" + player.getUsername());
                if (player.getUsername().equals(examinedUsername)) {
                    exist = true; //van ilyen felhasználó
                    String hashedPassword;
                    passwd = player.getPassword(); //hashelt
                    hashedPassword = DigestUtils.sha256Hex(examinedPassword);
                    if (passwd.equals(hashedPassword))
                        return 1; //sikeres bejelentkezes
                    else return 2; // a jelszó hibás
                }
            }
            if (exist == false) return 3; //Nem létezik ilyen felhasználó!
        }
        return 4; //Túl rövid felhasználónév/jelszó (min. 4 karakter)!
    }

    public Player getPlayer(String uname) {
        return database.getPlayerByName(uname);
    }
}
