package Mod9.bank;

import java.util.ArrayList;

public class BankRunner {
    public static void main(String[] args) {

        Checking checking1 = new Checking(145,2000,20);
        VIPAccount vipAccount1 = new VIPAccount(100);
        Account account1 = new Account();
        Savings savings1 = new Savings();

        ArrayList<Account> accounts = new ArrayList<Account>();

        accounts.add(checking1);
        accounts.add(vipAccount1);
        accounts.add(account1);
        accounts.add(savings1);

        Customer customer1 = new Customer("John Doe", 12345, accounts);

        System.out.println(customer1);

        Account account2 = new Account(10,10000);

        System.out.println("Is account1 equal to account2? " + account1.equals(account2));
    }
}
