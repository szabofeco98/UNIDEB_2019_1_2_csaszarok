package software.controller;

import lombok.Data;
import software.persistent.Database;
import software.persistent.Player;
import software.modell.RegistrationModell;
import software.persistent.Word;

public class RegistrationController {
    RegistrationModell modell= new RegistrationModell();
    //Test Data Test
    Database database=new Database();
    public void registration(){
        Player player=Player.builder().email("test").password("test").username("test").build();
        Player player1=Player.builder().email("elek").password("elek").username("elek").build();
        Word word=Word.builder().engWord("what").hunWord("mi").player(player1).build();
        Player player2=Player.builder().email("uj").password("uj").username("uj").build();
        System.out.println(modell.updatePlayer(player));
        if(modell.updatePlayer(player1).equals("sucess")) database.persist(word);
        System.out.println(modell.updatePlayer(player2));
    }
}
