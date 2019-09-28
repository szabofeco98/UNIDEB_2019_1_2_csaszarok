package software.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import org.hibernate.annotations.common.util.impl.LoggerFactory;


import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {


    @FXML
    private AnchorPane login;

    @FXML
    private TextField username;

    @FXML
    private TextField password;

    @FXML
    private Button sigin;

    @FXML
    private Button signup;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
    @FXML
    private void initialize() {
        // TODO
        login.setVisible(true);
        //logger.info("The game has been initialized successfully!");
    }

    public void test(ActionEvent actionEvent) {
        System.out.println("átléptünk");
    }
}
