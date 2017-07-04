package interview.code.local.arraysandstrings;

/**
 * Created by vibinramakrishnan on 7/2/17.
 * Palindrome Permutation: Given a string, write a function to check if it is a permutation of a palindrome.
 * A palindrome is a word or phrase that is the same forwards and backwards. A permutation
 * is a rearrangement of letters. The palindrome does not need to be limited to just dictionary words
 */
public class Palindrome {


    public static boolean isPermutationOfPalindrome(String phrase) {
        int countOdd = 0;
        // 26 letters
        int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
        for (char c : phrase.toCharArray()) {
            int x = getCharNumber(c);
            if (x != -1) {
                // table contains 0 in all. add one per each occurrence of the letter
                table[x]++;

                // determine the count of letters are odd or even
                if (table[x] % 2 == 1) {
                    countOdd++;
                } else {
                    countOdd--;
                }
            }
        }
        // return boolean , based on only one odd letter exist not more than one , or non baab
        return countOdd <= 1;
    }

    /* Map each character to a number. a -> 0, b -> 1, c -> 2, etc.
     * This is case insensitive. Non-letter characters map to -1. */

    public static int getCharNumber(Character c) {
        int a = Character.getNumericValue('a');
        // System.out.println( "numeric a -> "+a);
        int z = Character.getNumericValue('z');
        //System.out.println( "numeric z -> "+z);
        int val = Character.getNumericValue(c);

        if (a <= val && val <= z) {
            return val - a;
        }
        return -1;
    }

    public static void main(String[] args) {
        String pali = "malayaaml";
        System.out.println(isPermutationOfPalindrome(pali));
    }
}
