package kata.kyu6.duplicate_encoder;

import org.junit.Test;

import static org.junit.Assert.*;

public class DuplicateEncoderTest {
    @Test
    public void myTest() {
        assertEquals(DuplicateEncoder.encode("din"), "(((");
        assertEquals(DuplicateEncoder.encode("recede"), "()()()");
    }

    @Test
    public void test() {
        assertEquals(")()())()(()()(",
                DuplicateEncoder.encode("Prespecialized"));
        assertEquals("))))())))", DuplicateEncoder.encode("   ()(   "));
    }
}