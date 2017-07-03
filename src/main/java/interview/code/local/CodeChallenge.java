package interview.code.local;

/**
 * Created by vibinramakrishnan on 6/28/17.
 * given 3*3 grid , and for a given position has same value of the left, right , top or bottom then make all of them 0
 */
public class CodeChallenge {


    public static void main(String[] args) {

        int twoDm[][] = new int[3][3];
        int i, j, k = 1;

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                twoDm[i][j] = k;
                k++;
            }
        }

        twoDm[0][0] = 5;
        twoDm[1][0] = 5;
        twoDm[2][1] = 5;
        twoDm[0][1] = 5;

        for (int[] row : twoDm) {
            printRow(row);
        }
        traverse(twoDm, 1, 1);
    }

    public static void printRow(int[] row) {
        for (int i : row) {
            System.out.print(i);
            System.out.print("\t");
        }
        System.out.println();
    }


    public static void traverse(int[][] twod, int r, int c) {

        int val = twod[r][c];
        int upperlimit = 2;
        int lowerlimt = 0;


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                if (val == twod[i][j] && (i == r && j == c)) {

                    //System.out.println(" i ->" + i + "j ->" + j);

                    if (j != lowerlimt) {
                        // move left

                        if (val == twod[i][j - 1])
                            twod[i][j - 1] = 0;
                    }

                    if (j != upperlimit) {
                        // move right
                        if (val == twod[i][j + 1])
                            twod[i][j + 1] = 0;
                    }

                    if (i != lowerlimt) {
                        // move up
                        if (val == twod[i + 1][j])
                            twod[i - 1][j] = 0;
                    }

                    if (i != upperlimit) {
                        // move down
                        if (val == twod[i + 1][j])
                            twod[i + 1][j] = 0;
                    }
                    twod[i][j] = 0;
                    break;
                }
            }
        }

        for (int[] row : twod) {
            printRow(row);
        }
    }


}


