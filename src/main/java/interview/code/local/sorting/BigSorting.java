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
            Arrays.sort(a);
            for(int i=0;i<a.length;i++)
            {
                str[i]=String.valueOf(a[i]);
                System.out.println(( a[i]));
            }

    }

}
