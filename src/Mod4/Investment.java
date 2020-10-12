package Mod4;

public class Investment {
    int years;
    double balance;
    double rate;

    /**
     * constructs an investment from balance and rate
     * @param balance the starting balance
     * @param rate the interest rate
     */

    public Investment(double balance,double rate){
        this.balance = balance;
        this.rate = rate;
    }

    /**
     *
     * @return the balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     *
     * @return the rate
     */
    public double getRate() {
        return rate;
    }

    /**
     *
     * @return the years
     */
    public int getYears() {
        return years;
    }

    /**
     * keeps adding interest annually until target balance is exceeded
     * @param targetBalance the target balance
     */
    public void waitForBalance(double targetBalance){
        while(balance < targetBalance){
            years++;
            double interest = balance * rate/100;
            balance += interest;
        }
    }

    /**
     * keeps adding interest annually until target length is met
     * @param targetYears the target length of investment
     */
    public void waitYears(int targetYears){
        for(int i = 0; i <= targetYears; i++){
            double interest = balance * rate/100;
            balance = balance+interest;
        } years += targetYears;
    }
}
