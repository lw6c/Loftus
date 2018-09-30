package ch6;

/* Create a modified versions of the Stars program to print the 
   following patterns.  Create a separate program to produce 
   each patter.  Hint: Parts b, c, and d require several loops, 
   some of which print a specific number of spaces.
   
   a. **********  b.         *  c. **********  d.    *
       *********            **      *********       ***
        ********           ***       ********      *****
         *******          ****        *******     *******
          ******         *****         ******    *********
           *****        ******          *****    *********
            ****       *******           ****     *******
             ***      ********            ***      *****
              **     *********             **       ***
               *    **********              *        *
*/

public class Stars {
    public static void main(String[] args) {
        final int LENGTH = 10;
        int col, row;
        System.out.println("a.");
        for (row = LENGTH; row >= 1; row--) { //a
            for (col = 1; col <= row; col++) System.out.print("*");
            System.out.println();
        }
        System.out.println("\nb.");
        for (row = 1; row <= LENGTH; row++) { //b
            for (col = 1; col <= LENGTH - row; col++) System.out.print(" ");
            for (col = 1; col <= row; col++) System.out.print("*");
            System.out.println();
        }
        System.out.println("\nc.");
        for (row = 1; row <= LENGTH; row++) { //c
            for (int j = 1; j < row; j++) System.out.print(" ");
            for (int k = 1; k <= LENGTH - row + 1; k++) System.out.print("*");
            System.out.println();
        }
        int number = LENGTH / 2;
        int count = number - 1;
        System.out.println("\nd.");
        for (row = 1; row <= number; row++) { //d
            for (col = 1; col <= count; col++) System.out.print(" ");
            count--;
            for (col = 1; col <= 2 * row - 1; col++) System.out.print("*");
            System.out.println();
        }
        if (number % 2 == 0) count = 1;
        else count = 0;
        for (row = 1; row <= number + 1; row++) { //d
            for (col = 1; col <= count; col++) System.out.print(" ");
            count++;
            for (col = 1; col <= 2 * (number - row) + 1; col++) System.out.print("*");
            System.out.println();
        }
    }
}