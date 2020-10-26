package Mod4;

import java.util.Scanner;

public class TextCompressor {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //Buffer Spaces
        String tweet = input.nextLine().toLowerCase();

        /*=========================================
                        Algorithm 1*/

        String noVowel1 = "";
        String algorithm1 = "";
        int vCompressed1 = 0;
        int dCompressed1 = 0;

        for (int i = 0; i < tweet.length(); i++) {
            if (
                    (tweet.substring(i, i + 1)).equals("a") ||
                            (tweet.substring(i, i + 1)).equals("e") ||
                            (tweet.substring(i, i + 1)).equals("i") ||
                            (tweet.substring(i, i + 1)).equals("o") ||
                            (tweet.substring(i, i + 1)).equals("u")
            ) {
                if (i == 0 || (tweet.substring(i - 1, i).equals(" "))) {
                    noVowel1 += tweet.substring(i, i + 1);
                } else {
                    vCompressed1++;
                }
            } else {
                noVowel1 += tweet.substring(i, i + 1);
            }
        }

        noVowel1 += " ";

        for (int j = 0; j < noVowel1.length()-1; j++) {
            if (noVowel1.substring(j, j+1).equals(noVowel1.substring(j+1, j + 2))) {
                algorithm1 += noVowel1.substring(j, j + 1);
                j++;
                dCompressed1++;
            } else {
                algorithm1 += noVowel1.substring(j, j + 1);
            }
        }

        /*=========================================
                        Algorithm 2*/

        String algorithm2 = "";
        String blacklist = " ";
        String toBlacklist = "";

        //Each letter in original string
        for(int k = 0; k < tweet.length(); k++) {
            boolean unique = true;
            blacklist += toBlacklist;
            toBlacklist = "";
            int count = 1;
            //Each letter after current letter
            for (int l = k + 1; l < tweet.length(); l++) {
                //If current letter equals any letter after it
                if (tweet.substring(k, k + 1).equals(tweet.substring(l, l + 1))) {
                    count++;
                    if (count == 2) {
                        toBlacklist += tweet.substring(k, k + 1);
                    }
                }
            }

            for (int m = 0; m < blacklist.length(); m++) {
                if (tweet.substring(k, k + 1).equals(blacklist.substring(m, m + 1))) {
                    unique = false;
                }
            }

            if (unique) {
                algorithm2 += count;
                algorithm2 += tweet.substring(k, k + 1);
            }
        }

        int cCompressed = tweet.length() - algorithm2.length();
        int uCharacters = (algorithm2.length() / 2);

        System.out.println("Algorithm 1");
        System.out.println("Vowels removed: " + vCompressed1);
        System.out.println("Repeats removed: " + dCompressed1);
        System.out.println("Algorithm 1 message: "+ algorithm1);
        System.out.println("Algorithm 1 characters saved: "+ (vCompressed1+dCompressed1));

        System.out.println("\nAlgorithm 2");
        System.out.println("Unique characters found: " + uCharacters);
        System.out.println("Algorithm 2 message: " + algorithm2);
        System.out.println("Algorithm 2 characters saved: " + cCompressed);
    }
}
