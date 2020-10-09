package Mod3;

public class HouseRunner {
    public static void main(String[] args) {
        House myHouse = new House("Green", 1850,3);
        House annasHouse = new House("Green",1850,3);

        //My IDE won't run a compile unless variables have been initialized.
        House bobsHouse = null;


        House momsHouse = myHouse;

        if (myHouse == momsHouse){
            System.out.println("These are aliases for the same house object.");
        } else {
            System.out.println("These are two different objects.");
        }

        if (myHouse == annasHouse){
            System.out.println("These are aliases for the same house object.");
        } else {
            System.out.println("These are two different objects.");
        }

        if (myHouse != annasHouse){
            System.out.println("These are aliases for the same house object.");
        } else {
            System.out.println("These are two different objects.");
        }

        if (bobsHouse == null){
            System.out.println("This house hasn't been constructed yet.");
        } else {
            System.out.println("This house has been constructed.");
        }

        if (myHouse == null){
            System.out.println("This house hasn't been constructed yet.");
        } else {
            System.out.println("This house has been constructed.");
        }
    }
}
