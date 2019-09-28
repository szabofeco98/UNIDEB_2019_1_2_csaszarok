package software.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;import javafx.fxml.FXML;

public class WordsController {

    @FXML
    private AnchorPane WordsPage;

    @FXML
    private Button addWord;

    @FXML
    private Button deleteWord;

    @FXML
    private Button goBackButton;

    @FXML
    private TableView wordslist;

    @FXML
    private TextField hunword;

    @FXML
    private TextField engword;

    @FXML
    private void initialize() {
        WordsPage.setVisible(true);
    }

    @FXML
    private void setGoBackButtonClick(ActionEvent event) {
        WordsPage.setVisible(false);
    }

    @FXML
    private void setAddWordClick(ActionEvent event) {

    }

    @FXML
    private void setDeleteWordClick(ActionEvent event) {

    }

}
