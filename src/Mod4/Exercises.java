package Mod4;

import java.util.Scanner;

public class Exercises {

    public Exercises(){

    }

    private long fib(int index){
        //Sum of two numbers before it
        long num1 = 0;
        long num2 = 1;
        long temp;

        for(int i = 0; i < index-1; i++){
            temp = num2;
            num2 += num1;
            num1 = temp;
        }

        return num2;
    }

    private String rev(String input){
        String rev = "";
        for(int i = input.length(); i > 0; i--){
            rev += input.substring(i-1,i);
        }
        return rev;
    }

    private void tri(int base){
        String output = "";
        for(int i = 0; i < base; i++){
            output += "*";
            System.out.println(output);
        }
    }

    public static void main(String[] args) {

        /*Exercises exercises = new Exercises();
        Scanner input = new Scanner(System.in);

        System.out.println("\n"+"What index of the Fibonacci sequence would you like to evaluate?");
        int index = input.nextInt();
        System.out.println(exercises.fib(index));

        Scanner input2 = new Scanner(System.in);

        System.out.println("\n"+"What string would you like to reverse?");
        String string = input2.nextLine();
        System.out.println(exercises.rev(string));

        System.out.println("\n"+"How big do you want your triangle's base to be?");
        int base = input.nextInt();
        exercises.tri(base);*/

        int numRounds = 4;
        int value = 5;
        for(int i = 0; i <= numRounds; i++){
            int output = 0;
            while(true){
                if (output == value) {
                    System.out.println();
                    break;
                }
                output = (int)(Math.random()*10);
                System.out.print(output);
            }
        }


    }
}
