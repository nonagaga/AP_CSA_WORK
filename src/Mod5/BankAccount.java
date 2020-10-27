package Mod5;

public class BankAccount
{
    private double balance;
    private int id;
    private Client client;

    public BankAccount(double balance, int id, Client client){
        this.balance = balance;
        this.id = id;
        this.client = client;
    }

    public BankAccount(){
        this.balance = 0.00;
        this.id = 0;
        this.client = null;
    }

    @Override
    public String toString(){
        return "client: " + client + "\nid: " + id + "\nbalance: $" + this.balance;
    }

    private void withdraw(double amt){
        if(balance - amt >= 0){
            balance -= amt;
        }
    }

    private void deposit(double amt){
        balance += amt;
    }

    public static void main(String[] args) {
        Client client0 = new Client();
        BankAccount bankAccount = new BankAccount(1000,123,client0);

        System.out.println(bankAccount);
    }
}