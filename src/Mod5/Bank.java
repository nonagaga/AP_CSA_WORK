package Mod5;

import java.util.ArrayList;

public class Bank {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount(10,334);
        Client client1 = new Client("Joe",436);

        account1.attachCustomer(client1);
        client1.attachBankAccount(account1);

        System.out.println(client1);

        System.out.println(account1);

        BankAccount account2 = new BankAccount();

        System.out.println(account2);

        Client client2 = new Client();

        System.out.println(client2);

        Banker.chargeFee(account1,20);

        System.out.println(account1);

        ArrayList<BankAccount> vip = new ArrayList<BankAccount>();
        vip.add(account1);
        vip.add(account2);

        for (BankAccount a: vip
             ) {
            System.out.println(a);
        }
    }
}
