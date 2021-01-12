package Mod4;

import java.util.Scanner;

public class Exercises {

    public Exercises(){

    }

    private static long fib(int index){
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

    private static void tri(int base){
        String output = "";
        for(int i = 0; i < base; i++){
            output += "*";
            System.out.println(output);
        }
    }

    public static void main(String[] args) {
        System.out.println(Exercises.fib(1000000000));
        Exercises.tri(10);
    }
}
