package Mod8;

import java.util.ArrayList;
import java.util.Random;

public class TwoDArrays {

    public static double randomDouble(){
            return (Math.random()*900 + 100);
    }

    public static void main(String[] args) {
        double[][] doubledoublelist = new double[5][5];

        for (int i = 0; i < doubledoublelist.length; i++) {
            for (int j = 0; j < doubledoublelist[i].length; j++) {
                doubledoublelist[i][j] = randomDouble();
            }
        }

        String output = "";

        for (double[] doubleList:doubledoublelist
             ) {
            for (double number:doubleList
                 ) {
                output += number + " ";
            }
            output += "\n";
        }

        System.out.println(output);
    }
}
