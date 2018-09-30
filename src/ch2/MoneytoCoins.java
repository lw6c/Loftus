package ch2;

/* Write a program that determines the value of the coins in a
 * jar and prints the total in dollars and cents.  Read integer
 * values that represent the number of quarters, dimes, nickels,
 * and pennies. */
//Project 2.10

import java.util.*;

public class MoneytoCoins {
    public static void Count(String[] args) {
        Integer coin;
        Scanner scan = new Scanner(System.in);
        System.out.println("Pennies:");
        coin = scan.nextInt();
        System.out.println("Nickels:");
        coin += (scan.nextInt() * 5);
        System.out.println("Dimes:");
        coin += (scan.nextInt() * 10);
        System.out.println("Quarters:");
        coin += (scan.nextInt() * 25);
        System.out.println("Thats: " + "$" + (coin / 100) + "." + (coin % 100));
    }
}
