package kata.kyu5.ants;

import org.junit.Test;

import static org.junit.Assert.*;

public class AntsTest {

  @Test
  public void noGaps() {
    assertEquals("GFEDCBA", Ants.antBridge("GFEDCBA", "-----------------------"));
  }

  @Test
  public void example() {
    assertEquals("EDCBAGF", Ants.antBridge("GFEDCBA", "------------...-----------"));
    assertEquals("CBAGFED", Ants.antBridge("GFEDCBA", "------------.-----------"));
    assertEquals("FEDCBAG", Ants.antBridge("GFEDCBA", "---------.------------.--------"));
    assertEquals("FEDCBAG", Ants.antBridge("GFEDCBA", "---------.--.--------"));
    assertEquals("EDCBAGF", Ants.antBridge("GFEDCBA", "---------.-.--------"));
    assertEquals("GFEDCBA", Ants.antBridge("GFEDCBA", "---------..--.--------"));
    assertEquals("BAGFEDC", Ants.antBridge("GFEDCBA", "---------....--.--------"));
    assertEquals("DCBAE", Ants.antBridge("EDCBA", "-------...-...--------"));
  }

}
