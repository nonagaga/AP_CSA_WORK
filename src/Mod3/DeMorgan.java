package Mod3;

public class DeMorgan {
    public static void main(String[] args) {
        int x = 2;
        int y = 3;

        System.out.println(!(x < 3 && y > 2));

        //DeMorgan Transformation
        System.out.println((!(x < 3) || !(y > 2)));

        //Rewrite without "!"
        System.out.println(((x >= 3) || (y <= 2)));


        int a = 4;
        int b = 11;
        System.out.println(!((a>5) || (b != 10)));

        //DeMorgan Transformation
        System.out.println(!(a>5) && !(b!=10));

        //Rewrite without "!"
        System.out.println((a<=5) && (b==10));
    }
}
