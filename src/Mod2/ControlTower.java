package Mod2;

import java.util.Scanner;

public class ControlTower {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Airplane airplane1 = new Airplane();

        System.out.println("Enter the details of the second airplane (call-sign, distance, bearing and altitude):");
        String callSign = input.nextLine().toUpperCase();
        double distance = input.nextDouble();
        int bearing = input.nextInt();
        int altitude = input.nextInt();

        Airplane airplane2 = new Airplane(callSign,distance,bearing,altitude);

        System.out.println("Initial Positions:");
        System.out.println("\"Airplane 1\": " + airplane1);
        System.out.println("\"Airplane 2\": " + airplane2);
        System.out.println("The distance between the planes is " + airplane1.distTo(airplane2) + " miles.");
        System.out.println("The difference in height between the planes is " +(Math.abs(airplane1.getAlt()-airplane2.getAlt())) + " feet.");

        airplane1.gainAlt();
        airplane1.gainAlt();
        airplane1.gainAlt();
        airplane1.gainAlt();

        airplane2.loseAlt();
        airplane2.loseAlt();

        airplane1.move(10.5,50);
        airplane2.move(8.0,125);

        System.out.println("New Positions:");
        System.out.println("\"Airplane 1\": " + airplane1);
        System.out.println("\"Airplane 2\": " + airplane2);
        System.out.println("The distance between the planes is " + airplane1.distTo(airplane2) + " miles.");
        System.out.println("The difference in height between the planes is " +(Math.abs(airplane1.getAlt()-airplane2.getAlt())) + " feet.");

    }
}
