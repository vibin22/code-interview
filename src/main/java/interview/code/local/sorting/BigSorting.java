package interview.code.local.sorting;

import java.util.Arrays;

/**
 * Created by vibinramakrishnan on 7/4/17.
 */
public class BigSorting {


        public static void main(String[] args)
        {
            String[] str = {"3","31415926535897932384626433832795","4","10","11","6","5","8","9","7"};
            double[] a = new double[str.length];

            for(int i=0;i<a.length;i++)
            {
                a[i]=Double.parseDouble(str[i]);
            }
           // Arrays.sort(a);

           String[] b  =  bubbleSort(a,str);

            for(int i=0;i<b.length;i++)
            {
                str[i]=String.valueOf(b[i]);
                System.out.println(( b[i]));
            }

    }

    public static String[] bubbleSort(final double[] arr, String [] strAry) {

        if (arr == null || arr.length <= 1) {
            return strAry;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                double tmp = 0;
                String strTmp;
                if (arr[i] > arr[j]) {
                    tmp = arr[i];
                    strTmp= strAry[i];

                    arr[i] = arr[j];
                    strAry[i] = strAry[j];

                    arr[j] = tmp;
                    strAry[j] = strTmp;
                }
            }
        }
        return strAry;
    }

}
