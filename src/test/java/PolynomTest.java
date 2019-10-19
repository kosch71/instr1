import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PolynomTest {

    @Test
    public void sum() {
        Fraction fraction = new Fraction(4,5);
        Fraction fraction1 = new Fraction(6, 8);
        Fraction fraction3 = new Fraction(2,5);
        Fraction fraction2 = new Fraction(9, 8);
        Polynom polynom = new Polynom();
        polynom.addFraction(fraction);
        polynom.addFraction(fraction1);
        Polynom polynom2 = new Polynom();
        polynom2.addFraction(fraction2);
        polynom2.addFraction(fraction3);
        polynom.sum(polynom2);
        polynom2.sum(polynom2);
        Assert.assertEquals(polynom, polynom2);
        int a=0;
        /***/
        //gdkjglkfklrgmlkg

        if (a>0) {
            /*Your true statement*/ ;
        } else {
            /*Your false statemnet*/;
        }
    }
}
