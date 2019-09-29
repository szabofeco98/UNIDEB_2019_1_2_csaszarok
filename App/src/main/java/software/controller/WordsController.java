package software.controller;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import software.app.Main;
import software.modell.DictionaryModell;
import software.persistent.Database;
import software.persistent.Player;
import software.persistent.Word;

import javax.xml.crypto.Data;


public class WordsController {

    DictionaryModell dictionaryModell=new DictionaryModell();
    Player player;

    @FXML
    private TextField endword;

    @FXML
    private TextField hunword;

    @FXML
    private TableView<Word> wordslist;

    @FXML
    TableColumn<Object, Object> hun;

    @FXML
    TableColumn<Object, Object> eng;


    @FXML
    void setAddWordClick(ActionEvent event) {
        String hunWord=null;
        if(!hunword.getText().isEmpty())
            hunWord= hunword.getText();
        String endWord=null;
        if(!endword.getText().isEmpty())
            endWord= endword.getText();
        if(hunWord!=null && endWord!=null) {
            Word word=Word.builder().
            hunWord(hunWord).engWord(endWord).
            player(player).build();
            dictionaryModell.addWord(word);
            setWordslist();
        }
    }

    @FXML
    void setDeleteWordClick(ActionEvent event) {
        if (!wordslist.getSelectionModel().isEmpty()) {
            long id = getWordId();
            dictionaryModell.remowe(id);
            setWordslist();
        }
    }

    @FXML
    void setGoBackButtonClick(ActionEvent event) {
        Main.setScene("Menu.fxml", 600,400);
    }

    @FXML
    void initialize() {
        player=LoginController.player;
        setWordslist();
    }

    @FXML
    public void setWordslist(){
        ObservableList<Word> obslist= FXCollections.observableList(dictionaryModell.getuserWords(player));
        hun.setCellValueFactory(new PropertyValueFactory<>("hunWord"));
        eng.setCellValueFactory(new PropertyValueFactory<>("engWord"));
        wordslist.setItems(obslist);
    }

    public long getWordId(){
        Word word = wordslist.getSelectionModel().getSelectedItem();
        return word.getId();
    }

}
