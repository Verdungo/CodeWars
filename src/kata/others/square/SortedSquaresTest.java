package kata.others.square;

import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.Assert.*;

public class SortedSquaresTest {
    @Test
    public void test1() {
        assertArrayEquals(new int[]{1, 4, 9}, SortedSquares.square(new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{1, 9, 16}, SortedSquares.square(new int[]{-4, 1, 3}));
    }

    @Test
    public void randomNumbersTest() {
        Random random = new Random();
        int[] array = new int[10];
        int[] squares = new int[10];

        for (int i = 0; i < 10; i++) {
            array[i] = random.nextInt(100) - 50;
            squares[i] = array[i] * array[i];
        }

        Arrays.sort(array);
        Arrays.sort(squares);

        assertArrayEquals(squares, SortedSquares.square(array));
    }
}