package interview.code.local;

/**
 * Created by vibinramakrishnan on 7/1/17.
 */
public class GridRotate90 {

    public static void main(String[] args) {
        int[][] grid1 = createGrid(3, 3);
        printGrid(grid1);
        System.out.println("row -> " + grid1.length);
        System.out.println("column-> " + grid1[0].length);

        int[][] rotate90 = rotate(grid1,3);

        printGrid (rotate90);

    }


    public static int[][] createGrid(final int row, final int column) {

        int twoDm[][] = new int[row][column];
        int i, j, k = 1;
        for (i = 0; i < row; i++) {
            for (j = 0; j < column; j++) {
                twoDm[i][j] = k;
                k++;

            }
        }
        return twoDm;
    }


    public static void printGrid(int[][] grid) {

        for (int[] row : grid) {
            for (int i : row) {
                System.out.print(i);
                System.out.print("\t");
            }
            System.out.println();
        }

//
//        for (int i=0;i<3;i++) {
//            for (int j=0;j<3 ;j++) {
//                System.out.print(grid[i][j]);
//                System.out.print("\t");
//            }
//            System.out.println();
//        }
    }


    public static void printStringGrid(String[] row) {
        for (String i : row) {
            System.out.print(i);
            System.out.print("\t");
        }
        System.out.println();
    }


    public static int[][]  rotate(int[][] matrix, int n) {
        for (int layer = 0; layer < n / 2; ++layer) {
            int first = layer;
            int last = n - 1 - layer;
            for (int i = first; i < last; ++i) {
                int offset = i - first;
                int top = matrix[first][i]; // save top
                // left -> top
                matrix[first][i] = matrix[last - offset][first];

                // bottom -> left
                matrix[last - offset][first] = matrix[last][last - offset];

                // right -> bottom
                matrix[last][last - offset] = matrix[i][last];

                // top -> right
                matrix[i][last] = top; // right <- saved top
            }
        }
        return matrix;
    }


}
