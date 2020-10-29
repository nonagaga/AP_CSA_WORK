package Mod5;

public class Bank {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(200,334);
        Client client1 = new Client("Joe",456);

        account1.attachCustomer(client1);
        client1.attachBankAccount(account1);

        System.out.println(client1);

        System.out.println(account1);
    }
}
