package kyu6.decodemorse;

import org.junit.Test;

import static org.junit.Assert.*;

public class MorseCodeDecoderTest {
    @Test
    public void testExampleFromDescription() {
        assertEquals(MorseCodeDecoder.decode(".-"), "A");
    }

    @Test
    public void testExampleFromDescription2() {
        assertEquals(MorseCodeDecoder.decode(".... . -.--   .--- ..- -.. ."), ("HEY JUDE"));
    }
}