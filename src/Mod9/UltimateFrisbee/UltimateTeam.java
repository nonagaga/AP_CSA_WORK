package Mod9.UltimateFrisbee;

// Don't forget, you will need to import the ArrayList class to implement the UltimateTeam class
import java.util.ArrayList;

public class UltimateTeam {
    private ArrayList<UltimatePlayer> players;
    private ArrayList<Coach> coaches;

    public UltimateTeam(ArrayList<UltimatePlayer> players, ArrayList<Coach> coaches){
        this.players = players;
        this.coaches = coaches;
    }

    public String getCutters(){
        String output = "";

        for(UltimatePlayer player : players){
            if(player.getPosition() == "cutter"){
                output += player.toString() + "\n";
            }
        }
        return output;
    }

    public String getHandlers(){
        String output = "";

        for(UltimatePlayer player : players){
            if(player.getPosition() == "handler"){
                output += player + "\n";
            }
        }
        return output;
    }

    public String toString(){
        String output = "";

        output += "COACHES" + "\n";

        for(Coach coach : coaches){
            output += coach.toString() + "\n";
        }

        output += "\n" + "PLAYERS" + "\n";

        for(UltimatePlayer player : players){
            output += player.toString() + "\n";
        }
        return output;
    }
}