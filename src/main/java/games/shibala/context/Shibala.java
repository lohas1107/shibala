package games.shibala.context;

import games.shibala.items.Bowl;
import games.shibala.items.Player;
import games.shibala.items.ScoreBoard;

import java.util.ArrayList;
import java.util.List;

public class Shibala extends Game {

    private List<Player> playerList;
    private Bowl bowl;
    private ScoreBoard scoreBoard;

    public Shibala() {
        this.playerList = new ArrayList<>();
        this.bowl = new Bowl();
        this.scoreBoard = new ScoreBoard();
    }

    @Override
    protected void addPlayers() {
        playerList.add(new Player("1P"));
        playerList.add(new Player("2P"));
    }

    @Override
    protected void playGame() {
        playerList.forEach(player -> {
            player.rollDices(bowl);
            scoreBoard.recordScore(player, bowl);
        });
    }

    @Override
    protected void showResult() {
        scoreBoard.showResult();
        scoreBoard.showWinner();
    }
}
