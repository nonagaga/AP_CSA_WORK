package FRQ.Hexagon;

import java.util.ArrayList;

public class RegularHexagon {

    private ArrayList<CoordinatePoint> points = new ArrayList<>();

    public RegularHexagon(double radius){
        for (int degree = 0; degree < 360; degree += 60) {
            points.add(new CoordinatePoint(radius*Math.cos(Math.toRadians(degree)), radius*Math.sin(Math.toRadians(degree))));
        }
    }

    public RegularHexagon(ArrayList<CoordinatePoint> points) {
        this.points = points;
    }

    public double getSideLength(){
        return roundTwoPlaces(Math.sqrt(Math.pow((points.get(1).getX()-points.get(0).getX()),2) + Math.pow((points.get(1).getY()-points.get(0).getY()),2)));
    }

    public double getArea(){
        return roundTwoPlaces((Math.pow(this.getSideLength(),2) * 3 * Math.sqrt(3))/2);
    }

    public CoordinatePoint getCenter(){
        CoordinatePoint point0 = points.get(0);
        CoordinatePoint point3 = points.get(3);
        return new CoordinatePoint((point0.getX()+point3.getX())/2, (point0.getY()+point3.getY())/2);
    }

    @Override
    public String toString() {
        return "RegularHexagon \n" +
                "points = " + points + "\n" +
                "side length = " + getSideLength() + "\n" +
                "area = " + getArea() + "\n" +
                "center = " + "(" + getCenter().getX() + ", " + getCenter().getY() + ")";
    }

    private double roundTwoPlaces(double d){
        return Math.round(d*100)/100.0;
    }

    public static void main(String[] args) {

        RegularHexagon hexagon = new RegularHexagon(5);
        System.out.println(hexagon);
    }
}
