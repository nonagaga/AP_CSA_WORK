package Projects;

import com.sun.tools.corba.se.idl.StringGen;

import java.util.Scanner;

public class ZoomRunner {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ZoomClass p1 = new ZoomClass();
        p1.setTeacher("Reich");
        p1.setSubject("English");
        p1.setUrl("www.zoom.com");
        p1.setPassword("12345");
        p1.setDuration(90);
        p1.setTime("8:30");
        p1.setDate(17);
        p1.setMonth(9);
        p1.setYear(2020);
        p1.setFriendInClass(true);

        ZoomClass p2 = new ZoomClass("Prado", "Calculus", "www.teams.com", "", 90, "8:30", 16,9,2020,true);
        p2.setTeacher("Ms. " + p2.getTeacher());
        p2.setSubject("Math");
        p2.setUrl("");
        p2.setPassword("I forgot");
        p2.setDuration(110);
        p2.setTime("9:30");
        p2.setMin(45);
        p2.setDate(18);

        ZoomClass p3 = new ZoomClass();
        System.out.println("Who is your third period teacher?");
        p3.setTeacher(input.nextLine());
        System.out.println("What is your third period subject?");
        p3.setSubject(input.nextLine());
        System.out.println("What is your third period zoom url?");
        p3.setUrl(input.nextLine());
        System.out.println("What is the zoom password?");
        p3.setPassword(input.nextLine());
        System.out.println("How long is your third period class in minutes?");
        p3.setDuration(input.nextInt());

        //Errors out here for some reason
        /*System.out.println("What time is your third period class? (ex. 12:15)");
        String response = input.nextLine();
        p2.setTime("9:30"); */


        System.out.println("What date is your third period class? (12/~~/~~)");
        p3.setDate(input.nextInt());
        System.out.println("What month is your third period class?");
        p3.setMonth(input.nextInt());
        System.out.println("What year is your third period class?");
        p3.setYear(input.nextInt());
        System.out.println("Do you have a friend in your third period class?");
        String response = input.nextLine();

        if (response == "Yes" || response == "yes"){
            p3.setFriendInClass(true);
        } else if (response == "No" || response == "no"){
            p3.setFriendInClass(false);
        }

        p1.print();
        p2.print();
        p3.print();
    }
}
