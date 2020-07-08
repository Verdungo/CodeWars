package kata.kyu8.first_n_elements;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void basicTests() {
        assertArrayEquals("should return the first 3 items", new int[]{0, 1, 2}, Solution.take(new int[]{0, 1, 2, 3, 5, 8, 13}, 3));
    }

    @Test
    public void shortArrayTests() {
        assertArrayEquals( new int[0], Solution.take(new int[0], 8));
    }
}