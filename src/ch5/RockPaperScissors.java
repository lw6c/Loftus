package ch5;

import java.util.*;

public class RockPaperScissors {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int wins = 0;
        int losses = 0;
        int ties = 0;
        int human = 0;
        String input = "";
        String computer_weapon = "";
        final int rock = 1, paper = 2, scissors = 3;
        System.out.println("Type \'quit\' to quit.");
        while (!input.equalsIgnoreCase("quit")) {
            System.out.print("Your weapon: ");
            input = scan.next();
            if (!input.equalsIgnoreCase("quit")) {
                int computer = rand.nextInt(3) + 1;
                if (computer == 1) {
                    computer_weapon = "rock";
                } else if (computer == 2) {
                    computer_weapon = "paper";
                } else {
                    computer_weapon = "scissors";
                }
                System.out.println("Computer: " + computer_weapon);
                if (input.equalsIgnoreCase("rock")) {
                    human = 1;
                }
                if (input.equalsIgnoreCase("paper")) {
                    human = 2;
                }
                if (input.equalsIgnoreCase("scissors")) {
                    human = 3;
                }
                if (human == computer) {
                    System.out.println("It's a tie!");
                }
                ties++;
//                else if ((human==rock && computer==scissors)||(human==paper && computer==rock)||(human==scissors && computer==paper))
//                System.out.println("You win!");
//                wins++;
//                else if{ System.out.println("You lose.");
//                losses++;
            }
            System.out.println("-------------------------------------------");
        }
        System.out.println("Program terminated.");
        System.out.println("Wins: " + wins + "\nLosses: " + losses + "\nTies: " + ties);
    }
}


