package ch6;

/* Write a program that read an integer value and prints the sum of all
   even integers between 2 and the input value, inclusive.  Print an error
   message if the input value is less than 2.  Prompt accordingly. */
//Project 6.1

import java.util.*;

public class EvenAdd {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an integer (>=2): ");
        int input = scan.nextInt();
        if (input >= 2) {
            for (int i = 2; i <= input; i += 2) sum += i;
            System.out.println("Sum of all even numbers up to input= " + sum);
        } else System.out.println("There was an input error.");
    }
}
