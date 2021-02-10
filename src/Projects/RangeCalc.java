package Projects;

/* Program to calculate the range of a projectile, neglecting air resistance. */
public class RangeCalc {
    public static double calculateRange(double speed, double angleInDegrees) {
        double g, angleInRads, range; // declare three variables
        g = 9.8; // SI units
        angleInRads = angleInDegrees * Math.PI / 180;
        range = 2 * speed * speed *
                Math.sin(angleInRads) * Math.cos(angleInRads) / g; System.out.println("Range = " + range + " meters");

                return range;
    }



    public static void main(String[] arg) {
        Plot plot = new Plot("Angle vs Range",0,90,15,0,400,10);
        for (int i = 0; i < 90; i++) {
            plot.addPoint(i,calculateRange(i, calculateRange(20,i)));
        }
    } }
