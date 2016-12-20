package ca.jbrains.math.test;

import ca.jbrains.math.Fraction;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by daniellewithers on 12/18/16.
 */
public class AddFractionsTest {
    @Test
    public void zeroPlusZero() throws Exception {
        Fraction sum = new Fraction(0).plus(new Fraction(0));
        assertEquals(0, sum.intValue());
    }
    @Test
    public void nonZeroPlusZero() throws Exception {
       final Fraction sum = new Fraction(3).plus(new Fraction(0));
        assertEquals(3, sum.intValue());
    }
    @Test
    public void zeroPlusNonZero() throws Exception {
        final Fraction sum = new Fraction(0).plus(new Fraction(5));
        assertEquals(5, sum.intValue());
    }
    @Test
    public void nonNegativeNonZeroOperands() throws Exception {
        final Fraction sum = new Fraction(3).plus(new Fraction(4));
        assertEquals(7, sum.intValue());
    }
    @Test
    public void negativeInputsAndNegativeOutput() throws Exception {
        final Fraction sum = new Fraction(-3). plus(new Fraction(1));
        assertEquals(-2, sum.intValue());
//        Can also be written as:
//        assertEquals(-2, new Fraction(-3).plus(new Fraction(1)).intValue());
    }
}