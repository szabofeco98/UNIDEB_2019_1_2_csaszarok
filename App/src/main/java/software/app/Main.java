package software.app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import software.Entity.Player;
import software.Entity.PlayerDao;
import software.Entity.Word;
import software.Entity.WordsDao;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static javafx.fxml.FXMLLoader.load;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("layout.fxml")));
        primaryStage.setTitle("Dictionary");
        primaryStage.setScene(new Scene(root, 800, 400));
        primaryStage.setResizable(false);
        primaryStage.show();

        System.out.println("lefut");
        PlayerDao playerDao=new PlayerDao();
        WordsDao wordsDao=new WordsDao();
        Player player =new Player();
        player.setEmail("sasa@sasa.com");
        player.setPassword("titkos");
        player.setUsername("sasa");
        Word word=new Word();
        word.setEngWord("what");
        word.setHunWord("mi");
        List<Word> words= new ArrayList<Word>();
        words.add(word);
        player.setWords(words);

        System.out.println(player.getWords());
        playerDao.openEntityManager();
        playerDao.persist(player);
        //wordsDao.persist(player.getWords());
        playerDao.closeEntityManager();
        /*

        playerDao.remove((new Player(1,"sasa")));
        System.out.println(playerDao.findAll());*/
    }


    public static void main(String[] args) {
        launch(args);
    }
}
