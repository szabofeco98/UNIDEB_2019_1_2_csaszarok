package software.app;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.apache.commons.codec.digest.DigestUtils;
import software.modell.DictionaryModell;
import software.persistent.Database;
import software.persistent.Player;
import software.persistent.Word;


import java.io.IOException;
import java.util.Objects;


public class Main extends Application {
    private static Parent root;
    private static Stage stage;

    @Override
    public void start(Stage primaryStage) throws Exception{
        stage=primaryStage;
        setScene("login.fxml", 600,400);
    }

    /**
     * A metódus beállitja a számunkra megfelelő fxml-fájlt
     * hogy a user mindig a megfelelő felületet láthassa.
     *
     * @param scene a számunkra szükséges fxml fájl neve.
     */
    public static void setScene(String scene){
        try {
            root = FXMLLoader.load(Objects.requireNonNull(Main.class.getClassLoader().getResource("views/"+scene)));
        } catch (IOException e){
            System.out.println(e);
        }
        stage.setTitle("Dictionary");
        stage.setScene(new Scene(root, 600, 400));
        stage.setResizable(false);
        stage.show();
    }

    public static void setScene(String scene,int width,int height){
        try {
            root = FXMLLoader.load(Objects.requireNonNull(Main.class.getClassLoader().getResource("views/"+scene)));
        } catch (IOException e){
            System.out.println(e);
        }
        stage.setTitle("Dictionary");
        stage.setScene(new Scene(root, width, height));
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
