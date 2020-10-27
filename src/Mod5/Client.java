package Mod5;

public class Client {

    String name;
    int ssn;

    public Client(String name, int ssn){
        this.name = name;
        this.ssn = ssn;
    }

    public Client(){
        this.name = "Default Name";
        this.ssn = 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public String getName() {
        return name;
    }

    public int getSsn() {
        return ssn;
    }

    @Override
    public String toString() {
        return
                "name = '" + name + '\'' +
                ", ssn = " + ssn;
    }
}
