package kata.kyu7.list_filtering;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class KataTest {
    @Test
    public void examples() {
        // assertEquals("expected", "actual");
        assertEquals(Arrays.asList(new Object[]{1,2}), Kata.filterList(Arrays.asList(new Object[]{1,2,"a","b"})));
        assertEquals(Arrays.asList(new Object[]{1,0,15}), Kata.filterList(Arrays.asList(new Object[]{1,"a","b",0,15})));
        assertEquals(Arrays.asList(new Object[]{1,2,123}), Kata.filterList(Arrays.asList(new Object[]{1,2,"aasf","1","123",123})));
    }
}