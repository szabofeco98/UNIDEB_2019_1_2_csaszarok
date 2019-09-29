package software.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import software.app.Main;
import software.modell.LearnPageModell;
import software.persistent.Player;


public class LearnPageController {

    @FXML
    private  Label questionWord;
    @FXML
    private TextField answerWord;
    @FXML
    private Label correctWord;

    @FXML
    private Button checkButton;
    @FXML
    private Button backButton;

    Player player;

    LearnPageModell modell=new LearnPageModell();

    @FXML
    void initialize() {
        player=LoginController.player;
        System.out.println(modell.getuserWords(player));
    }
    public void goMenu(ActionEvent actionEvent) {
        Main.setScene("Menu.fxml", 600, 400);
    }

}
