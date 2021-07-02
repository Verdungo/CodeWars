package kata.kyu6.children_and_candies;

public class CircleOfChildren {
    public static void main(String[] args) {
        System.out.println(6/2);//5
        System.out.println(5/2);//4
    }

    public static int[] distributionOfCandy(int[] candies) {
        int step = 0;
        while (!isEqualCounts(candies)) {
            candies = doThePass(candies);
            step++;
        }

        return new int[]{step, candies[0]};
    }

    private static int[] doThePass(int[] candies) {
        int[] res = new int[candies.length];

        for (int i = 0; i < candies.length; i++) {
            res[i] = (candies[i] + 1) / 2
                    + (candies[i < 1 ? candies.length-1 : i-1] +1) / 2;
        }

        return res;
    }

    private static boolean isEqualCounts(int[] candies) {
        for (int i = 1; i < candies.length; i++) {
            if (candies[i] != candies[i-1]) return false;
        }
        return true;
    }
}
