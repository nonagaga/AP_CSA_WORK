package Mod10;

public class Recursion {

    public static int fib(int index){
        //Sum of two numbers before it
        int num1 = 0;
        int num2 = 1;
        int temp;

        for(int i = 0; i < index-1; i++){
            temp = num2;
            num2 += num1;
            num1 = temp;
        }

        return num2;
    }

    public static int recursionFib(int index){

        if(index == 1){
            return 0;
        } else if (index == 2){
            return 1;
        }

        return recursionFib(index-1) + recursionFib(index - 2);
    }

    public static void main(String[] args) {
        System.out.println(recursionFib(10));
    }
}
