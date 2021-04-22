package Projects;

import java.util.ArrayList;

public class Bench {
    public static void main(String[] args) {

        char[] array = new char[1000000000];

        double start = System.currentTimeMillis();

        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0){
                break;
            }
        }

        double end = System.currentTimeMillis();

        System.out.println(end-start);
    }
}
