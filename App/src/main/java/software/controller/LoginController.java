package software.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import org.apache.commons.codec.digest.DigestUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import software.app.Main;
import software.modell.LoginModell;


import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {

    LoginModell modell=new LoginModell();

    private static Logger logger = LoggerFactory.getLogger(LoginController.class);
    @FXML
    public AnchorPane login;

    @FXML
    private TextField username;

    @FXML
    private TextField password;

    @FXML
    private Button signin;

    @FXML
    private Button signup;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    private void initialize() {
        // TODO
        login.setVisible(true);
        logger.info("Our application has been initialized successfully!");
    }
    public void goRegistration (ActionEvent actionEvent) {
        Main.setScene("registration.fxml");
        System.out.println("regisztráció");

    }


    public void test(ActionEvent actionEvent) {

        String uname=username.getText();
        System.out.println(uname);
        logger.info(uname);
        String passwd=password.getText();
        logger.info(DigestUtils.sha256Hex(passwd));
        if(modell.login(uname, passwd))
            System.out.println("sikeres bejelentkezes");

    }
}
