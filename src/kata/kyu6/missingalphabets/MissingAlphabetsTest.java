package kata.kyu6.missingalphabets;

import org.junit.Test;

import static org.junit.Assert.*;

public class MissingAlphabetsTest {
    private static void test(final String expected, final String input) {
        assertEquals("For input \"" + input + '"', expected, MissingAlphabets.find(input));
    }

    @Test
    public void basicTests() {
        test("z", "abcdefghijklmnopqrstuvwxy");
        test("", "abcdefghijklmnopqrstuvwxyz");
        test("zz", "aabbccddeeffgghhiijjkkllmmnnooppqqrrssttuuvvwwxxyy");
        test("ayzz", "abbccddeeffgghhiijjkkllmmnnooppqqrrssttuuvvwwxxy");
        test("bfghijklmnpqtuvxyz", "codewars");
    }


    @Test
    public void myTests() {
        test( "abcdeghijklmnopqrstuvwxyz","f");
    }
}