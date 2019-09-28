package software.persistent;

import lombok.AllArgsConstructor;
import lombok.Builder;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.List;

@Builder
@AllArgsConstructor
@Entity
public class Player {
    @Id
    @GeneratedValue
    private long Id;


    @Column(unique = true)
    private String username;

    @Column(unique = true)
    private String email;

    private String password;

    @OneToMany(cascade={CascadeType.PERSIST, CascadeType.MERGE},mappedBy = "player")
    @Cascade(value = org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    private List<Word> Words;

    public Player(){};

    public List<Word> getWords() {
        return Words;
    }

    public void setWords(List<Word> word) {
        Words = word;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }


    public void setId(long id) {
        Id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getId() {
        return Id;
    }

    public String getUsername() {
        return username;
    }
}
