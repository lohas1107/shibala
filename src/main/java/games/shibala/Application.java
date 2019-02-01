package games.shibala;

import games.shibala.context.Game;
import games.shibala.context.Shibala;

public class Application {

    public static void main(String[] args) {
        Game game = new Shibala();
        game.play();
    }
}
