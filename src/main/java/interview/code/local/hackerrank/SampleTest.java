package interview.code.local.hackerrank;

/**
 * Created by vibinramakrishnan on 7/3/17.
 */
public class SampleTest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        // System.out.println(findNumber(arr, 8));

        int[] arry1 = oddNumbers(3, 9);

        for (int i = 0; i < arry1.length; i++) {
            System.out.println(arry1[i]);
        }

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
}
