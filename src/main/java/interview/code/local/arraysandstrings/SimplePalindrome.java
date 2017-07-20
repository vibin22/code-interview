package interview.code.local.arraysandstrings;

/**
 * Created by vibinramakrishnan on 7/20/17.
 */
public class SimplePalindrome {

    public static void main(String[] args) {


        System.out.println(palindrome("malayalam"));
    }

    public static boolean palindrome(String s){

        char[] charArr = s.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (int i = charArr.length-1;i>=0;i--){
            sb.append(charArr[i]);
        }

        System.out.println(sb.toString());
        return s.equals(sb.toString());
    }
}
