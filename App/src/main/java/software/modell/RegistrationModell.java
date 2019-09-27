package software.modell;

import software.persistent.Database;
import software.persistent.Player;

import java.util.List;

public class RegistrationModell {
    private Database database=new Database();
    List<Player> players=database.getAllPlayer();


    public boolean userExist(String username) {
        boolean exist=false;
        for (Player player : players) {
            System.out.println("tábla username:"+player.getUsername()+"-megadott username:"+username);
            if(player.getUsername().equals(username)) exist=true;
        }
        return exist;
    }

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
