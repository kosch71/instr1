import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        Fraction fraction1 = new Fraction(scan.nextInt(), scan.nextInt());
        Fraction fraction2 = new Fraction(scan.nextInt(), scan.nextInt());
        Fraction fraction3 = new Fraction(scan.nextInt(), scan.nextInt());
        Fraction fraction4 = new Fraction(scan.nextInt(), scan.nextInt());

        FractionSet frac = new FractionSet();
        FractionSet frac_ = new FractionSet();

        frac.add(fraction1);
        frac_.add(fraction2);

        frac.add(fraction3);
        frac_.add(fraction4);

        System.out.println(frac.getAllFracs());



        Polynom polynom = new Polynom();
        Polynom polynom__ = new Polynom();

        polynom.addFraction(fraction1);
        polynom.addFraction(fraction2);
        polynom__.addFraction(fraction3);
        polynom__.addFraction(fraction4);
        polynom.print();
        polynom__.print();
        polynom.sum(polynom__);
        polynom__.print();
        System.out.println(polynom);
        Calculus calculus = new Calculus(polynom);
        calculus.printCalc();
    }
}
