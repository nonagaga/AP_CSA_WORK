package Mod9.UltimateFrisbee;

public class Captain extends UltimatePlayer {
    private boolean type;

    public Captain(String firstName, String lastName, String position, boolean type){
        super(firstName, lastName, position);
        this.type = type;
    }

    public int throwDisc(int pow){
        return Person.clamp(1,10,pow*5);
    }

    public String toString(){
        String stringType = "";

        if(type){
            stringType = "offense";
        } else {
            stringType = "defense";
        }

        return super.toString() + "\n.  Captain: " + stringType;
    }
}
