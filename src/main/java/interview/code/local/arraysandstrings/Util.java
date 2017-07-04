package interview.code.local.arraysandstrings;

/**
 * Created by vibinramakrishnan on 7/3/17.
 */
public class Util {

    public static void printMatrix(int[][] matrix) {

        for (int r = 0; r < matrix.length; r++) {
            for (int i : matrix[r]) {
                System.out.print(i);
                System.out.print("\t");
            }
            System.out.println();
        }
    }

    static int[][] creteMatrix(int i, int j) {

        int twoDm[][] = new int[3][3];
        int k = 1;

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                twoDm[i][j] = k;
                k++;
            }
        }
        return twoDm;
    }
}
