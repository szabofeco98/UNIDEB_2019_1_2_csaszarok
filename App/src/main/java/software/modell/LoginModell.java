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

    List<Player> players = database.getAllPlayer();

    String passwd;

    public boolean userExist(String username) {
        boolean exist = false;
        for (Player player : players) {
            if (player.getUsername().equals(username)) exist = true;
        }
        return exist;
    }

    public boolean login(String examinedUsername, String examinedPassword) {
        if (examinedUsername.length() > 3 && examinedPassword.length() > 3) {
            System.out.println(examinedUsername);
            if (userExist(examinedUsername)) {
                for (Player player : players) {
                    if (player.getUsername().equals(examinedUsername)) {
                        String hashedPassword;
                        passwd = player.getPassword(); //hashelt
                        hashedPassword = DigestUtils.sha256Hex(examinedPassword);
                        if (passwd.equals(hashedPassword)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
