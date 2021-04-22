package Projects.Physics;

import java.util.ArrayList;
import java.util.Collection;

public class Polynomial {
    ArrayList<Double> coefficients;

    /**
     *
     * @param coefficients an ArrayList of Doubles representing the coefficients in a standard-form polynomial.
     *                     For example, 3x^3 + 2x^2 + x + 1 would be represented by: {3.0,2.0,1.0,1.0}
     *                     For powers of x not in the equation, multiply by a coefficient of zero.
     *                     For example, 6x^3 + 3 would be represented by: {6.0,0.0,0.0,3.0}
     */

    public Polynomial(ArrayList<Double> coefficients){
        this.coefficients = coefficients;
    }

    public Polynomial(){
        coefficients = new ArrayList<>();
    }

    public double valueAt(double x){

        if (x == 0){
            return coefficients.get(coefficients.size()-1);
        }

        double value = 0;
        for (int i = 0; i < coefficients.size(); i++) {
            value += coefficients.get(i) * Math.pow(x,coefficients.size()-1-i);
        }
        return value;
    }

    public void printValueAt(double x){
        System.out.println("Value at " + x + " is: " + valueAt(x));
    }

    public static void main(String[] args) {
        ArrayList<Double> values = new ArrayList<>();
        values.add(1.0);
        values.add(0.0);
        values.add(0.0);
        values.add(0.0);
        Polynomial poly = new Polynomial(values);

        for (int i = -3; i <= 3; i++) {
            poly.printValueAt(i);
        }
    }


}
