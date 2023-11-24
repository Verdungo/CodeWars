package kata.others.square;

import java.util.*;

public class SortedSquares {
    public static int[] square(int[] array) {
        int left = 0;
        int right = array.length - 1;

        List<Integer> list = new ArrayList<>();
        while (left <= right) {
            int leftSquare = (int) Math.pow(array[left], 2);
            int rightSquare = (int) Math.pow(array[right], 2);

            if (leftSquare > rightSquare) {
                list.add(0, leftSquare);
                left++;
            } else {
                list.add(0, rightSquare);
                right--;
            }
        }

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}
