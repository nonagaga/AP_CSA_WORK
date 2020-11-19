package Mod5;

public class Banker {

    final static double MIN_BALANCE = 10;

    public static void chargeFee(BankAccount bankAccount, double fee){
        if(bankAccount.getBalance() <= MIN_BALANCE){
            bankAccount.withdraw(fee);
        }
    }

    public static BankAccount chooseBetterAccount(BankAccount a,BankAccount a1, BankAccount a2){
        BankAccount better;
        if(a1.getBalance() > a2.getBalance()){
            better = a1;
        } else {
            better = a2;
        }
        return better;
    }
}
