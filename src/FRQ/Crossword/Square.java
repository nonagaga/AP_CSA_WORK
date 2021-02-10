package FRQ.Crossword;

public class Square {
    private boolean isBlack;
    private int num;

    public Square(boolean isBlack, int num) {
        this.isBlack = isBlack;
        this.num = num;
    }

    @Override
    public String toString() {
        return "isBlack = " + isBlack +
                ", num = " + num + "\t";
    }
}
