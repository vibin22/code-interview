package interview.code.local.hackerrank;

import java.util.Scanner;

/**
 * Created by vibinramakrishnan on 7/3/17.
 */
public class AddMatrixDigonal {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int matrix[][] = new int[n][n];
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                matrix[a_i][a_j] = in.nextInt();
            }
        }



        int length = matrix.length;
        int primedigonal = 0;
        int secdigonal = 0;

// add prime diagonal
        for (int i=0;i<length;i++) {
            primedigonal= primedigonal+matrix[i][i];
        }

        //int r = matrix.length - 1;
        //int c = 0;
// add second diagonal
        for (int i=0;i<length;i++) {
            secdigonal= secdigonal+ matrix[length-i-1][i];
        }
        System.out.println(Math.abs(primedigonal + secdigonal));

    }
}
