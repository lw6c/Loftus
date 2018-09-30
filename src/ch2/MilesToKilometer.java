package ch2;

/* Write a program that converts miles to kilometers.  (One mile equals
 * 1.60935 kilometers.)  Read the milesvalue from the user as a floating
 * point value */
//Project 2.6

import java.util.*;

public class MilesToKilometer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter distance in miles:");
        double miles = scan.nextDouble();
        System.out.println(miles + " miles= " + miles * 1.60935 + " km");
    }
}