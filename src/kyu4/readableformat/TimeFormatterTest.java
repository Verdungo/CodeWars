package kyu4.readableformat;

import org.junit.Test;

import static org.junit.Assert.*;

public class TimeFormatterTest {

    @Test
    public void exampleTest1() {
        assertEquals("1 second", TimeFormatter.formatDuration(1));
 }

    @Test
    public void exampleTest2() {
        assertEquals("1 minute and 2 seconds", TimeFormatter.formatDuration(62));
    }

    @Test
    public void exampleTest3() {
        assertEquals("2 minutes", TimeFormatter.formatDuration(120));
    }

    @Test
    public void exampleTest4() {
        assertEquals("1 hour", TimeFormatter.formatDuration(3600));
    }

    @Test
    public void exampleTest5() {
        assertEquals("1 hour, 1 minute and 2 seconds", TimeFormatter.formatDuration(3662));
    }

    @Test
    public void exampleTest6() {
        assertEquals("1 year and 2 hours", TimeFormatter.formatDuration(TimeFormatter.YEAR + 2*TimeFormatter.HOUR));
    }

    @Test
    public void exampleTestNow() {
        assertEquals("now", TimeFormatter.formatDuration(0));
    }
}