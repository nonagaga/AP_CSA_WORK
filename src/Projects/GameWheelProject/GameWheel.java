package Projects.GameWheelProject;

import java.util.ArrayList;
import java.util.Random;

public class GameWheel {
    private ArrayList<Slice> slices; // List of slices making up the wheel
    private int currentPos;   // Position of currently selected slice on wheel


    /* Returns string representation of GameWheel with each numbered slice
     * on a new line
     */
    public String toString() {
        //Implement the toString method here
        String output = "";
        for (int i = 0; i < slices.size(); i++) {
            output += i + " - " + getSlice(i).toString() + "\n";
        }
        return output;
    }


    /* Randomizes the positions of the slices that are in the wheel, but without
     * changing the pattern of the colors
     */
    public void scramble() {
        ArrayList<Slice> red = new ArrayList<>();
        ArrayList<Slice> blue = new ArrayList<>();
        ArrayList<Slice> black = new ArrayList<>();

        splitColors(red, blue, black);
        
        shuffle(red);
        shuffle(blue);
        shuffle(black);

        combineColors(red, blue, black);
    }

    /* Sorts the positions of the slices that are in the wheel by prize amount,
     * but without changing the pattern of the colors.
     */
    public void sort () {
        ArrayList<Slice> red = new ArrayList<>();
        ArrayList<Slice> blue = new ArrayList<>();
        ArrayList<Slice> black = new ArrayList<>();
        
        splitColors(red,blue,black);
        
        selectionSort(red);
        selectionSort(blue);
        selectionSort(black);

        combineColors(red,blue,black);
    }

    private void combineColors(ArrayList<Slice> red, ArrayList<Slice> blue, ArrayList<Slice> black) {
        int redCount = 0;
        int blueCount = 0;
        int blackCount = 0;

        for (int i = 0; i < slices.size(); i++) {
            if (i % 5 == 0) {
                slices.set(i, (black.get(blackCount)));
                blackCount++;
            }
            else if (i % 2 == 1) {
                slices.set(i, red.get(redCount));
                redCount++;
            }
            else {
                slices.set(i, blue.get(blueCount));
                blueCount++;
            }
        }
    }

    private void splitColors(ArrayList<Slice> red, ArrayList<Slice> blue, ArrayList<Slice> black) {
        for (int i = 0; i < slices.size(); i++) {
            if (i % 5 == 0)
                black.add(getSlice(i));
            else if (i % 2 == 1)
                red.add(getSlice(i));
            else
                blue.add(getSlice(i));
        }
    }

    public void shuffle(ArrayList<Slice> toChange) {

        Random random = new Random();

        for (int i = toChange.size()-1; i > 0; i--) {
            int randIndex = random.nextInt(i);

            Slice temp = toChange.get(i);
            toChange.set(i,toChange.get(randIndex));
            toChange.set(randIndex,temp);
        }
    }

    public void selectionSort(ArrayList<Slice> toSort){
        //outer
        for (int i = 0; i < toSort.size()-1; i++) {
            int smallestIndex = i;
            //inner
            for (int j = i+1; j < toSort.size(); j++) {
                if(toSort.get(j).getPrizeAmount() < toSort.get(smallestIndex).getPrizeAmount()){
                    smallestIndex = j;
                }
            }
            //swap
            Slice temp = toSort.get(i);
            toSort.set(i, toSort.get(smallestIndex));
            toSort.set(smallestIndex,temp);
        }
    }

        

        /* COMPLETED METHODS - YOU DO NOT NEED TO CHANGE THESE */

        /* Creates a wheel with 20 preset slices
         */
    public GameWheel()
        {
            this(getStandardPrizes());
        }

        /* Creates a wheel with 20 slices, using values from array parameter
         */
    public GameWheel( int[] prizes)
        {
            currentPos = 0;
            slices = new ArrayList<Slice>();
            for (int i = 0; i < 20; i++) {
                int pa = 0;
                String col = "blue";
                if (i < prizes.length)
                    pa = prizes[i];
                if (i % 5 == 0)
                    col = "black";
                else if (i % 2 == 1)
                    col = "red";
                slices.add(new Slice(col, pa));
            }
        }

        /* Spins the wheel by so that a different slice is selected. Returns that
         * slice (Note: the 10 slices following the current slice are more likely to
         * be returned than the other 10).
         */
        public Slice spinWheel ()
        {
            //spin power between range of 1-50 (inclusive)
            int power = (int) (Math.random() * 50 + 1);
            int newPos = (currentPos + power) % slices.size();
            currentPos = newPos;
            return slices.get(currentPos);
        }

        public Slice getSlice ( int i){
            int sliceNum = i;
            if (i < 0 || i > 19)
                sliceNum = 0;
            return slices.get(sliceNum);
        }

        // Makes an array with a standard list of prizes
        private static int[] getStandardPrizes ()
        {
            int[] arr = new int[20];
            for (int i = 0; i < 20; i++) {
                if (i % 5 == 0)
                    arr[i] = i * 1000;
                else if (i % 2 == 1)
                    arr[i] = i * 100;
                else
                    arr[i] = i * 200;
            }
            return arr;
        }
}
