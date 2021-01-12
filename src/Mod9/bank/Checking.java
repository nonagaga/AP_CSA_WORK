package Mod9.bank;

public class Checking extends Account {

    private int numChecks;

    public Checking(){
        super();
        numChecks = 0;
    }

    public Checking(int id, double balance, int numChecks) {
        super(id, balance);
        this.numChecks = numChecks;
    }

    public Checking(int numChecks) {
        this.numChecks = numChecks;
    }

    public int getNumChecks() {
        return numChecks;
    }

    public void setNumChecks(int numChecks) {
        this.numChecks = numChecks;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nNumber of Checks = " + numChecks + "\n";
    }


}
