package Projects.ZeroCalc;

import java.util.ArrayList;

public class PolyTest {

    private ArrayList<Integer> values = new ArrayList<>();

    private int degree = 3;

    public void fillArray(){
        for (int i = 0; i < degree+1; i++){
            values.add((int) (Math.random() * 10));
        }
    }

    @Override
    public String toString() {
        String output = "";
        for (int i = values.size()-2; i > 0; i--) {
            output += values.get(i) + "x^" + i;
            if (Math.random() > 0.5){
                output += " + ";
            } else {
                output += " - ";
            }
        }
        output += values.get(values.size()-1);
        return output;
    }

    public static void main(String[] args) {
        PolyTest polyTest = new PolyTest();
        polyTest.fillArray();
        System.out.println(polyTest);
    }
}
