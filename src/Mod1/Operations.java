package Mod1;
import java.util.Scanner;

public class Operations {
    public static void main(String[] args){

        int num1, num2;
        int add, sub, mult, modulus;
        double div;

        Scanner input = new Scanner(System.in);
        System.out.println("Number 1:");
        num1 = input.nextInt();
        System.out.println("Number 2:");
        num2 = input.nextInt();

        System.out.println("You chose numbers " + num1 + " and " + num2 + ".");

        add = num1 + num2;
        sub = num1 - num2;
        mult = num1 * num2;
        div = (double)num1 / num2;
        modulus = num1 % num2;

        System.out.println("Your sum is: " + add);
        System.out.println("Your diff is: " + sub);
        System.out.println("Your product is: " + mult);
        System.out.println("Your quotient is: " + div);
        System.out.println("Your modulus is: " + modulus);

    }
}
