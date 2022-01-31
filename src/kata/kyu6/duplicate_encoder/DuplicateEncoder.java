package kata.kyu6.duplicate_encoder;

import java.util.HashMap;
import java.util.Map;

public class DuplicateEncoder {
    private static final Character UNIQUE = '(';
    private static final Character NON_UNIQUE = ')';

    public static String encode(String word) {
        word = word.toLowerCase();
        String result = "";
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            result += (word.indexOf(c) == word.lastIndexOf(c)) ? "(" : ")";
        }
        return result;
    }

    //ver1
    /*public static String encode(String word) {
        word = word.toLowerCase();
        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            Character c = word.charAt(i);
            if (map.putIfAbsent(c, UNIQUE) != null) {
                map.put(c, NON_UNIQUE);
            }
        }
        String result = "";
        for (int i = 0; i < word.length(); i++) {
            result += map.get(word.charAt(i));
        }
        return result;
    }*/
}
