package interview.code.local.hackerrank;

import java.util.Scanner;

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


      //  System.out.println(addDignalElements(twoDm));

     //   sampletest();

        System.out.println( addDignalElements(twoDm) );

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

    static void sampletest() {

        Scanner in = new Scanner(System.in);

        int length = in.nextInt();
        int[] ary = new int[length];

        for (int i=0;i<length;i++) {
            ary[i]  = in.nextInt();
        }

        int positive = 0;
        int negative = 0;
        int zeros = 0;

        for (int j =0;j<length;j++) {

            if (ary[j] < 0) {
                negative = negative+1;
            } else if (ary[j] > 0) {
                positive = positive+1;

            } else {
                zeros = zeros+1;
            }



        }
double a = 0.0;
        double b  = (double)negative/length;
        double c = (double)zeros/length;
       a = (double)positive/length;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

       // System.out.println(length);


    }
}
