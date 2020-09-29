package Mod2;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getSlope(Point point){
        //Delt_Y / Delt_X

        return ((y-point.getY())/(x-point.getX()));
    }

    public double getDistance(Point point){
        double delta_x = x - point.getX();
        double delta_y = y - point.getY();
        return (Math.sqrt(Math.pow(delta_x,2)+Math.pow(delta_y,2)));
    }
}
