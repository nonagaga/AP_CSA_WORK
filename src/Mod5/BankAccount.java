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

    public void withdraw(double amt){
            balance -= amt;
    }

    public void deposit(double amt){
        balance += amt;
    }

    public double getBalance() {
        return balance;
    }

    public Client getClient() {
        return client;
    }

    public static int getNumberOfAccounts() {
        return numberOfAccounts;
    }

    public void attachCustomer(Client client){
        this.client = client;
    }
}