package Mod6;

import java.util.Scanner;

public class ArrayFormatter {
    /**
     * This is some code I wrote to wrap a list of text
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a list of words, separated by commas.");
        String list = input.nextLine();
        int spaceCount = 0;
        String[] words;

        for (int i = 0; i < list.length()-1; i++) {
            if (list.substring(i, i + 2).equals(", ")) {
                spaceCount++;
            }
        }

        words = new String[spaceCount +1];

        int j = 0, k = 0;
        for (int i = 0; i < words.length-1; i++) {
            boolean foundSpace = false;
            while(!foundSpace) {
                if (list.substring(j, j + 2).equals(", ")) foundSpace = true;
                j++;
            }
            words[i] = list.substring(k,j-1);
            k = j;
        }

        words[words.length-1] = list.substring(j+1);
        System.out.print("Array of words: {");
        for (int i = 0; i < words.length-1; i++) {
            System.out.print("\"" + words[i] + "\"");
            if(i < words.length-2){
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }

}
