package Mod5;

public class Client {

    private String name;
    private int ssn;
    private static int numberOfCustomers;
    private BankAccount bankAccount;


    public Client(String name, int ssn, BankAccount bankAccount){
        this.name = name;
        this.ssn = ssn;
        this.bankAccount = bankAccount;
    }

    public Client(String name, int ssn){
        this.name = name;
        this.ssn = ssn;
    }

    public Client(BankAccount bankAccount){
        this.name = "Default Name";
        this.ssn = 0;
        this.bankAccount = bankAccount;
    }

    public Client(){
        this.name = "Default Name";
        this.ssn = 0;
        this.bankAccount = new BankAccount(this);
    }

    public void attachBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public String getName() {
        return name;
    }

    public int getSsn() {
        return ssn;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public static int getNumberOfCustomers() {
        return numberOfCustomers;
    }

    public String clientInfo(){
        return "CLIENT:\nname = '" + name +
                "', ssn = " + ssn + "\n";
    }

    @Override
    public String toString() {
        return
                "CLIENT:\nname = '" + name +
                "', ssn = " + ssn + "\n" + getBankAccount().bankAccountInfo();
    }
}
