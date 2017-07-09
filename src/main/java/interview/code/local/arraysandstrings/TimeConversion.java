package interview.code.local.arraysandstrings;

import java.util.Scanner;

/**
 * Created by vibinramakrishnan on 7/9/17.
 */
public class TimeConversion {

    static String timeConversion(String s) {

        String sub="";
        int num = Integer.parseInt(s.substring(0,2));
       // System.out.println(num);
       // System.out.println(s.substring(2,8));
        if(s.charAt(8)=='P'){
            num = num + 12;
            sub = ((num==24)?"12":num) + s.substring(2,8);
        }
        else{
            if(num==12)
                sub = "00" + s.substring(2,8);
            else
                sub = s.substring(0,8);
        }
        return sub;
    }


    public static void main(String[] args) {
       // Scanner in = new Scanner(System.in);
       // String s = in.next();
        String result = timeConversion("07:05:55PM");
        System.out.println(result);
    }
}
