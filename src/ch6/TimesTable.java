package ch6;

/* Write a program that produces a multiplication table, showing the 
results of multiplying the integers 1 through 12 by themselves. */
//Project 6.3

public class TimesTable {
    public static void main(String[] args) {
        final int MAX = 12;
        System.out.print("    ");
        for (int i = 1; i <= MAX; i++)
            System.out.print(space(i) + " ");
        System.out.println();
        System.out.print("   ");
        for (int i = 1; i <= MAX; i++) System.out.print("----");
        System.out.println();
        for (int i = 1; i <= MAX; i++) {
            System.out.print(space(i) + "|");
            for (int j = 1; j <= MAX; j++) System.out.print(space(i * j) + " ");
            System.out.println();
        }
    }

    public static String space(int inp) {
        String spc;
        if (inp < 10) spc = "  ";
        else if (inp < 100) spc = " ";
        else spc = "";
        return spc + inp;
    }
}