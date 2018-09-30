package ch6624;

import java.util.*;

public class Hand {
    public static void main(String[] args) {

        Random rand = new Random();

        Card card1 = new Card(rand.nextInt(13) + 1, rand.nextInt(4));
        Card card2 = new Card(rand.nextInt(13) + 1, rand.nextInt(4));
        Card card3 = new Card(rand.nextInt(13) + 1, rand.nextInt(4));
        Card card4 = new Card(rand.nextInt(13) + 1, rand.nextInt(4));
        Card card5 = new Card(rand.nextInt(13) + 1, rand.nextInt(4));
        Card card6 = new Card(rand.nextInt(13) + 1, rand.nextInt(4));
        Card card7 = new Card(rand.nextInt(13) + 1, rand.nextInt(4));

        System.out.println(card1);
        System.out.println(card2);
        System.out.println(card3);
        System.out.println(card4);
        System.out.println(card5);
        System.out.println(card6);

        System.out.println(card7); //toString is called implicitly
        System.out.println(card7.toString()); //here i called it explicitly
    }
}
