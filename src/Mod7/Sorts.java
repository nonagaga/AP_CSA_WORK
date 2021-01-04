package Mod7;

public class Sorts {
    int[] arr;

    public Sorts(int n){
        arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*200);
        }
    }

    public void selectionSort(){
        //outer
        for (int i = 0; i < arr.length-1; i++) {
            int smallestIndex = i;
            //inner
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] < arr[smallestIndex]){
                    smallestIndex = j;
                }
            }
            //swap
            int temp = arr[i];
            arr[i] = arr[smallestIndex];
            arr[smallestIndex] = temp;
        }
    }

    public void insertionSort(){
        //outer
        for (int i = 1; i < arr.length; i++) {
            //inner
            int movingElement = arr[i];
            int index = i-1;
            while(index >= 0 && arr[index] > movingElement){
                arr[index+1] = arr[index];
                index--;
            }
            arr[index+1]=movingElement;
        }
    }

    public static void main(String[] args) {
        Sorts sorter = new Sorts(100);
        sorter.insertionSort();

        for (int i = 0; i < sorter.arr.length; i++) {
            System.out.print(sorter.arr[i] + " ");
        }
    }
}
