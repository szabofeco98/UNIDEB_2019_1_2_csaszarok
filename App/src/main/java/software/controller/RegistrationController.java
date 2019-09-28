package software.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import lombok.Data;
import software.app.Main;
import software.persistent.Database;
import software.persistent.Player;
import software.modell.RegistrationModell;
import software.persistent.Word;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class RegistrationController implements Initializable {
    RegistrationModell modell= new RegistrationModell();

  //  Database database=new Database(); //Test
    public void registration(){
        /*
        Player player=Player.builder().email("test").password("test").username("test").build();
        Player player1=Player.builder().email("elek").password("elek").username("elek").build();
        Word word=Word.builder().engWord("what").hunWord("mi").player(player1).build();
        Player player2=Player.builder().email("uj").password("uj").username("uj").build();
        System.out.println(modell.updatePlayer(player));
        if(modell.updatePlayer(player1).equals("sucess")) database.persist(word);
        System.out.println(modell.updatePlayer(player2));*/
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void test(ActionEvent test) throws IOException {
        Main.setScene("login.fxml");
    }
}
