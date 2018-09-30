package ch3;

/* Write a program that reads the (x,y) coordinates for two points.  Compute
   the distace between two points using the following formula:
   Distance= d=√​(x​2​​−x​1​)​² +(y2−y1)​² */
//Project 3.5

import java.text.*;
import java.util.*;

public class DistanceFormula {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("x1:");
        int x1 = scan.nextInt();
        System.out.println("y1:");
        int y1 = scan.nextInt();
        System.out.println("x2:");
        int x2 = scan.nextInt();
        System.out.println("y2:");
        int y2 = scan.nextInt();
        double x = Math.pow((x1 - x2), 2);
        double y = Math.pow((y2 - y1), 2);
        DecimalFormat fmt = new DecimalFormat("0.##");
        double distance = Math.sqrt((x + y));
        System.out.println(fmt.format(distance));
    }
}
