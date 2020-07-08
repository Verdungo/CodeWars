package kata.kyu6.encrypt_this;

public class Kata {

    public static String encryptThis(String text) {
        if (text.isEmpty()) return "";
        StringBuilder res = new StringBuilder();

        for (String word : text.split("\\s")) {
            res.append((int)word.charAt(0));

            res.append(swapFirstAndLastLetters(word.substring(1)));

            res.append(" ");
        }

        return res.toString().trim();
    }

    private static String swapFirstAndLastLetters(String s) {
        StringBuilder res = new StringBuilder();
        if (s.length() < 2) {
            return s;
        } else {
            res.append(s.charAt(s.length()-1));
            if (s.length() > 2) {
                res.append(s, 1, s.length() -1);
            }
            res.append(s.charAt(0));
        }

        return res.toString();
    }

    private Kata(){}
}
