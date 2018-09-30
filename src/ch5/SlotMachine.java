package ch5;

/* Design and implement an application that simulates a simple slot 
   machine in which three numbers between 0 and 9 are randomly selected 
   and printed side by side. Print an appropriate statement if all three 
   of the numbers are the same, or if any two of the numbers are the same. 
   Continue playing until the user chooses to stop. */
//Project 5.8

import java.util.*;

public class SlotMachine {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        String answer = "y";
        int num1, num2, num3;
        while (answer.equalsIgnoreCase("y")) {
            System.out.println("Play?(y/n): ");
            answer = scan.nextLine();
            num1 = rand.nextInt(10);
            num2 = rand.nextInt(10);
            num3 = rand.nextInt(10);
            System.out.println("The three numbers of the slot machine are: " + num1 + num2 + num3);
            if (num1 == num2 && num2 == num3) System.out.println("Jackpot!");
            else if (num1 == num2 || num1 == num3 || num2 == num3) System.out.println("Two of the same!");
            else System.out.println("You lose!");
        }
    }
}
