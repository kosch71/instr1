import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class FractionSetTest {

    @Test
    public void getMax() {
        Fraction fraction = new Fraction(4,5);
        Fraction fraction1 = new Fraction(6, 8);
        Fraction fraction3 = new Fraction(2,5);
        Fraction fraction2 = new Fraction(9, 8);
        FractionSet fractionArrayList = new FractionSet();
        fractionArrayList.add(fraction);
        fractionArrayList.add(fraction1);
        fractionArrayList.add(fraction2);
        fractionArrayList.add(fraction3);
        Fraction frac = fractionArrayList.getMax();
        FractionSet fractionArrayList2 = new FractionSet();
        fractionArrayList2.add(fraction);
        fractionArrayList2.add(fraction1);
        Fraction frac2 = fractionArrayList2.getMax();
        Assert.assertEquals(frac, frac2);

    }

    @Test
    public void getMin() {
        Fraction fraction = new Fraction(4,5);
        Fraction fraction1 = new Fraction(6, 8);
        Fraction fraction3 = new Fraction(2,5);
        Fraction fraction2 = new Fraction(9, 8);
        FractionSet fractionArrayList = new FractionSet();
        fractionArrayList.add(fraction);
        fractionArrayList.add(fraction1);
        fractionArrayList.add(fraction2);
        fractionArrayList.add(fraction3);
        Fraction frac = fractionArrayList.getMin();
        FractionSet fractionArrayList2 = new FractionSet();
        fractionArrayList2.add(fraction);
        fractionArrayList2.add(fraction3);
        Fraction frac2 = fractionArrayList2.getMin();
        Assert.assertEquals(frac, frac2);
    }

}