package kata.kyu6.missingalphabets;

import java.util.Arrays;

class MissingAlphabets {
    private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    static String find(final String text) {
        String result = "";
        for (char c : text.toCharArray()) {
            if (result.indexOf(c) >= 0) {
                result = removeLetter(result, c);
            } else {
                result += removeLetter(ALPHABET, c);
            }
        }
        //sort result

        return sort(result);
    }

    private static String removeLetter(String from, char letter) {
        int idx = from.indexOf(letter);
        return from.substring(0, idx) + from.substring(idx + 1);
    }

    private static String sort(String toSort) {
        char[] chars = toSort.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

}
