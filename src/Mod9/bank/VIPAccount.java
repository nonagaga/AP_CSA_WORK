package Mod9.bank;

public class VIPAccount extends Account {

    int points;

    public VIPAccount(){
        points = 1;
    }

    public VIPAccount(int points) {
        this.points = points;
    }

    public VIPAccount(int id, double balance, int points) {
        super(id, balance);
        this.points = points;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public boolean checkPoints(int cutoff){
        if (points >= cutoff){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "This VIP has " + points + " points." + "\n" + super.toString();
    }
}
