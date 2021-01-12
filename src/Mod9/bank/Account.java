package Mod9.bank;

import java.util.Objects;

public class Account {

    private static int numAccounts = 0;

    private int id;

    private double balance;

    public Account(){
        id = 999;
        balance = 0.00;
        numAccounts++;
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        numAccounts++;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public void withdrawal(double amount) {
        balance -= amount;
        balance -= 0.05;
    }

    public void deposit(double amount) {
        balance += amount;
        balance -= 0.05;
    }

    public static int getNumAccounts() {
        return numAccounts;
    }

    @Override
    public String toString() {
        return "Account with ID: " + id + " with\nBALANCE: $" + balance;
    }

    public boolean equals(Account account) {
        if (account==this){
            return true;
        }
        if ((account.getId() == this.getId()) && account.getBalance() == this.getBalance()){
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
