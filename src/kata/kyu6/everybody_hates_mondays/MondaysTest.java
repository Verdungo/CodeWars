package kata.kyu6.everybody_hates_mondays;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class MondaysTest {
    @Test
    public void countTestZeroMondays() {
        assertEquals(0, Mondays.count(LocalDate.of(2017, 1, 1), LocalDate.of(2017, 1, 31)));
        assertEquals(0, Mondays.count(LocalDate.of(0, 1, 1), LocalDate.of(14, 8, 1)));
    }

    @Test public void countTestOneMonday() {
        assertEquals(1, Mondays.count(LocalDate.of(1995, 4, 3), LocalDate.of(2017, 4, 3)));
        assertEquals(0, Mondays.count(LocalDate.of(13456, 4, 1), LocalDate.of(13476, 12, 1)));
    }

    @Test public void countTestManyMondays() {
        assertEquals(53, Mondays.count(LocalDate.of(1995, 4, 2), LocalDate.of(2018, 4, 2)));
        assertEquals(2088, Mondays.count(LocalDate.of(1700, 9, 20), LocalDate.of(1762, 9, 26)));
        assertEquals(1044, Mondays.count(LocalDate.of(-300, 12, 20), LocalDate.of(-258, 12, 22)));
        assertEquals(44, Mondays.count(LocalDate.of(1000000, 2, 25), LocalDate.of(1000022, 12, 28)));
    }

    @Test public void countTestPostRetirement() {
        assertEquals(2922, Mondays.count(LocalDate.of(1995, 4, 2), LocalDate.of(2097, 12, 3)));
        assertEquals(2921, Mondays.count(LocalDate.of(2025,1,1), LocalDate.of(3100, 1, 1)));
        assertEquals(2922, Mondays.count(LocalDate.of(13456, 4, 1), LocalDate.of(19490, 4, 3)));
        assertEquals(2922, Mondays.count(LocalDate.MIN, LocalDate.MAX));
    }
}