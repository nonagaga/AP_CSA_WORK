package Mod3;

import javax.swing.*;



public class TaxReturnTester {

    static int password = 12345;

    public static void main(String[] args) {
        String input1 = JOptionPane.showInputDialog("Please enter your income: ");
        String input2 = JOptionPane.showInputDialog("Are you married? (y/n): ");
        String input3 = JOptionPane.showInputDialog("Please enter password: ");
        String input4 = JOptionPane.showInputDialog("Please enter position: ");
        String input5 = JOptionPane.showInputDialog("Please enter SSN: ");

        if(!(Integer.parseInt(input3) == password && input4.equalsIgnoreCase("manager"))){
            System.out.println("Invalid Credentials");
            System.exit(0);
        }

        int income = Integer.parseInt(input1);

        if(income < 0 || income > 1000000000){
            System.out.println("Invalid Income");
            System.exit(0);
        }


        boolean married = false;

        if(input2.equals("y")) married = true;

        int ssn = Integer.parseInt(input5);

        TaxReturn client1 = new TaxReturn(income, married, ssn);
        TaxReturn client2 = new TaxReturn(45000, false, 990);
        TaxReturn client3 = new TaxReturn(45000, false, 990);

        System.out.println("Same Client: " + client2.equals(client3));

        JFrame f = new JFrame();
        JOptionPane.showMessageDialog(f,"You owe: " + client1.getTax());

        System.out.println("You owe: " + client1.getTax());
    }
}
