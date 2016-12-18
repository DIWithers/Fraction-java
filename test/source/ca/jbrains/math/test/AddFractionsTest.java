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
}