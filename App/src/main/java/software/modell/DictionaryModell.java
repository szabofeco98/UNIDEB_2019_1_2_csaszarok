package software.modell;

import software.persistent.Database;
import software.persistent.Player;
import software.persistent.Word;

import java.util.List;

public class DictionaryModell {
    private Database database=Database.database;

    public void addWord(Word word){
        database.persist(word);
    }

    public void remowe(long id){
        Word word=database.getWordById(id);
        database.remove(word);
    }

    public List getuserWords(Player player){
       return database.getAllWordByPlayer(player);
    }
}
