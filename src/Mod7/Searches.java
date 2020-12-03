package Mod7;

import java.util.ArrayList;

public class Searches {

    /**
     * returns a random number between min and max, inclusive.
     * @param min the minimum number that can be returned
     * @param max the maximum number that can be returned
     * @return a random number between min and max, inclusive.
     */

    public static int getRandom(int min, int max){
        return (int) (min + (max-min+1)*Math.random());
    }

    /**
     * populates ArrayList arraylist with random values for however many indexes
     * @param arrayList the instantiated arraylist passed to the method
     * @param indexes the number of indexes we want filled with random numbers
     */

    public static void populateAL(ArrayList<Integer> arrayList, int indexes){
        for (int i = 0; i < indexes; i++){
            arrayList.add(getRandom(0,10));
        }
    }

    public static void populateALOrdered(ArrayList<Integer> arrayList, int indexes){
        for (int i = 0; i < indexes; i++) {
            arrayList.add(getRandom(10*(i),10*i+10));
        }
    }

    /**
     * linear sort algorithm that goes through an arrayList linearly
     * to find the first index of value num, returns -1 if not found.
     *
     * @param arrayList the instantiated arraylist passed to the method
     * @param num the integer we find
     * @return i if found, -1 if not
     */
    public static int getIndexLinear(ArrayList<Integer> arrayList, int num){
        for (int i = 0; i < arrayList.size(); i++) {
            if(arrayList.get(i)==num){
                return i;
            }
        }
        return -1;
    }

    /**
     * Prerequisite: ArrayList must be in order
     * Uses a binary sort to search for int num, returns -1 if not found.
     * @param arrayList arraylist given
     * @param num number we're searching for
     * @return
     */

    public static int getIndexBinary(ArrayList<Integer> arrayList, int num){
        int left = 0;
        int right = arrayList.size()-1;

        while(left <= right){
            int middle = left + (right-left)/2;

            if (arrayList.get(middle)==num){
                return middle;
            } else if(num > middle) {
                left = middle+1;
            } else {
                right = middle - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        ArrayList<Integer> data = new ArrayList<>();

        double startTime = System.currentTimeMillis();

        populateALOrdered(data,100000000);

        double endTime = System.currentTimeMillis();

        System.out.println("That took: " + (endTime-startTime) + " milliseconds!");

        //for (int i:data
          //   ) {
            //System.out.println(i);
        //}

        System.out.println();

        startTime = System.currentTimeMillis();

        System.out.println(getIndexLinear(data, 5));

        endTime = System.currentTimeMillis();

        System.out.println("That took: " + (endTime-startTime) + " milliseconds!");

        startTime = System.currentTimeMillis();

        System.out.println(getIndexBinary(data, 5));

        endTime = System.currentTimeMillis();

        System.out.println("That took: " + (endTime-startTime) + " milliseconds!");
    }
}
