package interview.code.local;

/**
 * Created by vibinramakrishnan on 6/28/17.
 */
public class StringsAndArrays {


    public static void main(String[] args) {

        System.out.println("Crack Code Interview");


        // check if two string has all unique character
        System.out.println("isUniqueChars(\"abcdef\") ->" + isUniqueChars("abcdefgzABCDEFGZ"));


        // check if two string permutation are equal
        System.out.println("permutation(vibin, vbini) ->" + permutation("vibin", "vbini"));
        System.out.println(permutation2("abcd","abcd"));


        // REVERSE
        System.out.println("   reverse 1  -->" + reverse("vibin"));


        String reverse = new StringBuffer("vibin").reverse().toString();
        System.out.println(" reverse  2  -->" + reverse);


        char[] ch = {'t', 'h', 'e', ' ', 'd', 'o', 'g', ' ', 'm', ' ', ' ', ' ', ' '};


        System.out.println("Replace " + replaceSpaces(ch, 9));


        System.out.println(isPermutationOfPalindrome("tacocaT"));

        System.out.println("one away - >" + oneEditAway("vibin", "vibin"));

        System.out.println("COMPRESS" + compress("vibin"));

        char[] ch1 = {'a', 'a', 'b', 'b', 'd', 'o', 'g'};

        System.out.println("removeDuplicates -> " + removeDuplicates(ch1));

        System.out.println("ANAGRAM" + anagram("Vibin", "nIbiv"));
        //, s2 = pleap
        System.out.println("is ROTATION" + isRotation("apple", "pleap"));
    }


    // 1 check if two string has all unique characters
    //***************************************************************************//
    public static boolean isUniqueChars(String str) {

        // Assume the character set is ASCII, i28 for regular , 256 for extended. control characters
        boolean[] char_set = new boolean[128];

        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);

            // if found true , return false , means character already found.
            if (char_set[val]) return false;

            // insert true for every position in the array represent a character.
            char_set[val] = true;
        }
        return true;
    }

// 2 check if two string are equal
//************************************************************************************//

    public static String sort(String s) {
        char[] content = s.toCharArray();

        java.util.Arrays.sort(content);
        return new String(content);
    }

    public static String CaseInsensitiveSort(String s) {
        char[] content = s.toLowerCase().toCharArray();
        java.util.Arrays.sort(content);
        return new String(content);
    }

    /**
     * IS PERMUTATION OF STRING EQUAL
     *
     * @param s
     * @param t
     * @return
     */
    public static boolean permutation(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        return sort(s).equals(sort(t));
    }

    // second solution
    public static boolean permutation2(String s, String t){

        if (s.length()!=t.length()){
            return false;
        }

        int[] letters = new int[128];
        char[] s_array = s.toCharArray();
        for (Character c: s_array ){
            // add 1 to each character position
            letters[c]++;
        }

        int c;
        for (int i=0; i<t.length();i++){
            c = t.charAt(i);
            letters[c]--;
            System.out.println(letters[c]);
            // minus 1 from each character position
            if (letters[c] < 0) {
                return false;
            }
        }

        return true;
    }


    // reverse a string
    //***********************************************************************************

    /**
     * REVERSE A STRING
     *
     * @param source
     * @return
     */
    public static String reverse(String source) {
        if (source == null || source.isEmpty()) {
            return source;
        }
        String reverse = "";
        for (int i = source.length() - 1; i >= 0; i--) {
            reverse = reverse + source.charAt(i);
        }

        return reverse;
    }


    // replace space with %20
