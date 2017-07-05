package interview.code.local.stacksandqueue;

/**
 * Created by vibinramakrishnan on 7/5/17.
 */
public class PrintOddNumbers {

    public static void main(String[] args) {

        int[] ary = oddNumbers(2, 9);

        for (int i = 0; i < ary.length; i++) {

            System.out.println(ary[i]);
        }

    }
    static int[] oddNumbers(int l, int r) {

        int k =0;
        for (int i =l;i<=r;i++) {


            if(i%2!=0) {
                k++;

            }

        }

        //System.out.println(k);
        int [] result=new int[k];
        k=0;

        for (int i = l;i<=r;i++) {

            if(i%2!=0) {
                result[k] = i;
                k++;
            }

        }


        return result;
    }
}
