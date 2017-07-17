package interview.code.local.hackerrank;

import java.util.Scanner;

/**
 * Created by vibinramakrishnan on 7/17/17.
 */
public class AngryProfessor {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int testcases = in.nextInt();
        int j=0;
        while(j<testcases) {
            int total = in.nextInt();
            int threshold = in.nextInt();
            int temp = threshold;
            int [] testcase = new int[total];

            for(int a=0; a < testcase.length; a++){
                testcase[a] = in.nextInt();
            }

            for (int i:testcase) {

                if (i>0){
                    temp--;
                }

            }
            System.out.println(temp);
            if (temp<total){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }


            j++;
        }
    }
}
