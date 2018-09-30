package ch774;

public class CompareNumbers {
    public static void main(String[] args) {
        RationalNumber rn1 = new RationalNumber(1, 3);
        RationalNumber rn2 = new RationalNumber(2, 2);
        RationalNumber rn3 = new RationalNumber(3, 1);

        System.out.println("Rational number 1 compared to rational number 2: " + rn1.compareTo(rn2));
        System.out.println("Rational number 1 compared to rational number 3: " + rn1.compareTo(rn3));
        System.out.println("Rational number 2 compared to rational number 1: " + rn2.compareTo(rn1));
        System.out.println("Rational number 2 compared to rational number 2: " + rn2.compareTo(rn3));
        System.out.println("Rational number 3 compared to rational number 1: " + rn3.compareTo(rn1));
        System.out.println("Rational number 3 compared to rational number 2: " + rn3.compareTo(rn2));
    }
}
