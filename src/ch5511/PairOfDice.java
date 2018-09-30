package ch5511;

public class PairOfDice {
    public int die1, die2;
    int show;

    public PairOfDice() {
        roll();
    }

    public void roll() {
        die1 = (int) (Math.random() * 6) + 1;
        die2 = (int) (Math.random() * 6) + 1;
    }

    public int getDie1() {
        return die1;
    }

    public int getDie2() {
        return die2;
    }

    public int getTotal() {
        return (die1 + die2);
    }
}