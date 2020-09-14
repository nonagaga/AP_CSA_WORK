package Mod2;

public class CircleRunner {
    public static void main(String[] args){

        Circle myFirstCircle = new Circle(310, "black");
        Circle mySecondCircle = new Circle(200, "white");

        System.out.println("First circle's stats: ");
        myFirstCircle.circleStats();
        System.out.println("Second circle's stats: ");
        mySecondCircle.circleStats();
    }
}
