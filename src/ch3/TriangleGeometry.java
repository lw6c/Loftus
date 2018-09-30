package ch3;

/* Write a program that generates a random integer in the range 20
 * to 40, inclusive, and displays the sine, cosine, and tangents of
  that number. */
//Project 3.8

import java.util.*;

public class TriangleGeometry {
    public static void main(String[] args) {
        Random rand = new Random();
        int random = rand.nextInt(21) + 20;
        System.out.println(random);
        System.out.println("Sin(" + random + "}= " + Math.sin(random));
        System.out.println("Cos(" + random + "}= " + Math.cos(random));
        System.out.println("Tan(" + random + "}= " + Math.tan(random));
    }
}