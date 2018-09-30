package ch5;

/*
  Write a program that plays the Hi-Lo guessing games with numbers.  
  The program should pick a random number between 1 and 100 (inclusive), 
  then repeatedly prompt the user to guess the number. On each guess, 
  report to the user that he or she is correct or that the guess is high 
  or low.  Continue accepting guesses until the user guesses correctly or 
  chooses to quit.  Use a sentinel value to determine whether the user wants 
  to quit.  Count the number of guesses and report that value when the user 
  guesses correctly.  At the end of each game (by quitting or a correct guess),
  prompt to determine whther the user wants to play again.  Continue playing 
  games until the user chooses to stop. */
//Project 5.4

import java.util.*;

public class HighLowGuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        int guess = 0;
        while (guess != -1) {
            int number = random.nextInt(100);
            int guesses = 1;
            while (guess != number && guess != -1) {
                System.out.print("Enter your guess: ");
                guess = scan.nextInt();
                if (guess != -1) {
                    if (guess < number) System.out.println("Too low.");
                    else if (guess > number) System.out.println("Too high.");
                    else {
                        System.out.println("Correct, the number was " + number);
                        System.out.println("Number of guesses: " + guesses);
                        System.out.println("Play again?: ");
                        guess = scan.nextInt();
                    }
                }
                guesses++;
            }
        }
    }
}