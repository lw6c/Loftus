package ch6624;

/* Design and implement a class called Card that represents a standard 
   playing card.  Each card has a suit and a face value.  Create a program
   that deals five random cards. */

public class Card {

    private final int suit;
    public final static int SPADES = 0;
    public final static int HEARTS = 1;
    public final static int CLUBS = 2;
    public final static int DIAMONDS = 3;


    private final int value;
    public final static int ACE = 1;
    public final static int KING = 13;
    public final static int QUEEN = 12;
    public final static int JACK = 11;



    public Card(int value, int suit) {
        this.value = value;
        this.suit = suit;
    }

//    public String getSuit() {
//        switch (suit) {
//            case SPADES:
//                return "Spades";
//            case HEARTS:
//                return "Hearts";
//            case DIAMONDS:
//                return "Diamonds";
//            case CLUBS:
//                return "Clubs";
//            default:
//                return "";
//        }
//    }
public String getSuit() {
    switch (suit) {
        case 0:
            return "Spades";
        case 1:
            return "Hearts";
        case 2:
            return "Diamonds";
        case 3:
            return "Clubs";
        default:
            return "";
    }
}

    public String getValue() {
        switch (value) {
            case 1:
                return "Ace";
            case 2:
                return "Two";
            case 3:
                return "Three";
            case 4:
                return "Four";
            case 5:
                return "Five";
            case 6:
                return "Six";
            case 7:
                return "Seven";
            case 8:
                return "Eight";
            case 9:
                return "Nine";
            case 10:
                return "Ten";
            case 11:
                return "Jack";
            case 12:
                return "Queen";
            case 13:
                return "King";
            default:
                return "";
        }
    }

    public String toString() {
        return getValue() + " * " + getSuit();
    }
}