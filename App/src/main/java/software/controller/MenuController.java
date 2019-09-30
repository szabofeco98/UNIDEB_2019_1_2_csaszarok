package software.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import software.app.Main;

import software.modell.LearnPageModell;
import software.persistent.Player;
import software.persistent.Word;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class MenuController implements Initializable {

    @FXML
    private Button GotoLearnPageAll;

    @FXML
    private Button GotoLearnPageRandl;

    @FXML
    private Button GoWordsPage;

    @FXML
    private Button gotoLogOut;

    public static Player player;
    LearnPageModell modell = new LearnPageModell();
    public static List<Word> tmp;


    public void LearnPageAll(ActionEvent actionEvent) {

        tmp = modell.getUserWords(player);
        if (tmp.size() == 0) {
            Main.setScene("WordsPage.fxml", 600, 400);
        } else
            Main.setScene("LearnPage.fxml", 600, 400);

    }

    public void LearnPageRand(ActionEvent actionEvent) {

        tmp = modell.getUserWords(player);
        if (tmp.size() < 10) {
            Main.setScene("WordsPage.fxml", 600, 400);
        }
        if (tmp.size() > 1 && tmp.size() < 10) {
            Main.setScene("LearnPage.fxml", 600, 400);
        } else {
            tmp = modell.randomWords(player);
            Main.setScene("LearnPage.fxml", 600, 400);
        }
    }

    public void WordsPage(ActionEvent actionEvent) {

        Main.setScene("WordsPage.fxml", 600, 400);
    }

    public void LogOut(ActionEvent actionEvent) {
        Main.setScene("registration.fxml", 600, 400);
        System.out.println("kijelentkezés");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        player = LoginController.player;
    }

    public void GoUserFunction(ActionEvent actionEvent) {
        Main.setScene("userfunction.fxml",600,400);
    }
}