package Projects.Liar_Dice;

import com.sun.javaws.exceptions.InvalidArgumentException;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static int[][] diceValues;
    public static Bid previousBid = new Bid();

    static String[] nameArray = new String[4];
    static int numPlayers;
    static Scanner input = new Scanner(System.in);
    public static boolean gameOver = false;

    /**
     *
     * @param player the index of the player in the nameArray. (Player 1 is 0, Player 2 is 1, etc)
     *
     *               On their turn, a player can do two things:
     *               A. Bid a higher quantity of the same face, or any particular quantity of a higher face."
     *               B. Call the previous bidder a "Liar". The die will be revealed, and the previous bid checked."
     */
    public static void onTurn(int player) {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println(nameArray[player] + "'s turn! Press any key to continue.");
        String confirm = input.nextLine();
        String selection;
        while (true) {
            while (true) {
                try {
                    System.out.println("You rolled: " + Arrays.toString(diceValues[player]));
                    System.out.println("Your options are: " +
                            "\nA. Bid a higher quantity of the same face, or any particular quantity of a higher face." +
                            "\nB. Call the previous bidder a \"Liar\". The die will be revealed, and the previous bid (" + previousBid + ") checked.");
                    selection = input.nextLine().toUpperCase();
                    if (!(selection.contains("A") ||
                            selection.contains("B") ||
                            selection.contains("C") ||
                            selection.contains("D"))) {
                        throw new IllegalArgumentException();

                    }
                    break;
                } catch (Exception e) {
                    System.out.println("Invalid selection, pick a letter (A-D)!");
                }
            }
            if (selection.contains("A")) {
                System.out.println("What would you like to bid? (Ex. Five Fives, Three Twos, Five Sixs)");
                while (true) {
                    String proposedBidString = input.nextLine();
                    try {
                        Bid proposedBid = (parseBid(proposedBidString));
                        if (proposedBid.higherThan(previousBid)){
                            System.out.println("Bid was successful!");
                            previousBid = proposedBid;
                            break;
                        }
                        System.out.println("Bid is too low!");
                        throw new Exception();

                    } catch (Exception e) {
                        System.out.println("Invalid bid, make sure to type your bid out properly! (Quantity, FaceValue + s)");
                    }
                }
                break;
            } else if (selection.contains("B")) {
                System.out.println("Are you sure you want to call " + nameArray[previousPlayer(player)] + " a liar? (Y/N)");
                selection = input.nextLine().toUpperCase();
                if (selection.contains("Y")) {
                    //verify if bet was legit
                    break;
                }
            }
        }
    }

    private static int previousPlayer(int currentPlayer) {
        if (currentPlayer - 1 < 0) {
            currentPlayer = numPlayers - 1;
        } else {
            currentPlayer--;
        }
        return currentPlayer;
    }

    private static Bid parseBid(String proposedBid) throws Exception {

        String faceString = proposedBid.substring(0, proposedBid.indexOf(" "));
        String quantityString;

        //checks to see if String proposedBid is a valid argument
        if (!faceString.substring(0, 3).equalsIgnoreCase("one")) {
            quantityString = proposedBid.substring(proposedBid.indexOf(" ") + 1, proposedBid.indexOf("s"));
            if (!proposedBid.contains(" ")){
                throw new IllegalArgumentException();
            }
        } else {
             quantityString = proposedBid.substring(proposedBid.indexOf(" ") + 1);
        }


        try {
            return new Bid(parseInt(faceString), parseInt(quantityString));
        } catch (Exception e){
            throw e;
        }


    }

    private static int parseInt(String numInString) {
        if (numInString.equalsIgnoreCase("one")) {
            return 1;
        } else if (numInString.equalsIgnoreCase("two")) {
            return 2;
        } else if (numInString.equalsIgnoreCase("three")) {
            return 3;
        } else if (numInString.equalsIgnoreCase("four")) {
            return 4;
        } else if (numInString.equalsIgnoreCase("five")) {
            return 5;
        } else if (numInString.equalsIgnoreCase("six")) {
            return 6;
        } else if (numInString.equalsIgnoreCase("seven")) {
            return 7;
        } else if (numInString.equalsIgnoreCase("eight")) {
            return 8;
        } else if (numInString.equalsIgnoreCase("nine")) {
            return 9;
        } else if (numInString.equalsIgnoreCase("ten")) {
            return 10;
        } else if (numInString.equalsIgnoreCase("eleven")) {
            return 11;
        } else if (numInString.equalsIgnoreCase("twelve")) {
            return 12;
        } else if (numInString.equalsIgnoreCase("thirteen")) {
            return 13;
        } else if (numInString.equalsIgnoreCase("fourteen")) {
            return 14;
        } else if (numInString.equalsIgnoreCase("fifteen")) {
            return 15;
        } else if (numInString.equalsIgnoreCase("sixteen")) {
            return 16;
        } else if (numInString.equalsIgnoreCase("seventeen")) {
            return 17;
        } else if (numInString.equalsIgnoreCase("eighteen")) {
            return 18;
        } else if (numInString.equalsIgnoreCase("nineteen")) {
            return 19;
        } else if (numInString.equalsIgnoreCase("twenty")) {
            return 20;

        } else return -1;
    }

    public static void title() {
        System.out.println("   __ _            _         ___ _          \n" +
                "  / /(_) __ _ _ __( )__     /   (_) ___ ___ \n" +
                " / / | |/ _` | '__|/ __|   / /\\ / |/ __/ _ \\\n" +
                "/ /__| | (_| | |   \\__ \\  / /_//| | (_|  __/\n" +
                "\\____/_|\\__,_|_|   |___/ /___,' |_|\\___\\___|\n" +
                "                                            "
        );
    }

    public static void setup(int numPlayers) throws InterruptedException {
        if (numPlayers > 4 || numPlayers < 2) {
            throw new InputMismatchException();
        }

        Main.numPlayers = numPlayers;

        for (int i = 1; i <= numPlayers; i++) {

            System.out.println("Player " + i + "'s nickname is: ");
            input = new Scanner(System.in);
            nameArray[i - 1] = input.nextLine();

        }


        System.out.print("Setup Complete! Playing with: ");
        for (int i = 1; i <= numPlayers; i++) {
            System.out.print(nameArray[i - 1]);
            if (i != numPlayers) {
                System.out.print(", ");
            } else {
                System.out.println();
            }
        }

        diceValues = new int[numPlayers][5];

        for (int i = 0; i < diceValues.length; i++) {
            for (int j = 0; j < diceValues[i].length; j++) {
                diceValues[i][j] = (int) (Math.random() * 6 + 1);
            }
        }

        System.out.println("\nThe die have been cast! May luck be on 'yer side!");
    }


    public static void main(String[] args) {
        title();

        while (true) {
            try {
                input = new Scanner(System.in);
                System.out.println("How many players? (2-4)");
                setup(input.nextInt());
                break;
            } catch (Exception e) {
                System.out.println("That's an invalid player count! Try again with (1-4) players.");
            }
        }

        int currentPlayer = 0;
        while (!gameOver){
            if (currentPlayer == numPlayers) {
                currentPlayer = 0;
            }
            onTurn(currentPlayer);
            currentPlayer++;
        }

    }


}

