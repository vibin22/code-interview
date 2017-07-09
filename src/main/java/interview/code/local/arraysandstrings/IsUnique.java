package interview.code.local.arraysandstrings;

/**
 * Created by vibinramakrishnan on 7/2/17.
 * Implement an algorithm to determine if a string has all unique characters. What if you
 *  cannot use additional data structures?
 */
public class IsUnique {

    public static boolean isUniqueChars(String str) {

        // ASCII has 128 unique characters, if more than 128 means , it is not unique.
        if (str.length() > 128) {
            return false;
        }
        boolean[] char_present = new boolean[128];
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if (char_present[val]) return false;
            char_present[val] = true;
        }
        return true;
    }

    /* Solution 2. Assumes only letters a through z. Using Bit Vector */
    public static boolean isUniqueChars2(String str) {
        if (str.length() > 26) { // Only 26 characters
            return false;
        }
        int checker = 0;
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i) - 'a';
            if ((checker & (1 << val)) > 0) return false;
            checker |= (1 << val);
        }
        return true;
    }
    public static void main(String[] args) {
        String[] words = {"abcde", "hello", "apple", "kite", "padle"};
        for (String word : words) {
            System.out.println(word + ": " + isUniqueChars(word));
        }
    }
}
