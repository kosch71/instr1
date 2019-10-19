import java.util.Iterator;

public class Polynom extends FractionSet {
    /**
     * constructor
     */
    public Polynom() {
        super();
    }

    /**
     * add Fraction to Polynom
     * @param x
     */
    void addFraction(Fraction x) {
        this.add(x);
    }

    /**
     * print Polynom
     */
    void print() {
        int count = 0;
        for (Fraction i : this) {
            System.out.print(i.toString() + "*X^" + count + " ");
            count++;
        }
    }

    /**
     * *?
     * @param other
     * @return poly
     */
    public Polynom sum(Polynom other) {
        Polynom poly = new Polynom();
        Iterator<Fraction> it = this.iterator();
        Iterator<Fraction> it_ = other.iterator();
        if (it.hasNext()) {
            if (it_.hasNext()) {
                Fraction f__ = it.next();
                poly.addFraction(f__.plus(it_.next()));
            }
        }
        return poly;
    }
}