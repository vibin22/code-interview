package interview.code.local;

/**
 * Created by vibinramakrishnan on 7/5/17.
 */
public class Problem0 {

    public static void main(String[] args) {


        int[] intAry = new int[10];
        for (int i=0;i<intAry.length;i++){
            intAry[i] =i;
            System.out.println(intAry[i]);
        }

        socialGraphs(intAry);
    }


    static void socialGraphs(int[] counts) {

        // find maxx value
        int temp = counts[0];
        int k=0;
        for (int i=0;i<counts.length;i++) {
            if(temp <= counts[i]) {
                temp = counts[i];
            }
            k++;
        }

        System.out.println(temp);

    }

}
