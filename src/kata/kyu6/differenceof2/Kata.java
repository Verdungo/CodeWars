package kata.kyu6.differenceof2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Kata {
    public static int[][] twosDifference(int[] array) {
        List<int[]> res = new ArrayList<>();
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j <= 2 && i + j < array.length; j++) {
                if (array[i + j] - array[i] == 2) {
                    //add to res
                    res.add(new int[]{array[i], array[i + j]});
                }
            }
        }
        int[][] result = new int[res.size()][2];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < 2; j++) {
                result[i][j] = res.get(i)[j];
            }
        }
        return result;
    }
}
