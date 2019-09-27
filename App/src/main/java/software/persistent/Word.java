package software.persistent;

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
    private long id;

    private String hunWord;


    private String engWord;

    @ManyToOne
    private Player player;

    ;

    public void setId(long id) {
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

    public long getId() {
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
