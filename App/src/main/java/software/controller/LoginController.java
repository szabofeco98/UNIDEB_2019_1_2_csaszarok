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
import software.persistent.Player;


import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {

    LoginModell modell = new LoginModell();
    public static Player player;

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

    public void goRegistration(ActionEvent actionEvent) {
        Main.setScene("registration.fxml");
        System.out.println("regisztráció");

    }

    public void test(ActionEvent actionEvent) {

        String uname = username.getText();
        String passwd = password.getText();
        switch (modell.login(uname, passwd)) {
            case 1:
                player=modell.getPlayer(uname);
                Main.setScene("WordsPage.fxml",600,400);
                System.out.println("Sikeres bejelentkezés!");
                break;
            case 2:
                System.out.println("Hibás jelszó!");
                break;
            case 3:
                System.out.println("Nem létezik ilyen felhasználó!");
                break;
            case 4:
                System.out.println("Túl rövid felhasználónév/jelszó (min. 4 karakter)!");
                break;
        }

    }
}
