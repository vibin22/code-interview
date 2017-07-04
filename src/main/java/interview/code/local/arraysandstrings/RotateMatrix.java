package interview.code.local.arraysandstrings;

/**
 * Created by vibinramakrishnan on 7/3/17.
 */
public class RotateMatrix {
    public static int[][] rotate(int[][] matrix) {
    if (matrix.length == 0 || matrix.length != matrix[0].length) return null; // Not a square
    int n = matrix.length;

		for (int layer = 0; layer < n / 2; layer++) {
        int first = layer;
        int last = n - 1 - layer;
        for(int i = first; i < last; i++) {
            int offset = i - first;
            int top = matrix[first][i]; // save top

            // left -> top
            matrix[first][i] = matrix[last-offset][first];

            // bottom -> left
            matrix[last-offset][first] = matrix[last][last - offset];

            // right -> bottom
            matrix[last][last - offset] = matrix[i][last];

            // top -> right
            matrix[i][last] = top; // right <- saved top
        }
    }
		return matrix;
}

    public static void main(String[] args) {
        int[][] matrix = Util.creteMatrix(3,4);
       Util.printMatrix(matrix);
        Util.printMatrix(rotate(matrix));

    }


}
