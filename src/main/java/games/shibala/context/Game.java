package games.shibala.context;

public abstract class Game {

    final public void play() {
        addPlayers();
        playGame();
        showResult();
    }

    protected abstract void addPlayers();

    protected abstract void playGame();

    protected abstract void showResult();
}
