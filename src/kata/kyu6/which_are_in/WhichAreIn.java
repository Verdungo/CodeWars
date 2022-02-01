package kata.kyu6.which_are_in;

import java.util.Arrays;

public class WhichAreIn {
    public static String[] inArray(String[] a1, String[] a2) {
        return Arrays.stream(a1)
                .filter(w -> Arrays.stream(a2).anyMatch(p -> p.contains(w)))
                .distinct().sorted().toArray(String[]::new);
    }
}
