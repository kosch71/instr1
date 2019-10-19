import org.junit.Assert;
import org.junit.Test;

public class CalculusTest {

    @Test
    public void printCalc() {
        Fraction fraction = new Fraction(4,5);
        Fraction fraction1 = new Fraction(6, 8);
        Fraction fraction3 = new Fraction(2,5);
        Fraction fraction2 = new Fraction(9, 8);
        Polynom polynom = new Polynom();
        polynom.addFraction(fraction);
        polynom.addFraction(fraction1);
        Polynom polynom1 = new Polynom();
        polynom1.addFraction(fraction2);
        polynom1.addFraction(fraction3);
        polynom.sum(polynom1);
        polynom1.sum(polynom1);
        Calculus calculus = new Calculus(polynom);
        Calculus calculus1 = new Calculus(polynom1);
        Assert.assertEquals(calculus.getPolynom(), calculus1.getPolynom());
    }
}