package interview.code.local.arraysandstrings;

import java.util.Scanner;

/**
 * Created by vibinramakrishnan on 7/9/17.
 */
public class BirthdayCakeProblem {

    static int birthdayCakeCandles(int n, int[] ar) {
        // Complete this function
        int max = ar[0];
        int count = 0;
        for(int i = 0; i < n; i++) {

            if(ar[i] > max) {
                max = ar[i];
                count = 0;
            }
            if(ar[i] == max) {
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }

}
