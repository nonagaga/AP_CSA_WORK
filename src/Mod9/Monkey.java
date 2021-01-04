package Mod9;

public class Monkey extends Animal {

    int socialization;

    public Monkey(){
        super();
    }

    public Monkey(boolean alive, double weight, String hairColor, int socialization) {
        super(alive, weight, hairColor);
        this.socialization = socialization;
    }

    public int getSocialization() {
        return socialization;
    }

    public void setSocialization(int socialization) {
        this.socialization = socialization;
    }

    @Override
    public String findMe() {
        return "Find me in the Monkey Wing";
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Socialization = " + socialization;
    }
}
