public class Fraction {
    private int numerator;
    private int denominator;
    private double mean;


    /**
     * constructor
     * @param numerator
     * @param denominator
     */
    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        this.mean = (double) numerator / denominator;
    }

    /**
     * set Numerator
     * @param numerator
     */
    public void setNum(int numerator) {
        this.numerator = numerator;
    }

    /**
     * set Denominator
     * @param denominator
     */
    public void setDenom(int denominator) {
        this.denominator = denominator;
    }

    /**
     * get Numerator
     * @return numerator
     */
    public int getNum() {
        return this.numerator;
    }

    /**
     * get Denominator
     * @return denominator
     */
    public int getDenom() {
        return this.denominator;
    }

    /**
     * get double meaning
     * @return mean
     */
    public double getMean() {
        return this.mean;
    }

    /**
     * toString Fraction
     * @return String
     */
    public String toString() {
        return numerator + "/" + denominator;
    }

    /**
     * compare fraction
     * @param fr
     * @return byte
     */
    public byte compare(Fraction fr) {
        if (this.numerator * fr.denominator > fr.numerator * this.denominator) {
            return 1;
        }
        if (this.numerator * fr.denominator < fr.numerator * this.denominator) {
            return -1;
        }
        else {
            return 0;
        }
    }

    /**
     * summary two Fraction
     * @param other
     * @return result
     */
    public Fraction plus(Fraction other) {
        Fraction result = new Fraction(0, 0);
        result.denominator = other.denominator * this.denominator;
        result.numerator = other.numerator * this.denominator + this.numerator * other.denominator;
        return result;
    }
}
