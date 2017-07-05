package interview.code.local.hackerrank;

import java.util.Scanner;

/**
 * Created by vibinramakrishnan on 7/3/17.
 */
public class SampleTest {
    public static void main(String[] args) {
        int[] arr = {1000,2,53,41,100};
        // System.out.println(findNumber(arr, 8));

        int[] arry1 = oddNumbers(3, 9);

        for (int i = 0; i < arry1.length; i++) {
            System.out.println(arry1[i]);
        }

        minmaxarry(arr);

    }

    /**
     * Find the number exist in the given array.
     */
    static boolean findNumber(int[] arr, int k) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == k) return true;
        }
        return false;
    }


    /**
     * Find all odd numbers for a given range;
     */
    static int[] oddNumbers(int l, int r) {


        int length = 0;
        int m = l;
        int s = r;

        // find length of the resultant array;
        while (m <= s) {
            //  System.out.println(l%2);
            if (m % 2 > 0) {
                length++;
            }
            m++;
        }

        // initialize the array.
        int[] result = new int[length];
        int j = 0;

        while (l <= r) {
            //  System.out.println(l%2);
            if (l % 2 > 0) {
                result[j] = l;
                j++;
            }
            l++;
        }
        return result;

    }

    static void tower() {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();

        for(int i=0;i<h;i++){
            for(int j=0;j<h-i-1;j++){
                System.out.print(" ");
            }
            for(int k=0;k<i+1;k++){
                System.out.print("#");
            }
            System.out.println();
        }
    }

   static void  minmaxarry(int[] ary) {


        long [] result = new long[5];
        for (int k = 0; k<ary.length; k++) {

        for(int i =0; i < ary.length ; i++) {

            if (k != i) {
                result[k] = result[k] + ary[i];
            }

        }
        }

      long  minresult = result[0];
      long  maxresult = result[0];

       for(int i =0; i < result.length ; i++){

           System.out.println(result[i]);
           if (minresult > result[i]) {
               minresult = result[i];
           }

           if (maxresult < result[i]) {
               maxresult = result[i];

           }


       }
       //System.out.println("maxresult"+maxresult);
       System.out.println(minresult+"  "+maxresult);

    }
}
