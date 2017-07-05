package interview.code.local;

/**
 * Created by vibinramakrishnan on 7/5/17.
 */
public class PrimeNumbers {

    public static void main(String[] args) {
        prime();
    }

    static void prime() {
        int i =0;
        int num =0;
        //Empty String
        String  primeNumbers = "";
        for (i = 1; i <= 100; i++)
        {
            int counter=0;
            for(num =i; num>=1; num--)
            {
                if(i%num==0)
                {
                    counter = counter + 1;
                }
            }
            if (counter == 2)
            {
                //Appended the Prime number to the String
                primeNumbers = primeNumbers + i + " ";
            }
        }
        System.out.println(primeNumbers);
    }
}
