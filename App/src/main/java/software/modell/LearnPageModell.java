package software.modell;

import edu.emory.mathcs.backport.java.util.LinkedList;
import software.persistent.Database;
import software.persistent.Player;
import software.persistent.Word;

import java.util.List;
import java.util.Random;

public class LearnPageModell {

    private Database database = Database.database;

    public List getUserWords(Player player) {
        return database.getAllWordByPlayer(player);
    }

    public List randomWords(Player player) {
        List<Word> userWords = getUserWords(player);
        Random r = new Random();
        List<Word> randomWords = new LinkedList();
        int random;
        for (int i = 0; i < 10; i++) {
            random = r.nextInt(userWords.size()) + 0;
            randomWords.add(userWords.get(random));
        }
        return randomWords;
    }

}