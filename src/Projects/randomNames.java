package Projects;

import java.util.ArrayList;
import java.util.Scanner;

public class randomNames {

    public void setNames(ArrayList<String> names) {
        names.add("Alia");
        names.add("Natali");
        names.add("Gabe");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (!scanner.nextLine().equals("q")){

            ArrayList<String> names = new ArrayList<>();

            names.add("Alia");
            names.add("Natali");
            names.add("Gabe");

            System.out.println(names.get((int)(Math.random()*3)));
        }
    }
}
