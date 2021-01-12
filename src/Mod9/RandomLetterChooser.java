package Mod9;

public class RandomLetterChooser extends RandomStringChooser {

    public RandomLetterChooser(String word) {
        super(getSingleLetters(word));
    }

    public static String[] getSingleLetters(String string){
        String[] stringArray = new String[string.length()];

        for (int i = 0; i < string.length(); i++) {
            stringArray[i] = string.substring(i,i+1);
        }
        return stringArray;
    }
}
