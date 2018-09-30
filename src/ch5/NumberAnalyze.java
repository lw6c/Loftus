package ch5;

/* Write a program that determines and prints then number of
   odd, even, and zero digits in an integer value read from the
   keyboard. */
//Project 5.3

import java.util.*;

public class NumberAnalyze {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int value = scan.nextInt();
        int zero = 0;
        int even = 0;
        int odd = 0;
        while (value != 0) {
            if ((value % 10) == 0) zero++;
            else if (value % 2 == 0) even++;
            else odd++;
            value /= 10;
        }
        System.out.println("Even:" + even);
        System.out.println("Odd:" + odd);
        System.out.println("Zeros:" + zero);
    }
}

