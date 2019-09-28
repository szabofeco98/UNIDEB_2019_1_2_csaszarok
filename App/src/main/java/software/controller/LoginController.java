package software.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import software.app.Main;


import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {


    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void test(ActionEvent actionEvent) {
        System.out.println("átléptünk");
    }
}
