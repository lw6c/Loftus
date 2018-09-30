package ch774;

/* Modify the RationalNumber class so that it implements the
 * Comparable interface.  To perform the comparison, compute
 * an equivalent floating point value from the numerator and
 * denominator for both RationalNumber objects, the compare
 * them using a tolerance value of 0.0001.  Write a main
 * driver to test your modifications. */

public class RationalNumber implements Comparable {
    private int numerator, denominator;

    public RationalNumber(int numer, int denom) {
        if (denom == 0) denom = 1;
        if (denom < 0) {
            numer *= -1;
            denom *= -1;
        }
        numerator = numer;
        denominator = denom;
        reduce();
    }

    public int compareTo(Object object) {
        final double TOLERANCE = .0001;
        RationalNumber RN_Obj = (RationalNumber) object;
        double value = (double) RN_Obj.getNumerator() / RN_Obj.getDenominator() - numerator / denominator;
        if (value > TOLERANCE) return 1;
        else if (value < -TOLERANCE) return -1;
        return 0;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public RationalNumber reciprocal() {
        return new RationalNumber(denominator, numerator);
    }

    public RationalNumber add(RationalNumber obj) {
        int commonDenominator = denominator * obj.getDenominator();
        int numerator1 = numerator * obj.getDenominator();
        int numerator2 = obj.getNumerator() * denominator;
        int sum = numerator1 + numerator2;
        return new RationalNumber(sum, commonDenominator);
    }

    public RationalNumber subtract(RationalNumber obj) {
        int commonDenominator = denominator * obj.getDenominator();
        int numerator1 = numerator * obj.getDenominator();
        int numerator2 = obj.getNumerator() * denominator;
        int difference = numerator1 - numerator2;
        return new RationalNumber(difference, commonDenominator);
    }

    public RationalNumber multiply(RationalNumber obj) {
        int numer = numerator * obj.getNumerator();
        int denom = denominator * obj.getDenominator();
        return new RationalNumber(numer, denom);
    }

    public RationalNumber divide(RationalNumber obj) {
        return multiply(obj.reciprocal());
    }

    public boolean isLike(RationalNumber obj) {
        return (numerator == obj.getNumerator() && denominator == obj.getDenominator());
    }

    public String toString() {
        String result;
        if (numerator == 0) result = "0";
        else if (denominator == 1) result = numerator + "";
        else result = numerator + "/" + denominator;
        return result;
    }

    private void reduce() {
        if (numerator != 0) {
            int common = gcd(Math.abs(numerator), denominator);
            numerator /= common;
            denominator /= common;
        }
    }

    private int gcd(int num1, int num2) {
        while (num1 != num2)
            if (num1 > num2) num1 -= num2;
            else num2 -= num1;
        return num1;
    }
}
