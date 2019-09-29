package software.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import software.app.Main;

import software.persistent.Player;

import java.net.URL;
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

    public void LearnPageAll(ActionEvent actionEvent) {
        Main.setScene("LearnPage.fxml");
    }

    public void LearnPageRand(ActionEvent actionEvent) {
        Main.setScene("LearnPage.fxml");
    }

    public void WordsPage(ActionEvent actionEvent) {

        Main.setScene("WordsPage.fxml");
    }

    public void LogOut(ActionEvent actionEvent) {
        Main.setScene("registration.fxml");
        System.out.println("kijelentkezés");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
