package ch5;

import java.util.*;

public class LeapYearLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int year = 1;
        while (year > 0) {
            System.out.println("Enter 0 to quit the program.");
            System.out.print("Enter a year: ");
            year = scan.nextInt();
            if (year > 0)
                if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0) && year > 1582)
                    System.out.println("This is a leap year.\n");
                else System.out.println("This is not a leap year.\n");
        }
        System.out.println("Program terminated.");
    }
}
