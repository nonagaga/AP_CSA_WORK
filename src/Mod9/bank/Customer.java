package Mod9.bank;

import java.util.ArrayList;

public class Customer {

    private String name;
    private int ssn;
    private ArrayList<Account> accounts;
    private static int numOfCustomers = 0;

    public Customer(){
        name = "John Doe";
        ssn = 123456789;
        accounts.add(new Account());
        numOfCustomers++;
    }

    public Customer(String name, int ssn, ArrayList<Account> accounts) {
        this.name = name;
        this.ssn = ssn;
        this.accounts = accounts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }

    public static int getNumOfCustomers() {
        return numOfCustomers;
    }

    @Override
    public String toString() {
        String accountStrings = "";

        for (Account account:accounts
             ) {
            accountStrings+=account.toString();
        }

        return "This is customer: " + name + '\n' +
                "With SSN: " + ssn + "\n" +
                "With Account(s): " + accountStrings;
    }
}
