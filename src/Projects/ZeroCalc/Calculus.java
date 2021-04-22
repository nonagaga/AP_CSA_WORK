package Projects.ZeroCalc;

import java.util.ArrayList;

public class Calculus {
    static final double EPSILON = 0.001;
    ArrayList<Integer> coefficients;
    int count = 0;

    public Calculus(int a, int b, int c, int d, int e)
    {
        coefficients = new ArrayList<Integer>();
        coefficients.add(0, a);
        coefficients.add(0, b);
        coefficients.add(0, c);
        coefficients.add(0, d);
        coefficients.add(0, e);
    }

    public double valueAt(double x){
        return coefficients.get(4) * Math.pow(x,4) +
                coefficients.get(3) * Math.pow(x,3) +
                coefficients.get(2) * Math.pow(x,2) +
                coefficients.get(1) * x +
                coefficients.get(0);
    }

    public double derivativeAt(double x, ArrayList<Integer> cf)
    {
        double dd = 0;
        for(int i = cf.size()-1; i > 0; i--)
        {
            dd += i*cf.get(i)*Math.pow(x,i-1);
        }

        return dd;
        //return 4*coefficients.get(4)*Math.pow(x,3) + 3 * coefficients.get(3) * Math.pow(x,2) +
        //2 * coefficients.get(2) * Math.pow(x,1) + coefficients.get(1)* Math.pow(x,0)+ coefficients.get(0)*Math.pow(x,-1);
    }

    public double doubleDerivative(double x, ArrayList<Integer> cf){
        double dd = 0;
        for(int i = cf.size()-1; i > 0; i--)
        {
            dd = dd+ i*(i-1)*cf.get(i)*Math.pow(x,i-2);
        }
        return dd;
    }


    public void criticalPoint(double x){
        double h = derivativeAt(x, this.coefficients) / doubleDerivative(x, this.coefficients);
        while (Math.abs(h) >= EPSILON)
        {
            h = valueAt(x) / derivativeAt(x, this.coefficients);

            // x(i+1) = x(i) - f(x) / f'(x)
            x = x - h;
            count++;

            if(count > 100)
            {
                System.out.println("No real solutions.");
                break;
            }
        }
        if(count<=100)
        {
            System.out.println("after iterations: " + count + " The value of the" + " root is : "
                    + Math.round(x * 100.0) / 100.0);
        }
    }

    public static void main(String[] args) {
        Calculus calculus = new Calculus(-0,3,-2,-1,1);
        System.out.println(calculus.valueAt(1));
        System.out.println(calculus.derivativeAt(0, calculus.coefficients));
        System.out.println(calculus.doubleDerivative(1, calculus.coefficients));
        calculus.criticalPoint(-1);
    }
}
