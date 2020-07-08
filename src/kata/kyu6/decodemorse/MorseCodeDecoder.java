package kata.kyu6.decodemorse;

import java.util.HashMap;
import java.util.Map;

public class MorseCodeDecoder {
    public static Map<String, String> MorseCode = new HashMap<String, String>(){{
        put(".-", "A");
        put("-...", "B");
        put("-.-.", "C");
        put("-..", "D");
        put(".", "E");
        put("..-.", "F");
        put("--.", "G");
        put("....", "H");
        put("..", "I");
        put(".---", "J");
        put("-.-", "K");
        put(".-..", "L");
        put("--", "M");
        put("-.", "N");
        put("---", "O");
        put(".--.", "P");
        put("---.", "Q");
        put(".-.", "R");
        put("...", "S");
        put("-", "T");
        put("..-", "U");
        put("...-", "V");
        put(".--", "W");
        put("-..-", "X");
        put("-.--", "Y");
        put("--..", "Z");

        put(".----", "1");
        put("..---", "2");
        put("...--", "3");
        put("....-", "4");
        put(".....", "5");
        put("-....", "6");
        put("--...", "7");
        put("---..", "8");
        put("----.", "9");
        put("-----", "0");

        put(null, " ");
        put("", " ");
    }};

    public static String decode(String morseCode) {
        String answer = "";
        for (String word : morseCode.split("   ")) {
            for (String code : word.split(" ")) {
                answer += MorseCode.get(code);
            }
            answer += " ";
        }
        return answer.trim();
    }
}


