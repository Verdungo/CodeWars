package kata.kyu5.ants;

public class Ants {
  public static void main(String[] args) {
    String ants = "dcba";
    System.out.println(ants);

    ants = swapAnts(ants);
    System.out.println(ants);

    ants = swapAnts(ants);
    System.out.println(ants);

    ants = swapAnts(ants);
    System.out.println(ants);
  }

  public static String antBridge(final String ants, final String terrain) {
    String currentAnts = ants;

    for (int i = 0; i < terrain.length(); i++) {
      // begin or end of gap
      if (terrain.charAt(i) == '-') {
        if (i+1 < terrain.length() && terrain.charAt(i+1) == '.') {
          //begin of gap
          currentAnts = swapAnts(currentAnts);
        } else if (i-1 > 0 && terrain.charAt(i-1) == '.') {
          //end of gap
          currentAnts = swapAnts(currentAnts);
        }
      } else {
        // gap itself
        currentAnts = swapAnts(currentAnts);
      }
    }

    return currentAnts;
  }

  private static String swapAnts(String ants) {
    return ants.substring(ants.length()-1) + ants.substring(0,ants.length()-1);
  }
}
