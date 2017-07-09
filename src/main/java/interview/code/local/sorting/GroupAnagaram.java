package interview.code.local.sorting;

import java.util.Arrays;

/**
 * Created by vibinramakrishnan on 7/8/17.
 */
public class GroupAnagaram {
    public static void main(String[] args) {
        String[] array = {"apple", "banana", "carrot", "ele", "duck", "papel", "tarroc", "cudk", "eel", "lee"};

        for(int i=0;i<array.length;i++)
        {
            System.out.println(( array[i]));
        }

        Arrays.sort(array, new AnagramComparator());
        System.out.println("*****************");
        for(int i=0;i<array.length;i++)
        {
            System.out.println(( array[i]));
        }
    }
}
