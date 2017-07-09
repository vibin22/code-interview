package interview.code.local.arraysandstrings;

/**
 * Created by vibinramakrishnan on 7/9/17.
 * Validate if a numer is palindrom
 */
public class StrictPalindrome {

    public static void main(String[] args) {


        String str = "malayalam";
        char[] arr = str.toCharArray();
        java.util.Stack<String> stack = new java.util.Stack();

        for (int i = 0; i < arr.length; i++) {

            stack.push(Character.toString(arr[i]));
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {

            sb.append(stack.pop());
        }

        System.out.println(sb.toString());
        if (str.equals(sb.toString())) {
            System.out.println("TRUE");

        } else {
            System.out.println("FALSE");
        }


    }
}
