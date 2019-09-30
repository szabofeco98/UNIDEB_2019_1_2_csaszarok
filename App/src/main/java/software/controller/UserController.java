package software.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import software.app.Main;
import software.modell.RegistrationModell;
import software.persistent.Player;

public class UserController {
        Player player;
        RegistrationModell modell=new RegistrationModell();

        @FXML
        private TextField newuname;

        @FXML
        private TextField olduname;

        @FXML
        private Pane userPopUp;

        @FXML
        private Pane USER;

        @FXML
        private Label error;

        @FXML
        private Label sucess;

        @FXML
        private Label sucessPass;

        @FXML
        private Label errorPass;

        @FXML
        private Pane passWord;

        @FXML
        private PasswordField passfield;

        @FXML
        private PasswordField rePass;

        @FXML
        void modifyUname(ActionEvent event) {
            String answer=modell.updateUser(newuname.getText(),player);
            if (answer.equals("wrong")){
                sucess.setText("");
                error.setText("Rossz felhasználónév");
            }else{
                error.setText("");
                sucess.setText("Sikeres");
            }
        }

        @FXML
        void passwordChange(ActionEvent event) {
            USER.setVisible(false);
            passWord.setVisible(true);
        }

        @FXML
        void unameChange(ActionEvent event) {
            USER.setVisible(false);
            userPopUp.setVisible(true);
        }

        @FXML
        void initialize() {
           // userPopUp.setVisible(false);
            player=LoginController.player;
        }

        public void GoBack(ActionEvent actionEvent) {
            Main.setScene("Menu.fxml",600,400);
        }

    public void back(ActionEvent actionEvent) {
            USER.setVisible(true);
            userPopUp.setVisible(false);
    }

    public void modifyPassword(ActionEvent actionEvent) {
        String answer=modell.updatePassword(passfield.getText(),rePass.getText(),player);
        if (answer.equals("wrong")){
            sucessPass.setText("");
            errorPass.setText("Rossz jelszó");
        }else{
            errorPass.setText("");
            sucessPass.setText("Sikeres");
        }
    }

    public void Goback(ActionEvent actionEvent) {
        USER.setVisible(true);
        passWord.setVisible(false);
    }
}


