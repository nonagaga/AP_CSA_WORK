package FRQ.Crossword;

import java.util.Random;
import java.util.Scanner;

public class Crossword {
    private Square[][] puzzle;

    public Crossword(boolean[][] blackSquares) {

        int height = blackSquares.length;
        int width = blackSquares[0].length;

        puzzle = new Square[height][width];

        int counter = 1;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (blackSquares[i][j]){
                    puzzle[i][j] = new Square(true, 0);
                } else if (toBeLabeled(i,j, blackSquares)){
                    puzzle[i][j] = new Square(false, counter);
                    counter++;
                } else {
                    puzzle[i][j] = new Square(false, 0);
                }
            }
        }
    }

    private boolean toBeLabeled(int r, int c, boolean[][] blackSquares){

        if(!blackSquares[r][c]) {
            if (r == 0 || r != 0 && blackSquares[r - 1][c]) {
                return true;
            }
            if (c == 0 || c != 0 && blackSquares[r][c-1]){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        boolean[][] blackSquares = new boolean[5][5];
        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                 int randInt = random.nextInt(10);
                 if (randInt < 8){
                     blackSquares[i][j] = false;
                 } else {
                     blackSquares[i][j] = true;
                 }
            }
        }

        Crossword crossword = new Crossword(blackSquares);

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(crossword.puzzle[i][j]);
            }
            System.out.println();
        }
    }
}
