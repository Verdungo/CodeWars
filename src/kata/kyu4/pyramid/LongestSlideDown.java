package kata.kyu4.pyramid;

public class LongestSlideDown {
  public static int longestSlideDown(int[][] p) {
    int[] prevLayer = p[p.length-1];
    for (int i = p.length - 2; i >= 0; i--) {
      int[] layer = new int[p[i].length];
      for (int j = 0; j < layer.length; j++) {
        layer[j] = p[i][j] + Math.max(prevLayer[j], prevLayer[j+1]);
      }
      prevLayer = layer;
    }
    return prevLayer[0];
  }

  // recursive up-to-down
  /*
  public static int longestSlideDown(int[][] p) {
    // get current top
    if (p.length == 0 || p[0].length == 0) {
      return 0;
    }
    int sum = p[0][0];

    // recurse two lower pyramids
    int[][] leftSubPyramid = getLeftSubPyramid(p);
    int[][] rightSubPyramid = getRightSubPyramid(p);

    // sum is max of two sub-pyramids
    sum += Math.max(longestSlideDown(leftSubPyramid), longestSlideDown(rightSubPyramid));

    return sum;
  }

  private static int[][] getLeftSubPyramid(int[][] p) {
    int[][] leftP = new int[p.length - 1][];
    for (int i = 0; i < p.length - 1; i++) {
      leftP[i] = new int[p[i + 1].length - 1];
      for (int j = 0; j < p[i + 1].length - 1; j++) {
        leftP[i][j] = p[i + 1][j];
      }
    }
    return leftP;
  }

  private static int[][] getRightSubPyramid(int[][] p) {
    int[][] rightP = new int[p.length - 1][];
    for (int i = 0; i < p.length - 1; i++) {
      rightP[i] = new int[p[i + 1].length - 1];
      for (int j = 1; j < p[i + 1].length; j++) {
        rightP[i][j - 1] = p[i + 1][j];
      }
    }
    return rightP;
  }

  */
}
