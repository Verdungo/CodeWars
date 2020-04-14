package kyu4.secretstring;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Реализация через отображение &lt;Char, Set&lt;Char&gt;&gt;
 * (символ и тот(те), что точно после него стоит)
 * <p>
 * Когда отображение готово, выявится символ, у которого нет последователя - он последний!
 * Удаляем его из мапы, повторяем поиск последнего.
 */
public class SecretDetective2 {
    public String recoverSecret(char[][] triplets) {
        String answer = "";
        // build map
        Map<Character, Set<Character>> map = new HashMap<>();
        for (int i = 0; i < triplets.length; i++) {
            for (int j = 0; j < triplets[i].length; j++) {
                if (!map.containsKey(triplets[i][j])) {
                    map.put(triplets[i][j], new HashSet<>());
                }
            }
            map.get(triplets[i][0]).add(triplets[i][1]);
            map.get(triplets[i][1]).add(triplets[i][2]);
        }

        while (!map.isEmpty()) {
            // find last symbol
            Character last = null;
            for (Map.Entry<Character, Set<Character>> entry : map.entrySet()) {
                if (entry.getValue().isEmpty()) {
                    last = entry.getKey();
                }
            }
            if (last == null) {
                // problem says it's impossible in tests
                return "";
            }
            // insert to the answer
            answer = last + answer;
            // delete last symbol from map
            map.remove(last);
            for (Set<Character> set : map.values()) {
                set.remove(last);
            }
        }
        return answer;
    }
}
