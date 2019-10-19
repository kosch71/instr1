public class Calculus {

    /**
     * constructor
     */
    private Polynom polynom;

    public Calculus(Polynom polynom) {
        this.polynom = polynom;
    }

    /**
     * getter
     * @return polynom
     */
    public Polynom getPolynom() {
        return polynom;
    }

    /**
     * setter
     * @param polynom
     * @return polynom
     */
    public Calculus setPolynom(Polynom polynom) {
        this.polynom = polynom;
        return this;
    }

    /**
     * print Calculus
     */
    public void printCalc(){
        int count = 0;
        Fraction fraction;
        fraction = polynom.get(0);

        for (Fraction i : this.polynom) {
            if (count != 0) System.out.print(i.toString() + "*X^" + count + " ");
                count++;

        }

        System.out.print("= "+polynom.get(0));

    }

}
