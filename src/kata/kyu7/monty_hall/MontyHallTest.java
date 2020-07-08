package kata.kyu7.monty_hall;

import org.junit.Test;

import static org.junit.Assert.*;

public class MontyHallTest {
    MontyHall montyHall = new MontyHall();

    @Test
    public void test() {
        assertEquals(71, montyHall.montyHallCase(1, new int[]{3,3,2,3,3,2,2,3,2,2,1,1,1,1}));
        assertEquals(64, montyHall.montyHallCase(2, new int[]{3,3,2,3,3,2,2,3,2,2,1,1,1,1}));
        assertEquals(64, montyHall.montyHallCase(3, new int[]{3,3,2,3,3,2,2,3,2,2,1,1,1,1}));
    }

    @Test
    public void myTest() {

        assertEquals(70, montyHall.montyHallCase(1, new int[]{1,2,2,2,3,2,1,3,1,3}));
        assertEquals(55, montyHall.montyHallCase(2, new int[]{2,1,2,1,2,3,1,1,2,2,3}));
    }
}