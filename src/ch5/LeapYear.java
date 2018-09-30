package ch5;

/*
 * Design and implement an application that reads an integer value from the user
 * representing a year. The purpose of the program is to determine if the year
 * is a leap year (and therefore has 29 days in February) in the Gregorian
 * calendar. A year is a leap year if it is divisible by 4, unless it is also
 * divisible by 100 but not 400. For example, the year 2003 is not a leap year,
 * but 2004 is. The year 1900 is not a leap year because it is divisible by 100,
 * but the year 2000 is a leap year because even though it is divisible by 100,
 * it is also divisible by 400. Produce an error message for any input value
 * less than 1582 (the year the Gregorian calendar was adopted). Modify the
 * solution to the previous project so that the user can evaluate multiple
 * years. Allow the user to terminate the program using an appropriate sentinel
 * value. Validate each input value to ensure it is greater than or equal to
 * 1582.
 */
// Project 5.1

import java.util.*;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scan.nextInt();
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0) && year >= 1582) {
            System.out.println("This is a leap year.");
        } else {
            System.out.println("This is not a leap year.");
        }
    }
}
