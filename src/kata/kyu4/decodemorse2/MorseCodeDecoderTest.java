package kata.kyu4.decodemorse2;

import org.junit.Test;

import static org.junit.Assert.*;

public class MorseCodeDecoderTest {
    @Test
    public void testExampleFromDescription() throws Exception {
        assertEquals(MorseCodeDecoder.decodeMorse(MorseCodeDecoder.decodeBits("1100110011001100000011000000111111001100111111001111110000000000000011001111110011111100111111000000110011001111110000001111110011001100000011")), ("HEY JUDE"));
    }

    @Test
    public void bitsTest() {
        assertEquals(".",MorseCodeDecoder.decodeBits("11"));
        assertEquals("..",MorseCodeDecoder.decodeBits("110011"));
        assertEquals(".-.",MorseCodeDecoder.decodeBits("11001111110011"));
        assertEquals(".-. .",MorseCodeDecoder.decodeBits("1100111111001100000011"));
        assertEquals(".   .",MorseCodeDecoder.decodeBits("110000000000000011"));
    }

    @Test
    public void durationTest() {
        assertEquals(".", MorseCodeDecoder.decodeBits("1"));
        assertEquals(".", MorseCodeDecoder.decodeBits("111"));
        assertEquals(".", MorseCodeDecoder.decodeBits("01110"));
    }

}