package ch3;

/* Write a program that prints the sum of cubes.  Prompt for and read two 
   integer values and print the sum of each value raised to the third  power */
//Program 3.2

import java.util.*;

public class Power {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer value:");
        int inp1 = scan.nextInt();
        System.out.println("Enter another integer value:");
        int inp2 = scan.nextInt();
        System.out.println("Have some useless data: " + (int) Math.pow((inp1 + inp2), 3));
    }
}