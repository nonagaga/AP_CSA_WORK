package Mod1;

import java.lang.reflect.Array;
import java.util.Random;
import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {
        System.out.println("Hello World");


        //Declaration: assigns mem space
        String name;
        char initial;
        boolean programmingExperience;
        int gradeLevel;
        double gpa;

        programmingExperience = false;
        gradeLevel = 11;
        gpa = 2.9;

        Scanner input1 = new Scanner(System.in);
        System.out.println("Please input student name: ");
        name = input1.nextLine();

        Scanner input2;
        while (true) {
            System.out.println("Do you have programming experience? true/false: ");
            input2 = new Scanner(System.in);
            /*if (input2.nextLine() == "y"){
                programmingExperience = true;
                break;
            } else if (input2.nextLine() == "n"){
                programmingExperience = false;
                break;
            } else {*/
                try {
                    programmingExperience = input2.nextBoolean();
                    break;
                } catch (Exception e) {
                    System.out.println("\n That is not a valid input, try again. \n");
                }
        }
        while (true) {
            Scanner input3 = new Scanner(System.in);
            System.out.println("Please input Grade Level: ");
            try {
                gradeLevel = input3.nextInt();
                if(gradeLevel >= 9 && gradeLevel <= 12){
                    break;
                } else {
                    System.out.println("\n That is not a valid grade level, try again. \n");
                }
            } catch (Exception e) {
                System.out.println("\n That is not a valid input, try again. \n");
            }
        }

        while(true) {
            Scanner input4 = new Scanner(System.in);
            System.out.println("Please input GPA: ");
            try {
                gpa = input4.nextDouble();
                if(gpa >= 0 && gpa <= 6){
                    break;
                } else {
                    System.out.println("\n That is not a valid GPA, try again. \n");
                }
            } catch (Exception e) {
                System.out.println("\n That is not a valid input, try again. \n");
            }
        }

            System.out.println("Name: " + name);
            System.out.println("Programming Experience: " + programmingExperience);
            System.out.println("Grade Level: " + gradeLevel);
            System.out.println("GPA: " + gpa);

        }
    }
