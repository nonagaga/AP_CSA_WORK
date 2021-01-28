package Mod9.UltimateFrisbee;

public class UltimatePlayer extends Person{
    private int jerseyNumber;
    private String position;
    private static int numPlayers = 1;

    public UltimatePlayer(String firstName, String lastName, String position){
        super(firstName,lastName);
        if(!position.equals("handler") && !position.equals("cutter")){
            this.position = "handler";
        } else {
            this.position = position;
        }
        jerseyNumber = numPlayers;
        numPlayers++;
    }

    public String getPosition(){
        return position;
    }

    public int throwDisc(int pow){
        return Person.clamp(1,10,pow*4);
    }

    public String toString(){
        return super.toString() + "\n.  Jersey #: " + jerseyNumber + "\n.  Position: " + position;
    }


}