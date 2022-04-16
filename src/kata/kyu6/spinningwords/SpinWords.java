package kata.kyu6.spinningwords;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SpinWords {

  public String spinWords(String sentence) {
    return Arrays.stream(sentence.split(" "))
        .map(s -> s.length() > 4 ? reverse(s) : s)
        .collect(Collectors.joining(" "));
  }

  private String reverse(String s) {
    String r = "";
    for (int i = 0; i < s.length(); i++) {
      r = s.charAt(i) + r;
    }
    return r;
  }

}
