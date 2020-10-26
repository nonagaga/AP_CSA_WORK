package Mod5;

public class BankAccount
{
    private double balance;

    public BankAccount(double balance){
        this.balance = balance;
    }

    public BankAccount(){
        this.balance = 0.00;
    }

    public String toString(){
        return "$" + this.balance;
    }

    private void withdraw(double amt){
        if(balance - amt >= 0){
            balance -= amt;
        }
    }

    private void deposit(double amt){
        balance += amt;
    }
}