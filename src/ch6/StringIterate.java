package ch6;

/* Write a program that reads a string from the user and prints it one character per line. */
//Project 6.2

import java.util.*;

public class StringIterate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scan.nextLine();
        for (int i = 0; i < input.length(); i++) System.out.println(input.charAt(i));
    }
}
