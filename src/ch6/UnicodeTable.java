package ch6;

/* Write a program that prints a table showing a subset of the 
   Unicode characters and their numeric values.  Print five 
   number/character pairs per line, separated by tab characters.  
   Print the table for numeric values from 32 (the space character) 
   to 126 (the ~ character), which corresponds to the printable ASCII 
   subset of the Unicode character set.  Compare your output to the 
   table in Appendix C.  Unlike the table in Appendix C, the values 
   in your table can increase as they go across a row. */
//Project 6.8

public class UnicodeTable {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < 5; i++)
            System.out.print("Value Char |");
        System.out.println();
        for (int i = 0; i < 5; i++)
            System.out.print("-----------+");
        System.out.println();
        for (int j = 0; j <= 18; j++) { //same formatting as Appendix C
            for (int i = 32 + j; i <= 126; i += 19) {
                System.out.print(space(i) + "    " + (char) i + "   |");
                count++;
                if (count == 5) {
                    System.out.println();
                    count = 0;
                }
            }
        }
    }

    public static String space(int inp) {
        String spc;
        if (inp < 100) spc = " ";
        else spc = "";
        return spc + inp;
    }
}

