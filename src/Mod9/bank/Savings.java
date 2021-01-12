package Mod9.bank;

public class Savings extends VIPAccount {

    private double rate;

    public Savings() {
        super();
    }

    public Savings(double rate){
        this.rate = rate;
    }

    public Savings(int id, double balance, int points, double rate) {
        super(id, balance, points);
        this.rate = rate;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public void depositInterest(){
        this.deposit(this.getBalance()*rate);
    }


}
