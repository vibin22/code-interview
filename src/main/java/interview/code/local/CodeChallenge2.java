package interview.code.local;

/**
 * Created by vibinramakrishnan on 6/29/17.
 */
public class CodeChallenge2 {

    public static void main(String[] args) {

        char[] charSequence = {'P', 'P', 'D', 'D', 'N', 'N', 'P', 'D', 'D', 'P', 'N', 'N'};

        System.out.println(validate(charSequence));
    }

    public static boolean validate(char[] seq) {

        boolean[] spots = new boolean[12];
        char element;
        int current_position = 0;

        for (int i = 0; i < 11; i++) {
            element = seq[i];

            // validate p
            if (element == 'P') {
                System.out.println(current_position + 1);
                if (spots[(current_position + 1) % 12] == true) return false;
                current_position = (current_position + 1) % 12;
                spots[current_position] = true;
            }

            // 0 1 2 3 4 5 6 7 8 9
            if (element == 'N') {
                System.out.println(current_position + 5);
                if (spots[(current_position + 5) % 12] == true) return false;
                current_position = (current_position + 5) % 12;
                spots[current_position] = true;
            }

            if (element == 'D') {
                System.out.println(current_position + 10);
                if (spots[(current_position + 10) % 12] == true) return false;
                current_position = (current_position + 10) % 12;
                spots[current_position] = true;
            }
            System.out.println("current_position ->" + current_position);
        }
        return true;
    }
}
