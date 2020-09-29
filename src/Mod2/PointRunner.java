package Mod2;

import java.util.Scanner;

public class PointRunner {
    public static void main(String[] args) {
        /*Scanner input = new Scanner(System.in);

        System.out.println("Give me x1:");
        double x1 = input.nextDouble();

        System.out.println("Give me y1:");
        double y1 = input.nextDouble();

        System.out.println("Give me x2:");
        double x2 = input.nextDouble();

        System.out.println("Give me y2:");
        double y2 = input.nextDouble();

        Point p1 = new Point(x1,y1);
        Point p2 = new Point(x2,y2);

        System.out.println("Your slope is: " + p1.getSlope(p2));
        System.out.println("Your distance is: " + p1.getDistance(p2));*/

        double random = Math.random();

        System.out.println("My random number between 0 and 1.0: " + random);

        int random6 = (int) (random * 7);

        System.out.println("My random number between 0 and 6: " + random6);
    }
}
