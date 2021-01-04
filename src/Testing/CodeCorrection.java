package Testing;

import java.util.ArrayList;

public class CodeCorrection {

    /*
    public static int insertSort(ArrayList<String> list)
    {
        int count = 0;

        for (int i = 1; i < list.size(); i++)
        {
            String toInsert = list.get(i);
            int j;

            for (j = i; j > 0; j--)
            {
                count++;
                if (toInsert.compareTo(list.get(j-1)) >= 0)
                {
                    break;
                }
            }

            list.add(j, list.remove(i));
        }
        return count;
    }

     */

    public static int selectSort(double[] arr)
    {
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++)
        {
            int place = i;
            for (int j = i + 1; j < arr.length; j++)
            {
                count++;
                if (arr[j] < arr[place])
                {
                    place = j;
                }
            }
            double temp = arr[i];
            arr[i] = arr[place];
            arr[place] = temp;
        }
        return count;
    }

    public static int insertSort(double[] arr)
    {
        int count = 0;
        for (int i = 1; i < arr.length; i++)
        {
            double val = arr[i];
            int j;
            for (j = i - 1; j >= 0; j--)
            {
                count++;
                if (arr[j] > val)
                {
                    arr[j + 1] = arr[j];
                }
                else
                {
                    break;
                }
            }
            arr[j + 1] = val;
        }
        return count;
    }

    public static void sortAndPrint(String[] arr){
        //outer
        for (int i = 1; i < arr.length; i++) {
            //inner

            String movingElement = arr[i];
            int index = i-1;
            while(index >= 0 && arr[index].compareTo(movingElement) > 0){
                arr[index+1] = arr[index];
                index--;
            }
            arr[index+1]=movingElement;
            for (String word:arr
            ) {
                System.out.print(word + " ");
            }
            System.out.println();
        }
    }

    public static int insertSort(ArrayList<Integer> list) {

        int len = list.size();
        int count = 0;

        for (int i = 0; i < len - 1; i++) {

            int max_idx = i;

            count++;
            for (int j = i + 1; j < len; j++) {

                if (list.get(max_idx) < list.get(j)) {
                    max_idx = j;
                }
            }

            if (i != max_idx) {
                int temp = list.get(max_idx);
                list.set(max_idx, list.get(i));
                list.set(i, temp);
            }
        }

        return count;
    }

    public static void sort(int[] arr)
    {
        for (int j = arr.length - 2; j >= 0; j--)
        {
            int move = arr[j];
            int k = j + 1;

            while (k < arr.length && move > arr[k])
            {
                arr[k - 1] = arr[k]; /* Shuffle elements upwards */
                k++;
            }

            arr[k - 1] = move; /* Insert  value into position */
            /* end of for loop */
        }
    }

    public static void main(String[] args) {

        ArrayList<Integer> test = new ArrayList<>();

        test.add(5);
        test.add(4);
        test.add(3);
        test.add(2);
        test.add(1);

        System.out.println(test);
        System.out.println(insertSort(test));
        System.out.println(test);

        int[] arr = {5,4,3,2,1};
        sort(arr);

        /*

        ArrayList<String> strings = new ArrayList<>();
        //"drive", "computer", "memory", "algorithm"
        strings.add("drive");
        strings.add("computer");
        strings.add("memory");
        strings.add("algorithm");

        System.out.println(insertSort(strings));

        double[] arr = {3.5, 4.8, 2.1, 4.2};

        System.out.println(selectSort(arr));

        arr = new double[]{3.5, 4.8, 2.1, 4.2};

        System.out.println(insertSort(arr));

        String[] stringArray = {"hello","there","said","general","kenobi"};

        sortAndPrint(stringArray);

         */
    }
}
