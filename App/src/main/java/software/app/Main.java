package software.app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import software.controller.Controller;
import software.controller.RegistrationController;


import java.util.Objects;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("layout.fxml")));
        primaryStage.setTitle("Dictionary");
        primaryStage.setScene(new Scene(root, 800, 400));
        primaryStage.setResizable(false);
        primaryStage.show();

        System.out.println("lefut");
        RegistrationController registrationController;




    }


    public static void main(String[] args) {
        launch(args);
    }
}
