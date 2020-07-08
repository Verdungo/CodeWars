package kata.kyu8.first_n_elements;

import java.util.Arrays;

public class Solution {
    public static int[] take(int[] arr, int n) {
        int resLenght = Math.min(n, arr.length);
        return Arrays.copyOfRange(arr,0, resLenght);
    }
}
