package Mod5;

public class BankAccount
{
    private double balance;
    private int id;
    private Client client;
    public static int numberOfAccounts;

    public BankAccount(double balance, int id, Client client){
        this.balance = balance;
        this.id = id;
        this.client = client;
        numberOfAccounts++;
    }

    public BankAccount(double balance, int id){
        this.balance = balance;
        this.id = id;
        numberOfAccounts++;
    }

    public BankAccount(Client client){
        this.client = client;
    }

    public BankAccount(){
        this.balance = 0.00;
        this.id = 0;
        numberOfAccounts++;
        this.client = new Client(this);
    }

    public String bankAccountInfo(){
        return "BANK ACCOUNT:\nid: " + id + "\nbalance: $" + this.balance + "\n";
    }

    @Override
    public String toString(){
        return  "BANK ACCOUNT:\nid: " + id + "\nbalance: $" + this.balance + "\n" + client.clientInfo();
    }

    private void withdraw(double amt){
        if(balance - amt >= 0){
            balance -= amt;
        }
    }

    private void deposit(double amt){
        balance += amt;
    }

    public static int getNumberOfAccounts() {
        return numberOfAccounts;
    }

    public void attachCustomer(Client client){
        this.client = client;
    }
}