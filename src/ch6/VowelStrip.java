package ch6;

/* Write a program that reads a string from the user,
 * then determines and prints how many of each lowercase
 * vowel(a, e, i, o, and u) appear in the entire string.
 * Have a sepaarate counter for each vowel. Also count
 * and print the number of nonvowel characters */
//Program 6.9

import java.util.*;

public class VowelStrip {
    public static void main(String[] args) {
        int acnt = 0, ecnt = 0, icnt = 0, ocnt = 0, ucnt = 0;
        int consonants = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scan.nextLine();
        for (int i = 0; i <= input.length() - 1; i++) {
            char test = input.charAt(i);
            switch (test) {
                case 'a':
                    acnt++;
                    break;
                case 'e':
                    ecnt++;
                    break;
                case 'i':
                    icnt++;
                    break;
                case 'o':
                    ocnt++;
                    break;
                case 'u':
                    ucnt++;
                    break;
                default:
                    consonants++;
            }
        }
        System.out.println("(lowercase only)");
        System.out.println("a's: " + acnt);
        System.out.println("e's: " + ecnt);
        System.out.println("i's: " + icnt);
        System.out.println("o's: " + ocnt);
        System.out.println("u's: " + ucnt);
        System.out.println("Consonants: " + consonants);
    }
}
