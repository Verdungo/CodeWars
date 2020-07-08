package kata.kyu6.differenceof2;

import org.junit.Test;

import static org.junit.Assert.*;

public class KataTest {

    @Test
    public void sampleTests() {
        assertArrayEquals(
                new int[][]{{1, 3}, {2, 4}},
                Kata.twosDifference(new int[]{1, 2, 3, 4})
        );

        assertArrayEquals(
                new int[][]{{1, 3}, {4, 6}},
                Kata.twosDifference(new int[]{1, 6, 4, 3})
        );
    }
}