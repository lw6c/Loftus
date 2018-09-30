package ch3;

/* Write a program that reads the radius of a sphere and prints
 * its volume and surface area.  Use the following formulas.  Print
 * the output to four decimal places.  r represents the radius.
 * Volume=(4/3)πr^3
   Surface Area=4πr² */
//Project 3.6

import java.util.*;

public class SphereFormula {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Radius:");
        Integer radius = scan.nextInt();
        System.out.println("Volume:" + (4 * Math.PI * Math.pow(radius, 3) / 3));
        System.out.println("Surface Area:" + (4 * Math.PI * Math.pow(radius, 2)));
    }
}