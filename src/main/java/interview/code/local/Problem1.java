package interview.code.local;

/**
 * Created by vibinramakrishnan on 7/9/17.
 */
public class Problem1 {


    public static void main(String[] args) {
        int[] intAry = new int[6];


        intAry[0] = 500;
        intAry[1] = 6;
        intAry[2] = 8;
        intAry[3] = 8;
        intAry[4] = 5;
        intAry[5] = 5;

        System.out.println(countMoves(intAry));
    }



    static long countMoves(int[] numbers) {
        if (numbers.length == 0) {
            return 0;
        }
        int min = numbers[0];

        for (int n : numbers) {
            min = Math.min(min, n);
        }

        System.out.println("Print min"+min);

        long res = 0L;

        for (int n : numbers) {


            res += n - min;

            System.out.println("res += n - min:       "+"n="+n+"min="+min+ "RES ->"      +res);

        }
        return res;
    }


}
