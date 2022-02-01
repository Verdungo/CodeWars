package kata.kyu6.which_are_in;

import org.junit.Test;

import static org.junit.Assert.*;

public class WhichAreInTest {
    @Test
    public void test1() {
        String a[] = new String[]{ "live", "strong", "arp" };
        String b[] = new String[] { "lively", "alive", "harp", "sharp"};
        String r[] = new String[] { "arp", "live"};
        assertArrayEquals(r, WhichAreIn.inArray(a, b));
    }

    @Test
    public void test2() {
        String a[] = new String[]{ "arp", "live", "strong" };
        String b[] = new String[] { "lively", "alive", "harp", "sharp", "armstrong" };
        String r[] = new String[] { "arp", "live", "strong" };
        assertArrayEquals(r, WhichAreIn.inArray(a, b));
    }
}