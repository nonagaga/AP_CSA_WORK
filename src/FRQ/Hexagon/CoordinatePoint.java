package FRQ.Hexagon;

public class CoordinatePoint {
    private double x,y;

    public CoordinatePoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return roundTwoPlaces(x);
    }

    public double getY() {
        return roundTwoPlaces(y);
    }

    private double roundTwoPlaces(double d){
        return Math.round(d*100)/100.0;
    }

    @Override
    public String toString() {
        return "CoordinatePoint{" +
                "x=" + roundTwoPlaces(x) +
                ", y=" + roundTwoPlaces(y) +
                '}';
    }
}
