package games.shibala.rules;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShibalaUtil {

    /**
     * 一色
     */
    public static Boolean isFlush(int[] dices) {
        return Arrays.stream(dices).allMatch(value -> value == dices[0]);
    }

    public static Integer getSum(int[] dices) {
        return Arrays.stream(dices).sum();
    }

    public static List<Integer> findPairs(int[] dices) {

        int[] pairCounter = new int[6];
        List<Integer> pairs = new ArrayList<>();

        for (int value : dices) {
            pairCounter[value - 1]++;
        }

        for (int i = 0; i < pairCounter.length; i++) {
            if (pairCounter[i] == 2) {
                pairs.add(i + 1);
            }
        }

        return pairs;
    }

    public static Integer getPoint(int[] dices) {

        if (isFlush(dices)) return 13;

        List<Integer> pairs = findPairs(dices);

        // 兩對
        if (pairs.size() == 2) {
            return pairs.get(1) * 2;
        }

        // 一對
        if (pairs.size() == 1) {
            return getSum(dices) - (pairs.get(0) * 2);
        }

        // 沒點
        return 0;
    }

}
