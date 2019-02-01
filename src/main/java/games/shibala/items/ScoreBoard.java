package games.shibala.items;

import java.util.ArrayList;
import java.util.List;

public class ScoreBoard {

    private List<ScoreRecord> scoreRecordList;

    public ScoreBoard() {
        scoreRecordList = new ArrayList<>();
    }

    public void recordScore(Player player, Bowl bowl) {
        ScoreRecord scoreRecord = new ScoreRecord(player.getName(), bowl.getResult(), bowl.getScore());
        scoreRecordList.add(scoreRecord);
    }

    public void showResult() {
        scoreRecordList.forEach(System.out::println);
    }

    public void showWinner() {
        int score1P = scoreRecordList.get(0).getScore();
        int score2P = scoreRecordList.get(1).getScore();

        if (score1P == score2P) System.out.println("Draw");
        else if (score1P > score2P) System.out.println("1P win");
        else System.out.println("2P win");
    }
}
