package interview.code.local.arraysandstrings;

/**
 * Created by vibinramakrishnan on 7/18/17.
 */
public class Practice2 {

    public static void main(String[] args) {

    }

    public static boolean isAnagram(final String s, final String t) {

        int total_count=0;
        int unique_count=0;
        int[] charSet = new int[128];

        for (char c : s.toCharArray()) {
            if(charSet[c] == 0)  { unique_count++; }
            ++charSet[c];
        }

        int c =0;
        for (int i=0;i<t.length();i++) {
            c = (int) t.charAt(i);
            if(charSet[c] == 0) {
                return false; // means more characters found in the second string
            }
           -- charSet[c];
           ++ total_count;

           if (total_count == unique_count) {
               return i == t.length() -1;
           }


        }



        return false;
    }
}
