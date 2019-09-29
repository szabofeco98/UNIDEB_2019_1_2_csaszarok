package software.modell;

import software.persistent.Database;
import software.persistent.Player;

import java.util.List;

public class LearnPageModell {
    private Database database=Database.database;

    public List getuserWords(Player player){
        return database.getAllWordByPlayer(player);
    }
}
