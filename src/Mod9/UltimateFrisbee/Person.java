package Mod9.UltimateFrisbee;

public class Person{

    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int throwDisc(int pow){
        return clamp(1,10,pow*2);
    }

    public static int clamp(int min, int max, int val){
        if(val < min){
            return min;
        } else if(val > max){
            return max;
        } else {
            return val;
        }
    }

    public String toString(){
        return lastName + ", " + firstName;
    }

}
