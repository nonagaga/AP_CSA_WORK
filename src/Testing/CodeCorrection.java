package Testing;

import java.math.BigInteger;

class CodeCorrection{

    private static BigInteger fib(int index){
        //Sum of two numbers before it
        BigInteger num1 = BigInteger.valueOf(0);
        BigInteger num2 = BigInteger.valueOf(1);
        BigInteger temp;

        for(int i = 0; i < index-1; i++){
            temp = num2;
            num2 = num2.add(num1);
            num1 = temp;
        }

        return num2;
    }

    public static void main(String[] args) {
        for(int i = 0; i <= 1000; i++){
            System.out.println((CodeCorrection.fib(i)));
        }
    }
}