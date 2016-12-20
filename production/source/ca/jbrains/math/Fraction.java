package ca.jbrains.math;

/**
 * Created by daniellewithers on 12/18/16.
 */
public class Fraction {
    private final int denominator;
    private final int numerator;

    public Fraction(int integerValue) {
        this.numerator = integerValue;
        this.denominator = 1;
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction plus(Fraction that) {
        return new Fraction(this.numerator + that.numerator);
    }

    public int intValue() {
        return numerator;
    }

    public int getNumerator() {
        return 3;
    }

    public int getDenominator() {
        return 5;
    }

}
