package Mod6;

import java.lang.reflect.Array;

public class ArrayExercises {
    public static void printArray(String[] array){
        for (String word:array
             ) {
            System.out.println(word);
        }
    }

    public static void printArray(String[] array, double percent){
        for (int i = 0; i < array.length; i++) {
            if((i/array.length)*100 <= percent){
                System.out.println(array[i]);
            } else {
                return;
            }
        }
    }

    public static void main(String[] args) {
        //1
        int[] array = new int[10000 / 5];
        for (int i = 0; i < array.length; i++) {
            array[i] = 5*(i+1);
        }
        for (int num: array
             ) {
            System.out.println(num);
        }
        //2
        String[] array2 = new String[100];
        for (int i = 1; i <= array2.length; i++) {
            if((i)%5 == 0){
                array2[i-1] = "You Win";
            } else {
                array2[i-1] = String.valueOf(i);
            }
        }
        printArray(array2,10);
    }

}
