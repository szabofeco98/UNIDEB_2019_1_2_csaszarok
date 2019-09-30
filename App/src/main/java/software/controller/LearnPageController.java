package software.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import software.app.Main;
import software.modell.LearnPageModell;
import software.persistent.Player;
import software.persistent.Word;


public class LearnPageController {

    @FXML
    private Label questionWord;
    @FXML
    private TextField answerWord;
    @FXML
    private Label correctWord;

    @FXML
    private Button checkButton;
    @FXML
    private Button backButton;


    Player player;

    LearnPageModell modell = new LearnPageModell();
    Word tmp;
    int counter = 0;

    @FXML
    public void initialize() {
        player = LoginController.player;
        tmp = MenuController.tmp.get(0);
        questionWord.setText(tmp.getHunWord());

    }

    public void goCheck(ActionEvent actionEvent) {

        counter++;
        answerWord.getText();
        correctWord.setText(tmp.getEngWord());
        if (answerWord.getText().equals(correctWord.getText()))
            correctWord.setText("A válasz helyes!");

        else
            correctWord.setText("Helytelen! A " + questionWord.getText() + " angolul: " + tmp.getEngWord() + "!");

        if (counter < MenuController.tmp.size()) {
            tmp = (Word) modell.getUserWords(player).get(counter);
            questionWord.setText(tmp.getHunWord());
            answerWord.setText("");
        } else {
            backButton.setText("Vége!");
            checkButton.setVisible(false);
            answerWord.setVisible(false);
        }

    }

    public void goMenu(ActionEvent actionEvent) {
        Main.setScene("Menu.fxml", 600, 400);
    }

}

