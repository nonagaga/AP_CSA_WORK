package Mod9;

import java.util.ArrayList;

public class RandomStringChooser {

    private ArrayList<String> wordList = new ArrayList<>();

    public RandomStringChooser(String[] wordList) {
        for (String string:wordList
             ) {
            this.wordList.add(string);
        }
    }

    public String getNext(){
        try {
            return wordList.remove((int) (Math.random() * wordList.size()));
        } catch (Exception e){
            return "NONE";
        }
    }

    public static void main(String[] args) {
        String[] wordArray = {"random","words","are","cool"};
        RandomStringChooser random = new RandomStringChooser(wordArray);
        for (int i = 0; i < 6; i++) {
            System.out.print(random.getNext() + " ");
        }
    }
}