package Projects.ZeroCalc;

public class Polynomial {

    static final double EPSILON  = 0.001;

    //coefficients and constants
    private int fourth = 0;
    private int third = 0;
    private int second = 0;
    private int first = 0;
    private int constant = 0;

    //fourth degree
    public Polynomial(int fourth, int third, int second, int first, int constant) {
        this.fourth = fourth;
        this.third = third;
        this.second = second;
        this.first = first;
        this.constant = constant;
    }

    //third degree
    public Polynomial(int third, int second, int first, int constant) {
        this.third = third;
        this.second = second;
        this.first = first;
        this.constant = constant;
    }

    //second degree
    public Polynomial(int second, int first, int constant) {
        this.second = second;
        this.first = first;
        this.constant = constant;
    }

    public double derivativeAt(double x){
        return 4 * fourth * Math.pow(x,3) + 3 * third * Math.pow(x,2) + 2 * second * x + first;
    }

    public double valueAt(double x){
        return fourth * Math.pow(x,4) + third * Math.pow(x,3) + second * Math.pow(x,2) + first * x + constant;
    }

    //return a zero of the polynomial, if it exists
    public void newtonRaphson(double x){
        int counter = 0;
        double ratio = valueAt(x)/derivativeAt(x);
        while (Math.abs(ratio) >= EPSILON){
            ratio = valueAt(x) / derivativeAt(x);
            x = x - ratio;
            counter ++;

            if (counter > 30){
                System.out.println("No real roots found!");
                return;
            }
        }

        System.out.println("A zero has been found at: " + Math.round((x*100)/100) + " after " + counter + " iterations.");
    }

    public static void main(String[] args) {
        Polynomial polynomial1 = new Polynomial(2,0,0);
        polynomial1.newtonRaphson(Math.random()*10 - 5);
    }
}