class Bid {
    int faceValue;
    int quantity;

    public Bid(){
        faceValue = 0;
        quantity = 0;
    }

    public Bid(int faceValue, int quantity) throws Exception {
        if (faceValue < 1 || faceValue > 6){
            throw new Exception();
        }
        this.faceValue = faceValue;
        this.quantity = quantity;
    }

    public boolean verify() {
        int count = 0;
        for (int i = 0; i < Main.diceValues.length; i++) {
            for (int j = 0; j < Main.diceValues[0].length; j++) {
                if (Main.diceValues[i][j] == faceValue) {
                    count++;
                }
            }
        }
        return count >= quantity;
    }

    public boolean higherThan(Bid anotherBid) {
        return (   //Bid a higher quantity of the same face
                this.quantity > anotherBid.quantity && this.faceValue == anotherBid.faceValue) ||
                ( //Bid any quantity of a higher face
                        this.faceValue > anotherBid.faceValue
                );
    }

    private String numberToString(int number) {
        if (number == 1) {
            return "one";
        } else if (number == 2) {
            return "two";
        } else if (number == 3) {
            return "three";
        } else if (number == 4) {
            return "four";
        } else if (number == 5) {
            return "five";
        } else if (number == 6) {
            return "six";
        } else if (number == 7) {
            return "seven";
        } else if (number == 8) {
            return "eight";
        } else if (number == 9) {
            return "nine";
        } else if (number == 10) {
            return "ten";
        } else if (number == 11) {
            return "eleven";
        } else if (number == 12) {
            return "twelve";
        } else if (number == 13) {
            return "thirteen";
        } else if (number == 14) {
            return "fourteen";
        } else if (number == 15) {
            return "fifteen";
        } else if (number == 16) {
            return "sixteen";
        } else if (number == 17) {
            return "seventeen";
        } else if (number == 18) {
            return "eighteen";
        } else if (number == 19) {
            return "nineteen";
        } else if (number == 20) {
            return "twenty";
        } else {
            return "NOT A NUMBER 1-20";
        }
    }

    @Override
    public String toString() {

        if (faceValue == 0 || quantity == 0){
            return "nonexistent";
        }

        return numberToString(faceValue) +
                " " + numberToString(quantity) + "s";
    }
}
