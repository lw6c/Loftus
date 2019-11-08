package ch3;

/* Write a program that reads a floating point value(double) and prints the
 * closest whole number less than and greater than that value.  For example,
 * if the number is 28.466, the program would print 28 and 29.
 */
//Project 3.4

import java.util.*;

public class Round {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double inp;
        System.out.println("Input a float value:>");
        inp = scan.nextDouble();
        System.out.println("Smallest close int val: " + (int) Math.floor(inp));
        System.out.println("Greatest close int val: " + (int) Math.ceil(inp));
    }
}
