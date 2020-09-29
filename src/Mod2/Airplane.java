package Mod2;

public class Airplane{
    private double distance;
    private int direction;
    private int altitude;
    private String callSign;

    public Airplane(String cs, double dist, int dir, int alt){
        distance = Math.abs(dist);
        direction = dir % 360;
        altitude = Math.abs(alt);
        callSign = cs;
    }

    public Airplane(){
        this("AAA01", 1, 0, 0);
    }

    public void gainAlt(){
        altitude += 1000;
    }

    public void loseAlt(){
        altitude -= 1000;
        if(altitude < 0)
            altitude = 0;
    }

    public int getAlt(){
        return altitude;
    }

    public void move(double dist, int dir){
        double r1 = distance;
        double r2 = dist;
        double u1 = Math.toRadians(direction);
        double u2 = Math.toRadians(dir);
        distance = Math.sqrt(r1*r1 + r2*r2 + 2*r1*r2*Math.cos(u2-u1));
        double ang = Math.atan2(r1*Math.sin(u1) + r2*Math.sin(u2), r1*Math.cos(u1) + r2*Math.cos(u2));
        direction = Math.floorMod((int) Math.round(Math.toDegrees(ang)), 360);
    }

    public String toString(){
        String s = callSign + " - ";
        s += (double)Math.round(100*distance)/100;
        s += " miles away at bearing ";
        if(direction < 100)
            s += "0";
        if(direction < 10)
            s += "0";
        s += direction + "\u00b0, altitude " + altitude + " feet";
        return s;
    }

    public double distTo(Airplane other){

        double r1 = this.distance;
        double r2 = other.distance;
        double u1 = Math.toRadians(this.direction);
        double u2 = Math.toRadians(other.direction);
        double between = Math.sqrt(r1*r1 + r2*r2 - 2*r1*r2*Math.cos(u2-u1));
        return (double)Math.round(100*between)/100;
    }
}
