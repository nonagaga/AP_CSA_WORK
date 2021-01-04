package Mod9;

public class ZooRunner {
    public static void main(String[] args) {
        Animal animal1 = new Animal(true,104,"Red");
        System.out.println(animal1);

        Monkey monkey1 = new Monkey(true,104,"Red",100);
        System.out.println(monkey1);

        System.out.println(animal1.findMe());

        System.out.println(monkey1.findMe());

        Homosapien human = new Homosapien(true,120,"Brown",100,"Hispanic","English");

        System.out.println(human);

        System.out.println(human.findMe());
    }
}
