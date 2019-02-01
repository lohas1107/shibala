package games.shibala.items;

import lombok.Data;

@Data
public class ScoreRecord {

    private String playerName;
    private String dicesResult;
    private Integer score;

    public ScoreRecord(String playerName, String dicesResult, Integer score) {
        this.playerName = playerName;
        this.dicesResult = dicesResult;
        this.score = score;
    }
}
