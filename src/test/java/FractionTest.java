import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FractionTest {

    @Test
    public void compare() {
        Fraction fraction = new Fraction(4,5);
        Fraction fraction1 = new Fraction(6, 8);
        byte expected = fraction.compare(fraction1);

        byte actual = fraction.compare(fraction1);
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void plus() {
        Fraction fraction = new Fraction(4,5);
        Fraction fraction1 = new Fraction(6, 8);
        Fraction expected = fraction.plus(fraction);

        Fraction actual = fraction.plus(fraction1);
        Assert.assertEquals(expected,actual);
    }
}