package Mod2;

import java.util.Scanner;

public class U2_L3_A4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a sentence: ");
        String string = input.nextLine();

        int l = string.indexOf(" ");
        System.out.println("Your first word is of length: " + l);

        int l2 = string.indexOf(" ",l+1);
        System.out.println("Your second word is of length: " + (l2 - l - 1));

        String text = "doggy dog world";
        System.out.println(text.substring(text.length()-1));
    }
}
