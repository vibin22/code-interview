package interview.code.local.hackerrank;

/**
 * Created by vibinramakrishnan on 7/3/17.
 */
public class Algorithams {

    public static void main(String[] args) {



        int twoDm[][] = new int[3][3];
        int i, j, k = 1;

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                twoDm[i][j] = k;
                k++;
            }
        }


        System.out.println(addDignalElements(twoDm));

    }


    static int addDignalElements( int [][] matrix) {
        int length = matrix.length;
        int primedigonal = 0;
        int secdigonal = 0;


        for (int i=0;i<length;i++) {
            primedigonal= primedigonal+matrix[i][i];
        }

        int r = matrix.length - 1;
        int c = 0;

        for (int i=0;i<length;i++) {
            secdigonal= secdigonal+ matrix[length-i-1][i];
        }


return Math.abs(primedigonal + secdigonal);
    }
}
