package interview.code.local.arraysandstrings;

/**
 * Created by vibinramakrishnan on 7/14/17.
 * bubble sort
 */
public class Practice1 {

    public static void main(String[] args) {
        int[] arr = new int[] { 6, 8, 7, 4, 312, 78, 54, 9, 12, 100, 89, 74 };
        int tmp =0;

        for (int i =0; i<arr.length;i++){

            for (int j =i+1; j<arr.length;j++){

                if(arr[i] > arr[j]) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] =tmp;
                }
            }
        }

        for (int n : arr) {
            System.out.println(n);
        }


    }
}
