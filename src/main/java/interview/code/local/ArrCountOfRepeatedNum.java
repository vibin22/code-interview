package interview.code.local;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

/**
 * Created by vibinramakrishnan on 7/7/17.
 * Arrange numbers based on its count present in an array, in a specific format.
 */
public class ArrCountOfRepeatedNum {

    public static void main(String[] args) {

        int[] intAry = new int[10];
        for (int i = 0; i < 5; i++) {
            intAry[i] = i;
            // System.out.println(intAry[i]);
        }

        intAry[5] = 2;
        intAry[6] = 3;
        intAry[7] = 3;
        intAry[8] = 4;
        intAry[9] = 4;
        //intAry[10] = 4;

        int[] intary1 = new int[14];

       String s =  sortByrank(intAry);
    // sortByrank(intAry);

         System.out.println(s);
        
    }


    static String  sortByrank(int[] arr) {
        StringBuilder sb = new StringBuilder();
       // int tmp = 0;
       // boolean present = false;
      //  HashSet temp = new HashSet<Integer>();
        Hashtable table = new Hashtable<Integer, Integer>();

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    count++;
                table.put(arr[i], count);
            }
        }

        String [] strArr = new String[table.size()];
        Set<Integer> keys = table.keySet();
        int k =0;
        for (Integer key : keys) {
            strArr[k] = key+""+table.get(key);
            k++;
        }

        Arrays.sort(strArr);

        for (String s: strArr){
            sb.append(s+" ");
        }

        return sb.toString();
    }


}
