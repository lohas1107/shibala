package games.shibala.items;

import lombok.Data;

@Data
public class Player {

    private String name;

    public Player(String name) {
        this.name = name;
    }

    public void rollDices(Bowl bowl) {
        bowl.rollDices();
    }
}
