package Mod5;

public class Client {

    String name;
    int accountNumber;
    BankAccount bankAccount;

    public Client(String name, int accountNumber, BankAccount bankAccount){
        this.name = name;
        this.accountNumber = accountNumber;
        this.bankAccount = bankAccount;
    }

    public Client(){
        this.name = "Default Name";
        this.accountNumber = 0;
        this.bankAccount = new BankAccount();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public String getName() {
        return name;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }
}
