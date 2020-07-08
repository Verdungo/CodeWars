package kata.kyu4.decodemorse2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MorseCodeDecoder {
    // Yeah, name pattern fail, but it's for easy
    public static Map<String, String> MorseCode = new HashMap<String, String>() {{
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

    public static String decodeBits(String bits) {
        // find timeunit
        bits = bits.replaceAll("^0+","")
                .replaceAll("0+$","");
        int timeUnit = Stream.concat(Arrays.stream(bits.split("[0]+")),
                Arrays.stream(bits.split("[1]+")))
                .mapToInt(String::length)
                .filter(i -> i > 0)
                .min()
                .orElse(Integer.MAX_VALUE);

        String dot = IntStream.range(0, timeUnit).mapToObj(i -> "1").collect(Collectors.joining());
        String dash = IntStream.range(0, 3 * timeUnit).mapToObj(i -> "1").collect(Collectors.joining());
        String unitSpace = IntStream.range(0, timeUnit).mapToObj(i -> "0").collect(Collectors.joining());
        String letterSpace = IntStream.range(0, 3 * timeUnit).mapToObj(i -> "0").collect(Collectors.joining());
        String wordSpace = IntStream.range(0, 7 * timeUnit).mapToObj(i -> "0").collect(Collectors.joining());


        return bits.replaceAll(wordSpace, "   ")
                .replaceAll(letterSpace, " ")
                .replaceAll(dash, "-")
                .replaceAll(dot, ".")
                .replaceAll(unitSpace, "")
                .replaceAll("0","")
                .trim();
    }

    public static String decodeMorse(String morseCode) {
        return decode(morseCode);
    }

        public static void main(String[] args) {
            String s = "1110111";
            System.out.println(s);
            int timeUnit = Stream.concat(Arrays.stream(s.split("[0]+")),
                    Arrays.stream(s.split("[1]+")))
                    .mapToInt(String::length)
                    .filter(i -> i > 0)
                    .min()
                    .orElse(Integer.MAX_VALUE);
            System.out.println("min = " + timeUnit);

            System.out.println("end");
    }
}
