package kata.kyu6.children_and_candies;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class CircleOfChildrenTest {
    @Test
    public void myTests() {
        assertEquals(
                Arrays.toString(new int[]{0, 1}),
                Arrays.toString(CircleOfChildren.distributionOfCandy(new int[]{1, 1, 1, 1, 1})))
        ;
        assertEquals(
                Arrays.toString(new int[]{1, 2}),
                Arrays.toString(CircleOfChildren.distributionOfCandy(new int[]{1, 2, 1, 2, 2})))
        ;
    }

    @Test
    public void basicTests() {
        assertEquals(
                Arrays.toString(new int[]{6, 6}),
                Arrays.toString(CircleOfChildren.distributionOfCandy(new int[]{1, 2, 3, 4, 5})))
        ;
        assertEquals(
                Arrays.toString(new int[]{17, 18}),
                Arrays.toString(CircleOfChildren.distributionOfCandy(new int[]{10, 2, 8, 22, 16, 4, 10, 6, 14, 20}))
        );
    }
}