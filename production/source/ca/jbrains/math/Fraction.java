package ca.jbrains.math;

/**
 * Created by daniellewithers on 12/18/16.
 */
public class Fraction {
    private final int integerValue;

    public Fraction(int integerValue) {
        this.integerValue = integerValue;

    }
    public Fraction plus(Fraction that) {
        if (that.integerValue != 0)
            return that;

        else
            return this;
    }

    public int intValue() {
        return integerValue;
    }
}
