package kyu7.pointsinsegments;

import org.junit.Test;

import static org.junit.Assert.*;

public class PointsInSegmentsTest {
    @Test
    public void exampleTest1() {
        assertArrayEquals(new int[]{0, 3, 4}, PointsInSegments.segments(5, new int[][] {{2, 2}, {1, 2}, {5, 5}}));
    }

    @Test
    public void exampleTest2() {
        assertArrayEquals(new int[0], PointsInSegments.segments(7, new int[][] {{0,7}}));
    }
}