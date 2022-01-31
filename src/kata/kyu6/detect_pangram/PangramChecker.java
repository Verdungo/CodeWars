package kata.kyu6.detect_pangram;

import java.util.Set;
import java.util.TreeSet;

public class PangramChecker {
    public boolean check(String sentence){
        // 1. lower string
        String lower = sentence.toLowerCase();
        Set<Character> letters = new TreeSet<>();

        // 2. form set with only letters
        for (int i = 0; i < lower.length(); i++) {
            char c = lower.charAt(i);
            if (c >= 'a' && c <= 'z') {
                letters.add(c);
            }
        }

        // 3. check size!
        return letters.size() == 26;
    }
}
