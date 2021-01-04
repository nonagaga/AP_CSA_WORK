package Projects;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Cereal {
    private String name;
    private String type;
    private int calories;
    private int protein;
    private int fat;
    private int sodium;
    private double fiber;
    private double carbs;
    private int sugar;
    private int potassium;
    private int vitamins;
    private int shelf;
    private double weight;
    private double cups;
    private double rating;

    public Cereal(String name, String type, int calories, int protein, int fat, int sodium,
                  double fiber, double carbs, int sugar, int potassium, int vitamins, int shelf,
                  double weight, double cups, double rating) {
        this.name = name;
        this.type = type;
        this.calories = calories;
        this.protein = protein;
        this.fat = fat;
        this.sodium = sodium;
        this.fiber = fiber;
        this.carbs = carbs;
        this.sugar = sugar;
        this.potassium = potassium;
        this.vitamins = vitamins;
        this.shelf = shelf;
        this.weight = weight;
        this.cups = cups;
        this.rating = rating;
    }

    public Cereal(String initName, int initCal, int initProtein,
                  double initWeight, double initCups, double initRating) {
        name = initName;
        type = "C";
        calories = initCal;
        protein = initProtein;
        fat = 0;
        sodium = 0;
        fiber = 0;
        carbs = 0;
        sugar = 0;
        potassium = 0;
        vitamins = 0;
        shelf = 0;
        weight = initWeight;
        cups = initCups;
        rating = initRating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public int getProtein() {
        return protein;
    }

    public void setProtein(int protein) {
        this.protein = protein;
    }

    public int getFat() {
        return fat;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }

    public int getSodium() {
        return sodium;
    }

    public void setSodium(int sodium) {
        this.sodium = sodium;
    }

    public double getFiber() {
        return fiber;
    }

    public void setFiber(double fiber) {
        this.fiber = fiber;
    }

    public double getCarbs() {
        return carbs;
    }

    public void setCarbs(double carbs) {
        this.carbs = carbs;
    }

    public int getSugar() {
        return sugar;
    }

    public void setSugar(int sugar) {
        this.sugar = sugar;
    }

    public int getPotassium() {
        return potassium;
    }

    public void setPotassium(int potassium) {
        this.potassium = potassium;
    }

    public int getVitamins() {
        return vitamins;
    }

    public void setVitamins(int vitamins) {
        this.vitamins = vitamins;
    }

    public int getShelf() {
        return shelf;
    }

    public void setShelf(int shelf) {
        this.shelf = shelf;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getCups() {
        return cups;
    }

    public void setCups(double cups) {
        this.cups = cups;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Cereal: " +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", calories=" + calories +
                ", cups=" + cups +
                ", rating=" + rating;
    }

    public static void main(String[] args) throws FileNotFoundException {
        Cereal FrostedFlakes = new Cereal("Frosted Flakes", "C", 110, 1, 0, 200, 1, 14, 11, 25, 25,
                1, 1, .75, 31.43597);
        System.out.println(FrostedFlakes);

        Scanner input = new Scanner(new File("Cereal.csv"));
        input.useDelimiter(",");
        input.useDelimiter("\n");

        while (input.hasNext()){
            System.out.print(input.next() + " ");
        }
        input.close();
    }
}
