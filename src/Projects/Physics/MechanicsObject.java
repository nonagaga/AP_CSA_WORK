package Projects.Physics;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class MechanicsObject {

    private double mass;
    private double xPos;
    private double yPos;
    private double xVel;
    private double yVel;

    final private double g = -9.8;

    private ArrayList<Double> xForces = new ArrayList<>();
    private ArrayList<Double> yForces = new ArrayList<>();


    public MechanicsObject(double mass, double xPos, double yPos, double xVel, double yVel, ArrayList<Double> xForces, ArrayList<Double> yForces, boolean gravity) {
        if (mass > 0) {
            this.mass = mass;
        } else {
            this.mass = 1;
        }
        this.xPos = xPos;
        this.yPos = yPos;
        this.xVel = xVel;
        this.yVel = yVel;

        if (gravity)
            yForces.add(g * mass);
    }

    public MechanicsObject(double mass, double xPos, double yPos, double xVel, double yVel) {
        if (mass > 0) {
            this.mass = mass;
        } else {
            this.mass = 1;
        }
        this.xPos = xPos;
        this.yPos = yPos;
        this.xVel = xVel;
        this.yVel = yVel;

        yForces.add(g * mass);
    }

    public MechanicsObject(double mass, double xPos, double yPos) {
        if (mass > 0) {
            this.mass = mass;
        } else {
            this.mass = 1;
        }
        this.xPos = xPos;
        this.yPos = yPos;
        xVel = 0;
        yVel = 0;

        yForces.add(g * mass);
    }

    public MechanicsObject(double mass) {
        if (mass > 0) {
            this.mass = mass;
        } else {
            this.mass = 1;
        }
        xPos = 0;
        yPos = 0;
        xVel = 0;
        yVel = 0;

        yForces.add(g * mass);
    }

    public MechanicsObject() {
        mass = 1;
        xPos = 0;
        yPos = 0;
        xVel = 0;
        yVel = 0;

        yForces.add(g * mass);
    }

    public double getNetXForce() {
        if (xForces.size() == 0){
            return 0;
        }

        double sum = 0;
        for (Double force : xForces
        ) {
            sum += force;
        }
        return sum / xForces.size();
    }

    public double getNetYForce() {
        if (yForces.size() == 0){
            return 0;
        }

        double sum = 0;
        for (Double force : yForces
        ) {
            sum += force;
        }
        return sum / yForces.size();
    }

    public void addForce(double f, boolean onX) {
        if (onX) {
            xForces.add(f);
        } else {
            yForces.add(f);
        }
    }

    public void setxVel(double xVel) {
        this.xVel = xVel;
    }

    public void setyVel(double yVel) {
        this.yVel = yVel;
    }


    public void statsAtTime (double time) {
        ArrayList<Double> velocityEquationX = new ArrayList<>(Arrays.asList(getNetXForce(), xVel));
        Polynomial xVelocity = new Polynomial(velocityEquationX);
        System.out.println("X Velocity Changed by " + xVelocity.valueAt(time) + " after " + time + " seconds.");

        ArrayList<Double> velocityEquationY = new ArrayList<>(Arrays.asList(getNetYForce(), yVel));
        Polynomial yVelocity = new Polynomial(velocityEquationY);
        System.out.println("Y Velocity Changed by " + yVelocity.valueAt(time) + " after " + time + " seconds.");
    }
}
