package Mod9;

public class Animal {
    private boolean alive;
    private double weight;
    private String hairColor;

    public Animal(){
        alive = true;
    }

    public Animal(boolean alive, double weight, String hairColor) {
        this.alive = alive;
        this.weight = weight;
        this.hairColor = hairColor;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String findMe(){
        return "Find me in the West Wing";
    }

    @Override
    public String toString() {
        return
                "Alive? " + alive +
                ", Weight = " + weight +
                ", Hair Color = " + hairColor;
    }
}
