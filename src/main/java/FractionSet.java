import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FractionSet extends ArrayList<Fraction> {

    /**
     * constructor
     */
    public FractionSet() {
    }

    /**
     * print Fractions
     * @param out
     */
    void print(OutputStream out) {
        PrintWriter pw = new PrintWriter(out);
        for (Fraction i : this) {
            pw.print(i.toString() + " ");
        }
        pw.println();
        pw.close();
    }


    /**
     * get All fractions
     * @return listOfFRactions
     */
    List<Fraction> getAllFracs(){
        return new ArrayList<>(this);
    }

}
