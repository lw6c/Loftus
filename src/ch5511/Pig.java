package ch5511;

/* Using the PairOfDice class from Pp 4.9, design and implement a class to play a game called Pig.  in this game, 
   the user competes against the computer.  On each turn, the player rolls a pair of dice and accumulates points.  
   The goal is to reach 100 points before your opponent does.  If, on any turn, the player rolls a 1, all points 
   accumulated for that round are forfeited and control of the dice moves to the other player.  If the player rolls 
   two 1s in one turn, the player loses all points accumulated thus far in the game and loses control of the dice.  
   The player may voluntarily turn over the dice after each roll.  Therefore, the player must decide to either roll 
   again (be a pig) and risk losing points, or relinquish control of the dice, possibly allowing the other player to win.  
   Implement the computer player such that it always relinquishes the dice after accumulating 20 or more points in any 
   given round. */

import java.util.*;

public class Pig {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int player = 0;
        int computer = 0;
        int turn = 1;
        int totround = 0;
        int state = 0;
        PairOfDice dice = new PairOfDice();
        while (player <= 100 && computer <= 100) {
            System.out.println("------------------------------------------------------------------");
            dice.roll();
            System.out.println(dice.getDie1() + " and " + dice.getDie2() + " were rolled.");
            if (dice.getTotal() == 2)
                System.out.println("Two 1's were rolled.  All points lost, and turned over.");
            else if (dice.getDie1() == 1 || dice.getDie2() == 1)
                System.out.println("A \'1\' was rolled.  This round's points were lost, and turned over.");
            else state = 1;
            if (turn % 2 == 0) { //computer
                if (dice.getTotal() == 2) computer = 0;
                else if (state == 1) {
                    computer += dice.getTotal();
                    totround += dice.getTotal();
                    System.out.println(computer + " points for computer!");
                    if (totround < 20) turn++;
                }
            } else { //player
                if (dice.getTotal() == 2) player = 0;
                else if (state == 1) {
                    player = player + dice.getTotal();
                    System.out.println(player + " points for you!");
                    if (player < 100) {
                        System.out.print("Roll? (yes/no): ");
                        String again = scan.nextLine();
                        if (again.equalsIgnoreCase("y")) turn++;
                    }
                }
                totround = 0;
            }
            turn++;
            state = 0;
        }
        System.out.println("Game over!\nComputer: " + computer + "\nPlayer: " + player);
    }
}
