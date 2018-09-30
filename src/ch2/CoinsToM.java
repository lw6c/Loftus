package ch2;

/* Write an application that prompts for and reads a double value
   representing a monetary amount.  Then determine the fewest number
   of each bill and coin needed to represent that amount, starting with
   the highest (assume that a ten dollar bill is the maximum needed).
   For example,if the value entered is 47.63 (forty seven dollars and 63 cents),
   then the program should print the equivalent amount as:
   4 ten dollar bills
   1 five dollar bills
   2 one dollar bills
   2 quarters
   1 dime
   0 nickles
   3 pennies */
//Project 2.11

import java.util.*;

public class CoinsToM {
    public static void main (String[] args) {
        double total, one, five, ten, penny, nickel, dime, quarter;
        Scanner scan = new Scanner(System.in);
        System.out.print("Total money:");
        total = scan.nextDouble();
        ten = total / 10;
        total = total % 10;
        five = total / 5;
        total = total % 5;
        one = total / 1;
        total = total % 1;
        quarter = total / .25;
        total = total % .25;
        dime = total / .10;
        total = total % .10;
        nickel = total / .05;
        total = total % .05;
        penny = total / .01;
        total = total % .01;
        System.out.println((int) ten + " ten dollar bills");
        System.out.println((int) five + " five dollar bils");
        System.out.println((int) one + " one dollar bills");
        System.out.println((int) quarter + " quarters");
        System.out.println((int) dime + " dimes ");
        System.out.println((int) nickel + " nickels");
        System.out.println((int) penny + " pennies");
    }
}
