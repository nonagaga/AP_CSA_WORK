package Mod7;

import java.util.ArrayList;

public class StudentRunner {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();

        students.add("Mary");
        students.add("Sue");
        students.add("Rose");
        students.add(2,"Becca");
        students.add("Marla");
        students.add("Marla");
        students.add("Marla");

        System.out.println("Original Student List:\n");

        for (String student:students
             ) {
            System.out.println(student);
        }
        System.out.println();

        System.out.println("New Student List:\n");

        for (int i = 0; i < students.size(); i++) {
            if(students.get(i).equals("Marla")){
                students.remove(i);
                i--;
            }
        }
        
        System.out.println(students);
    }
}
