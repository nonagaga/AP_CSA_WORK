package Projects.GameWheelProject;

import java.util.ArrayList;

public class Game
{
    public static void play(GameWheel g)
    {
        ArrayList<Slice> results = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            results.add(g.spinWheel());
        }

        int total = 0;
        for (Slice slice:results
             ) {
            total += slice.getPrizeAmount();
        }

        boolean bonus = false;
        if (results.get(0).getColor().equals(results.get(1).getColor()) && results.get(0).getColor().equals(results.get(2).getColor())){
            total*=2;
            bonus = true;
    }

        String output = "Total prize money: $" + total + "\n" + "\n";

        for (int i = 0; i < results.size(); i++) {
            output += "Spin " + (i+1) + " - " + results.get(i).toString() + "\n";
        }

        if (bonus){
            output += "Three " + results.get(0).getColor() + "s = double your money!";
        }

        System.out.println(output);
    }
}