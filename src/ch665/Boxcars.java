package ch665;

/* Using the PairOfDice class from PP 34.9, write a program that rolls a pair of 
   dice 1000 times, counting the number of box cars (two sixes) that occur. */
public class Boxcars {
    public static void main(String[] args) {
        final int ROLLS = 1000;
        int boxcars = 0;
        PairOfDice dice = new PairOfDice();
        for (int i = 0; i < ROLLS; i++) {
            dice.roll();
            if (dice.getTotal() == 12) boxcars++;
        }
        System.out.println(ROLLS + " total rolls, " + boxcars + " boxcars.");
    }
}