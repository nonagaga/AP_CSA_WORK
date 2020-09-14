package Mod2;

public class Circle {

    //attributes
    private double radius;
    private final double pi = Math.PI;
    private String color;

    //constructor
    public Circle(double r, String c){
        radius = r;
        color = c;
    }

    public Circle(){
        radius = 0;
    }

    //methods

    public void circleStats(){
        System.out.println("Radius: " + getRadius());
        System.out.println("Area: " + getArea());
        System.out.println("Color: " + getColor());
    }

        //getters
    public double getRadius() {
        return radius;
    }

    public double getArea(){
        return radius*radius*pi;
    }

    public String getColor(){
        return color;
    }

        //setters
    public void setRadius(double r){
        radius = r;
    }
    public void setColor(String c){
        color = c;
    }
}
