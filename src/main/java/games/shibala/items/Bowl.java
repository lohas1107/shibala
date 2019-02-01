package games.shibala.items;

import games.shibala.rules.ShibalaUtil;

import java.util.Arrays;
import java.util.Random;

public class Bowl {

    private static final int DICE_AMOUNT = 4;

    private int[] dices = new int[DICE_AMOUNT];
    private Random random = new Random();

    public void rollDices() {
        for (int i = 0; i < dices.length; i++) {
            dices[i] = random.nextInt(6) + 1;
        }
    }

    public String getResult() {
        return Arrays.toString(dices);
    }

    public Integer getScore() {
        return ShibalaUtil.getPoint(dices);
    }
}
