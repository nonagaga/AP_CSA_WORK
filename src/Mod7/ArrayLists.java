package Mod7;

import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        double[] grades = new double[5];
        grades[0] = 2.3;
        grades[1] = 3.5;
        grades[2] = 1.3;
        grades[3] = 3.3;
        grades[4] = 4.0;

        ArrayList<Double> grades_AL = new ArrayList<Double>();

        grades_AL.add(3.2);
        grades_AL.add(2.2);
        grades_AL.add(3.0);
        grades_AL.add(3.8);
        grades_AL.add(2.5);
        grades_AL.add(0,5.0);


        ArrayList<String> students_AL = new ArrayList<String>();

        students_AL.add("Andy");
        students_AL.add("Dan");
        students_AL.add("Kathie");
        students_AL.add("Jen");
        students_AL.add("Leo");

        students_AL.add(0, "Gabriel");
        students_AL.set(0,"Gabe");

        System.out.println("Removed: " + students_AL.remove(3) + " : " + grades_AL.remove(3));

        for (int i = 0; i < students_AL.size(); i++) {
            System.out.println(students_AL.get(i) + " : " + grades_AL.get(i));
        }


    }
}
