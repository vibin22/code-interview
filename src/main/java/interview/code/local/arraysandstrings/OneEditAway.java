package interview.code.local.arraysandstrings;

/**
 * Created by vibinramakrishnan on 7/4/17.
 */
public class OneEditAway {
    public static void main(String[] args) {

        System.out.println("one away - >" + oneEditAway("vibin", "vibik"));
    }


    public static boolean oneEditAway(String first, String second) {
         /* Length checks. */
        if (Math.abs(first.length() - second.length()) > 1) {
            return false;
        }

         /* Get shorter and longer string.*/
        String sl = first.length() < second.length() ? first : second;
        String s2 = first.length() < second.length() ? second : first;

        int indexl = 0;
        int index2 = 0;
        boolean foundDifference = false;

        while (index2 < s2.length() && indexl < sl.length()) {
            if (sl.charAt(indexl) != s2.charAt(index2)) {

                 /* Ensure that this is the first difference found.*/
                if (foundDifference) return false;

                foundDifference = true;

                if (sl.length() == s2.length()) {//On replace, move shorter pointer
                    indexl++;
                }
            } else {
                indexl++; // If matching, move shorter pointer
            }
            index2++; // Always move pointer for longer string
        }
        return true;
    }
}
