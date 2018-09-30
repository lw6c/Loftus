package ch2;

/* Write a program that prompts for and reads integer values
 * for speed and distance traveled, then prints the time required
 * for the trip as a floating point result. */
//Project 2.7

import java.util.*;

public class Triptime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int kilometers;
        double speed, time;
        System.out.print("Travel Distance in kilometers:");
        kilometers = scan.nextInt();
        System.out.print("Travel speed:");
        speed​​ = scan.nextDouble();
        time = kilometers / speed;
        System.out.println("Trip time: " + time + " hours.");
    }
} 
