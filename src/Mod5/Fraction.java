package Mod5;

public class Fraction
{
    private int numerator;
    private int denominator;
    private static int numFractions = 0;

    public Fraction(){
        numerator = 1;
        denominator = 1;
        numFractions++;
    }

    public Fraction(int numerator, int denominator){
        if(numerator > 0){
            this.numerator = numerator;
        } else {
            this.numerator = 1;
        }
        if(denominator > 0 ){
            this.denominator = denominator;
        } else {
            this.denominator = 1;
        }
        numFractions++;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public static int getNumFractions() {
        return numFractions;
    }

    @Override
    public String toString(){
        return numerator + "/" + denominator;
    }

    public String mixedNumber(){
        if(numerator >= denominator) {
            int num = numerator;
            int whole = 0;
            while (num >= denominator) {
                whole++;
                num -= denominator;
            }
            if(num == 0){
                return String.valueOf(whole);
            } else {
                return whole + " " + num + "/" + denominator;
            }
        } else {
            return String.valueOf(this);
        }
    }

    public void setNumerator(int numerator) {
        if(numerator > 0) {
            this.numerator = numerator;
        }
    }

    public void setDenominator(int denominator) {
        if(denominator > 0) {
            this.denominator = denominator;
        }
    }

    public void add(int n, int d){
        if(n > 0 && d > 0) {
            numerator = (numerator * d + n * denominator);
            denominator = (denominator * d);
        }
    }
    // a/b + c/d = (a*d + c*b)/(b*d)
    public void add(Fraction other){
        numerator = (numerator*other.getDenominator() + other.getNumerator()*denominator);
        denominator = denominator*other.getDenominator();
    }

    public void multiply(int n, int d){
        if(n > 0 && d > 0) {
            numerator = numerator * n;
            denominator = denominator * d;
        }
    }

    public void multiply(Fraction other){
        numerator = numerator* other.getNumerator();
        denominator = denominator*other.getDenominator();
    }
}
