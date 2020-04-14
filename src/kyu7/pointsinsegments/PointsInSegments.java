package kyu7.pointsinsegments;

    import java.util.ArrayList;
    import java.util.List;

public class PointsInSegments {
    public static int[] segments(final int m, final int[][] arr) {
        List<Integer> res = new ArrayList<>();
        List<Integer> all = new ArrayList<>();
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j][0] <= i && i <= arr[j][1]) {
                    res.add(i);
                    break;
                }
            }
            all.add(i);
        }

        all.removeAll(res);

        int[] result = new int[all.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = all.get(i);
        }

        return result;
    }
}
