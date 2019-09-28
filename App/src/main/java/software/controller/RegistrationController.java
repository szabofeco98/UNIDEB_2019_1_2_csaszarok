package software.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
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
    @FXML
    private TextField email;

    @FXML
    private Label error;

    @FXML
    private PasswordField password;


    @FXML
    private PasswordField repassword;

    @FXML
    private Label sucess;

    @FXML
    private TextField username;

    public void registration(){
        String uname=username.getText();
        String emai=this.email.getText();
        String password=this.password.getText();
        String repassword=this.repassword.getText();
        Player newUser=Player.builder().email(emai).password(password).username(uname).build();
        String answer=modell.updatePlayer(newUser);
        switch (answer){
            case "sucess":{
                error.setText("");
                sucess.setText("Sikeres");
                break;
            }
            case "emailExist":{
                sucess.setText("");
                error.setText("Az email már létezik");
            }
            case "userExist":{
                sucess.setText("");
                error.setText("A felhasználónév létezik");
            }
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void goLogin(ActionEvent actionEvent) {
        Main.setScene("login.fxml");
    }
}
