package kata.kyu5.greedisgood;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Greed {
    static Map<Integer, Long> threes = Map.of(
            1, 1000L,
            2, 200L,
            3, 300L,
            4, 400L,
            5, 500L,
            6, 600L);
    static Map<Integer, Long> singles = Map.of(
            1, 100L,
            2, 0L,
            3, 0L,
            4, 0L,
            5, 50L,
            6, 0L);

    public static int greedy(int[] dice) {
        Map<Integer, Long> map = Arrays.stream(dice).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        int result = 0;
        for (int i = 1; i <= 6; i++) {
            if (map.get(i) != null) {
                if (map.get(i) >= 3) {
                    result += threes.get(i);
                    map.put(i, map.get(i) - 3);
                }
                result += singles.get(i) * map.get(i);
            }
        }
        return result;
    }
}