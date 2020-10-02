package Mod3;

import javax.swing.*;

public class TaxReturnTester {
    public static void main(String[] args) {
        String input1 = JOptionPane.showInputDialog("Please enter your income: ");
        String input2 = JOptionPane.showInputDialog("Are you married? (y/n): ");

        int income = Integer.parseInt(input1);
        boolean married = false;

        if(input2.equals("y")) married = true;

        TaxReturn client1 = new TaxReturn(income, married);

        System.out.println("You owe: " + client1.getTax());
    }
}
