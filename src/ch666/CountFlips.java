package ch666;

/* Using the COin class defined in Chapter 5,
   write a program called CountFlips whose main 
   method flips a coin 100 times and counts how
   many times each side comes up.  Print the results. */

public class CountFlips {
    public static void main(String[] args) {
        Coin coin = new Coin();
        int heads = 0, tails = 0;
        for (int i = 1; i <= 100; i++) {
            coin.flip();
            if (coin.toString() == "Heads") heads++;
            else tails++;
        }
        System.out.println("Heads: " + heads);
        System.out.println("Tails: " + tails);
    }
}
