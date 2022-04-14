package kata.kyu4.sudokuvalidator;

import java.util.HashSet;
import java.util.Set;

public class SudokuValidator {
  public static boolean check(int[][] sudoku) {
    // boxes
    Set<Integer> set = new HashSet<>();
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        set.clear();
        for (int k = 0; k < 3; k++) {
          for (int l = 0; l < 3; l++) {
            int curr = sudoku[3 * i + k][3 * j + l];
            if (0 > curr || curr > 9) {
              return false;
            }
            if (!set.contains(curr)) {
              set.add(curr);
            } else {
              return false;
            }
          }
        }
        if (set.size() != 9) {
          return false;
        }
      }
    }

    // lines
    Set<Integer> hset = new HashSet<>();
    Set<Integer> vset = new HashSet<>();
    for (int i = 0; i < 9; i++) {
      hset.clear();
      vset.clear();
      for (int j = 0; j < 9; j++) {
        int hcurr = sudoku[i][j];
        int vcurr = sudoku[j][i];
        if (1 > hcurr || hcurr > 9 || 1 > vcurr || vcurr > 9) {
          return false;
        }
        if (!hset.contains(hcurr)) {
          hset.add(hcurr);
        } else {
          return false;
        }
        if (!vset.contains(vcurr)) {
          vset.add(vcurr);
        } else {
          return false;
        }
      }
      if (vset.size() != 9 || hset.size() != 9) {
        return false;
      }
    }
    return true;
  }
}
