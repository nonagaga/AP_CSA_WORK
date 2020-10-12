package Mod4;

import java.util.Scanner;

public class InvestmentRunner {
    public static void main(String[] args) {
        final double RATE = 3;

        Scanner input = new Scanner(System.in);
        System.out.println("Client 1, what is your initial balance?");
        String init_bal_string = input.nextLine();
        double init_bal_double = Double.parseDouble(init_bal_string);

        System.out.println("Client 1, what is your desired balance?");
        String fin_bal_string = input.nextLine();
        double fin_bal_double = Double.parseDouble(fin_bal_string);

        Investment client1 = new Investment(init_bal_double,RATE);
        client1.waitForBalance(fin_bal_double);
        System.out.println("You'll have to wait " + client1.getYears() + " years to reach " + fin_bal_double);

        System.out.println("Client 2, what is your initial balance?");
        String init_bal_string2 = input.nextLine();
        double init_bal_double2 = Double.parseDouble(init_bal_string2);

        System.out.println("Client 2, how long do you want to invest?");
        String fin_bal_string2 = input.nextLine();
        int fin_yr_int = Integer.parseInt(fin_bal_string2);

        Investment client2 = new Investment(init_bal_double2,RATE);
        client2.waitYears(fin_yr_int);
        System.out.println("You'll have " + client2.getBalance() + " after " + client2.getYears() + " years");
    }
}
