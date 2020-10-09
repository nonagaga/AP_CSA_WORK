package Mod3;

public class TaxReturn {
    double income;
    boolean married;
    int ssn;
    //tax rates

    private static final double RATE1 = 0.15;
    private static final double RATE2 = 0.20;
    private static final double RATE3 = 0.28;
    private static final double RATE4 = 0.37;

    private static final double MARRIED_BRACKET1 = 31000;
    private static final double MARRIED_BRACKET2 = 51400;
    private static final double MARRIED_BRACKET3 = 85670;
    private static final double MARRIED_BRACKET4 = 101340;

    private static final double SINGLE_BRACKET1 = 21000;
    private static final double SINGLE_BRACKET2 = 41400;
    private static final double SINGLE_BRACKET3 = 75670;
    private static final double SINGLE_BRACKET4 = 91340;

    /*
    create a taxReturn for client object
    @param Income taxpayers income as a double
    @param married either true for married or false for single
     */

    public TaxReturn(double income, boolean married, int ssn){
        this.income = income;
        this.married = married;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public double getTax(){
        double tax = 0;
        if (married) {
            if (income <= MARRIED_BRACKET1) {
                tax = income * RATE1;
            } else if (income <= MARRIED_BRACKET2) {

                tax = RATE1 * MARRIED_BRACKET1 + RATE2 * (income - MARRIED_BRACKET1);

            } else if (income <= MARRIED_BRACKET3) {

                tax = RATE1 * MARRIED_BRACKET1 + RATE2 * (MARRIED_BRACKET2 - MARRIED_BRACKET1) + RATE3 * (income - MARRIED_BRACKET2);

            } else {
                tax = RATE1 * MARRIED_BRACKET1 + RATE2 * (MARRIED_BRACKET2 - MARRIED_BRACKET1) + RATE3 * (MARRIED_BRACKET3 - MARRIED_BRACKET2) + RATE4 * (income - MARRIED_BRACKET3);
            }
        } else {
            if (income <= SINGLE_BRACKET1) {
                tax = income * RATE1;
            } else if (income <= SINGLE_BRACKET2) {

                tax = RATE1 * SINGLE_BRACKET1 + RATE2 * (income - SINGLE_BRACKET1);

            } else if (income <= SINGLE_BRACKET3) {

                tax = RATE1 * SINGLE_BRACKET1 + RATE2 * (SINGLE_BRACKET2 - SINGLE_BRACKET1) + RATE3 * (income - SINGLE_BRACKET2);

            } else {
                tax = RATE1 * SINGLE_BRACKET1 + RATE2 * (SINGLE_BRACKET2 - SINGLE_BRACKET1) + RATE3 * (SINGLE_BRACKET3 - SINGLE_BRACKET2) + RATE4 * (income - SINGLE_BRACKET3);
            }
        }
        return tax;
    }

    //@override
    public boolean equals(TaxReturn c){
        return (this.getSsn() == c.getSsn() && this.getIncome() == c.getIncome() && this.isMarried() == c.isMarried());
    }
}
