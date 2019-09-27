package software.modell;

import software.Entity.Database;
import software.Entity.Player;

import java.util.List;

public class RegistrationModell {
    private Database database=new Database();
    List<Player> players=database.getAllPlayer();


    public boolean userExist(String username) {
        if(players.size()!=0) {
            for (Player player : players) {
                System.out.println(player.getUsername()+"-"+username);
                return username.equals(player.getUsername());
            }
        } return false;
    }

    public boolean emaiExist(String email){
        if(players.size()!=0) {
            for (Player player : players) {
                System.out.println(player.getEmail()+"-"+email);
                return email.equals(player.getEmail());
            }
        } return false;
    }

    public String updatePlayer(Player player){
        if(userExist(player.getUsername())){
            return "userExist";
        }else if(emaiExist(player.getEmail())){
            return "emailExist";
        }else {
            database.addPlayer(player);
            return "sucess";
        }
    }
}
