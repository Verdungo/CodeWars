package kata.kyu6.multiples;

import java.util.stream.IntStream;

public class Solution {

  public int solution(int n) {
    int res = 0;

    //stream
    return IntStream.range(3, n)
        .filter(i -> i%3==0 || i%5==0)
        .reduce(Integer::sum).orElse(0);

    // O(n)
    /*for (int i = 3; i < n; i++) {
      if (i % 3 == 0 || i % 5 == 0) {
        res += i;
      }
    }

    return res >=3 ? res : 0;*/
  }
}
