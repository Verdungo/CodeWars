package kyu7.unflattenlist;

import java.util.ArrayList;
import java.util.List;

public class Kata {
    public static Object[] unflatten(int[] flatArray) {
        List result = new ArrayList();
        for (int i = 0; i < flatArray.length; i++) {
            int k = flatArray[i];
            Object toAdd = null;
            if (k < 3) {
                toAdd = k;
            } else {
                if (i + k > flatArray.length) k = flatArray.length - i;
                toAdd = new int[k];
                //for (int j = 0; j < k; j++) {
                while (k-- > 0 && i + k < flatArray.length) {
                    ((int[]) toAdd)[k] = flatArray[i + k];
                }
                i += flatArray[i] - 1;
            }
            result.add(toAdd);
        }
        return result.toArray();
    }
}
