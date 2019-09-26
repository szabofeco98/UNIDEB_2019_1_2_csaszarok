package software.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Word {

    @Id
    @GeneratedValue
    private int id;

    private String hunWord;


    private String engWord;

    @ManyToOne
    private Player player;

    ;

    public void setId(int id) {
        this.id = id;
    }

    public void setHunWord(String hunWord) {
        this.hunWord = hunWord;
    }

    public void setEngWord(String engWord) {
        this.engWord = engWord;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public int getId() {
        return id;
    }

    public String getHunWord() {
        return hunWord;
    }

    public String getEngWord() {
        return engWord;
    }

    public Player getPlayer() {
        return player;
    }
}