//*****************************************************************************************************

    /**
     * REPLACE SPACE WITH %20.
     *
     * @param str
     * @param trueLength
     * @return
     */
    public static String replaceSpaces(char[] str, int trueLength) {
        int spaceCount = 0, index, i = 0;

        for (i = 0; i < trueLength; i++) {
            if (str[i] == ' ') {
                spaceCount++;
            }
        }

        index = trueLength + (spaceCount * 2);

        System.out.println("index - >"+index);
        if (trueLength < str.length) str[trueLength] = '\0';

        for (i = trueLength - 1; i >= 0; i--) {
            if (str[i] == ' ') {
                str[index - 1] = '0';
                str[index - 2] = '2';
                str[index - 3] = '%';
                index = index - 3;
            } else {
                str[index - 1] = str[i];
                index--;
            }
        }

        return String.valueOf(str);
    }


    /// is permutation palindrome

    //******************************************************************************************************

    /**
     * IS PERMUTATION A PALINDROME
     * to be a permutation ot a palindrome, a string
     * can have no more than one character that is odd. This will cover both the odd and the even cases
     *
     * @param phrase
     * @return
     */
    public static boolean isPermutationOfPalindrome(String phrase) {
        int countOdd = 0;
        // 26 letters
        int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
        for (char c : phrase.toCharArray()) {
            int x = getCharNumber(c);
            System.out.println("result  " + x);
            if (x != -1) {
                // table contains 0 in all. add one per each occurance of the letter
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
        System.out.println(c);

        System.out.println("val - a"+ val +" - " + a);

        if (a <= val && val <= z) {
            return val - a;
        }
        return -1;
    }

//**************************************************************************************************************

    /**
     * IS TWO STRINGS ARE  ONE AWAY pale, ple - pales, pale - pale, bale
     *
     * @param first
     * @param second
     * @return
     */
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
//*************************************************************************************************************************

    /**
     * String Compression- the string aabcccccaaa would become a2blc5a3
     *
     * @param str
     * @return
     */
    public static String compress(String str) {
        StringBuilder compressed = new StringBuilder();
        int countConsecutive = 0;
        for (int i = 0; i < str.length(); i++) {
            countConsecutive++;

            /* If next character is different than current, append this char to result.*/
            if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
                compressed.append(str.charAt(i));
                compressed.append(countConsecutive);
                countConsecutive = 0;
            }
        }
        return compressed.length() < str.length() ? compressed.toString() : str;
    }

    //**************************************************************************************************************************

    /**
     * REMOVE DUPLICATES
     *
     * @param str
     */
    public static String removeDuplicatesLess(char[] str) {

        if (str == null) return null;

        int len = str.length;
        if (len < 2) return null;
        boolean[] hit = new boolean[256];
        for (int i = 0; i < 256; ++i) {
            hit[i] = false;
        }
        hit[str[0]] = true;
        int tail = 1;
        for (int i = 1; i < len; ++i) {
            if (!hit[str[i]]) {
                str[tail] = str[i];
                ++tail;
                hit[str[i]] = true;
            }
        }
        str[tail] = 0;
        return String.valueOf(str);
    }

    public static String removeDuplicates(char[] str) {

        // return if null;
        if (str == null) return null;
        int len = str.length;
        if (len < 2) return null;

        int tail = 1;

        for (int i = 1; i < len; ++i) {
            int j;
            for (j = 0; j < tail; ++j) {
                if (str[i] == str[j]) break;
            }
            if (j == tail) {
                str[tail] = str[i];
                ++tail;
            }
        }
        str[tail] = 0;
        return String.valueOf(str);
    }


//**********************************************************************************************************************

    /**
     * ANAGRAM
     *
     * @param s
     * @param t
     * @return
     */
    public static boolean anagram(String s, String t) {


        return CaseInsensitiveSort(s).equals(CaseInsensitiveSort(t));
    }

    /**
     * IS ROTATION
     *
     * @param s1
     * @param s2
     * @return
     */
    public static boolean isRotation(String s1, String s2) {
        int len = s1.length();
         /* check that s1 and s2 are equal length and not empty */
        if (len == s2.length() && len > 0) {
             /* concatenate s1 and s1 within new buffer */
            String s1s1 = s1 + s1;


            return s1s1.contains(s2);
        }
        return false;
    }

}

