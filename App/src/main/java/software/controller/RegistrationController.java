package software.controller;

import software.Entity.Player;
import software.modell.RegistrationModell;

public class RegistrationController {
    RegistrationModell modell= new RegistrationModell();

    public void registration(){
        Player player=Player.builder().email("test").password("test").username("test").build();
        Player player1=Player.builder().email("test").password("test").username("nemtest").build();
        Player player2=Player.builder().email("uj").password("uj").username("uj").build();
        System.out.println(modell.updatePlayer(player));
        System.out.println(modell.updatePlayer(player1));
        System.out.println(modell.updatePlayer(player2));
    }
}
