package kyu4.secretstring;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SecretDetective2Test {


    private SecretDetective2 detective2;

    @Before
    public void setup() {
        detective2 = new SecretDetective2();
    }

    @Test
    public void secret1() {
        char[][] triplets = {
                {'t','u','p'},
                {'w','h','i'},
                {'t','s','u'},
                {'a','t','s'},
                {'h','a','p'},
                {'t','i','s'},
                {'w','h','s'}
        };
        assertEquals("whatisup", detective2.recoverSecret(triplets));
    }
}