package Mod5;

public class BankAccount
{
    private String name;
    private int number;
    private double balance;

    public BankAccount(String name, int number, double balance){
        this.name = name;
        this.number = number;
        this.balance = balance;
    }

    public BankAccount(){
        this.name = "";
        this.number = 0;
        this.balance = 0.00;
    }

    public String toString(){
        return this.name + ", " + this.number + ", " + this.balance;
    }

    private void withdraw(double amt){
        if(balance - amt >= 0){
            balance -= amt;
        }
    }

    private void deposit(double amt){
        balance += amt;
    }

    private void main(){
        BankAccount user1 = new BankAccount("John Doe", 12345, 5000);
        user1.withdraw(1000);
        user1.deposit(2000);
        System.out.println(user1.toString());
    }
}