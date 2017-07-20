package interview.code.local.arraysandstrings;

/**
 * Created by vibinramakrishnan on 7/15/17.
 */
public class TicTacTow {

    public static void main(String[] args) {


        int twoDm[][] = new int[3][3];
        int i, j, k = 1;

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                twoDm[i][j] = 1;
                k++;
            }
        }

        twoDm[0][0] = 0;
        twoDm[0][1] = 0;
        twoDm[0][2] = 0;

        twoDm[1][0] = 0;
        twoDm[1][1] = 0;
        twoDm[1][2] = 0;

        twoDm[2][0] = 1;
        twoDm[2][0] = 1;
        twoDm[2][2] = 1;








        printGrid(twoDm);

        System.out.println(validateResult(twoDm, 2,2, 0));

    }

   public static boolean validateResult(int [][] twoDm, int r, int c, int value){

       //i=0  move down
       if (r==0) {
           if (twoDm[r][c] == value && twoDm[r + 1][c] == value && twoDm[r + 2][c] == value) {
               System.out.println("i=0  move down");
               return true;
           }
       }
       //i=2  move up
       if (r==2) {
           if (twoDm[r][c] == value && twoDm[r - 1][c] == value && twoDm[r - 2][c] == value) {
               System.out.println("i=2  move up");
               return true;
           }
       }

       //j=0 move right
        if (c==0) {
            if (twoDm[r][c + 1] == value && twoDm[r][c + 2] == value) {
                System.out.println("j=0 move right");
                return true;
            }
        }

       //j=2 move left
       if (c==2) {
           if (twoDm[r][c - 1] == value && twoDm[r][c - 2] == value) {
               System.out.println("j=2 move left");
               return true;
           }
       }

       if (r==c){
           // check prime diagonal
           if (twoDm[1][1] == value && twoDm[0][0] == value && twoDm[2][2] == value) {
               System.out.println("check prime diagonal");
               return true;
           }

           // check second diagonal
           if (twoDm[2][0] == value && twoDm[1][1] == value && twoDm[0][2] == value) {
               System.out.println("check second diagonal");
               return true;
           }
       }
       // check second diagonal
        return false;
    }


    public static void printGrid(int[][] grid) {

        for (int[] row : grid) {
            for (int i : row) {
                System.out.print(i);
                System.out.print("\t");
            }
            System.out.println();
        }
    }

}
