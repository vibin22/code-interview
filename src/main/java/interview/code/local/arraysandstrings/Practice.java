package interview.code.local.arraysandstrings;

/**
 * Created by vibinramakrishnan on 7/13/17.
 */
public class Practice {

    public static void main(String[] args) {


        String pali = "abcdefgz";

        for (char c : pali.toCharArray()) {
            System.out.println(getCharNum(c));
        }


        //  #1 System.out.println(isPermutationOfPalindrome(pali));

        System.out.println(isTwoStringsAreIdentical("vibin", "vibin"));
    }

    public static boolean isPermutationOfPalindrome(String str) {

        int[] table = new int[26];
        int countOdd = 0;
        int charNum = 0;

        for (char c : str.toCharArray()) {

            charNum = getCharNum(c);
            if (charNum != -1) {

                table[charNum]++;
                if (table[charNum] % 2 == 1) {
                    countOdd++;
                } else {
                    countOdd--;
                }

            }
        }

        return countOdd <= 1;

    }

    public static int getCharNum(char c) {

        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');
        int value = Character.getNumericValue('c');

        if (a <= value && value <= z) {
            return Character.getNumericValue(c) - a;
        }

        return -1;
    }

    public static boolean isTwoStringsAreIdentical(String a, String b) {
        {

            int[] alphebet = new int[128];

            for (char c : a.toCharArray()) {
                alphebet[c]++;
            }

            for (char c : b.toCharArray()) {
                alphebet[c]--;
                if (alphebet[c] < 0) {
                    return false;
                }
            }

        }
return true;
    }
}
