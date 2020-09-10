package Mod1;

import java.util.Scanner;

public class Compounding {

    public static void main(String[] args) {

        int salary;
        Scanner input = new Scanner(System.in);

        while(true) {
            System.out.println("What is your base salary? ");
            input = new Scanner(System.in);
            try{
                salary = input.nextInt();
                break;
            }catch (Exception e){
                System.out.println("That isn't a valid input, try again.");
            }
        }
        System.out.println("Your base salary is: " + salary);
        salary += 10000;

        System.out.println("After signing bonus: " + salary);

        salary *= 1.1;
        System.out.println("After ten percent bonus: " + salary);

        salary -= 18000;
        System.out.println("After giving to charity: " + salary);

        salary /= 3;
        System.out.println("After Dividing three times: " + salary);

        salary %= 10;
        System.out.println("The last digit: " + salary);

        int num = 2;
        String binNum = Integer.toBinaryString(num);
        System.out.println("Your number in binary is: " + binNum);

        System.out.println("The maximum int value: " + (Integer.MAX_VALUE + 1) );
        System.out.println("The maximum int value: " + (Integer.MIN_VALUE - 1) );

    }
}
