package Mod9;

public class Homosapien extends Monkey {

    private String ethnicity;
    private String language;

    public Homosapien() {
        super();
        super.setSocialization(100);
    }

    public Homosapien(String ethnicity, String language){
        super();
        super.setSocialization(100);
        this.ethnicity = ethnicity;
        this.language = language;
    }

    public Homosapien(boolean alive, double weight, String hairColor, int socialization, String ethnicity, String language) {
        super(alive, weight, hairColor, socialization);
        this.ethnicity = ethnicity;
        this.language = language;
    }

    @Override
    public String findMe() {
        return "Find me roaming the Zoo!";
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Ethnicity = " + ethnicity +
                ", Language = " + language;
    }
}
