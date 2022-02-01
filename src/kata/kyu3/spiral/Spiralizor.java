package kata.kyu3.spiral;

public class Spiralizor {
    private static final int[][][] MIN_FIELD = new int[][][]{
            {
                    {1}
            },
            {
                    {1, 1},
                    {0, 1}
            },
            {
                    {1, 1, 1},
                    {0, 0, 1},
                    {1, 1, 1}
            },
            {
                    {1, 1, 1, 1},
                    {0, 0, 0, 1},
                    {1, 0, 0, 1},
                    {1, 1, 1, 1},
            }
    };

    public static int[][] spiralize(int size) {
        int[][] result = new int[size][size];
        int offset = 0;

        while (size - 2*offset > 4) {
            makeCoil(result, offset);
            offset += 2;
        }

        makeMinField(result, offset, size-2*offset);

        printSpiral(result);

        return result;
    }

    private static void makeCoil(int[][] arr, int offset) {
        for (int i = 0; i < arr.length - 2*offset; i++) {
            arr[offset][offset + i] = 1; // >
            arr[offset + i][arr.length-1 - offset ] = 1; // v
            arr[arr.length-1 - offset ][arr.length-1 - offset - i] = 1; //<
            arr[arr.length-1 - offset - i][offset] = 1;//^
        }
        arr[offset + 1][offset] = 0;
        arr[offset + 2][offset + 1] = 1;
    }

    private static void makeMinField(int[][] arr, int offset, int size) {
        for (int i = 0; i < size; i++) {
            System.arraycopy(MIN_FIELD[size-1][i], 0, arr[offset + i], offset, size);
        }
    }

    private static void printSpiral(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            int[] line = arr[i];
            for (int j = 0; j < line.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        spiralize(8);
    }
}