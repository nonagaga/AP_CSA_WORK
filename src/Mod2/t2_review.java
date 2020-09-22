package Mod2;

public class t2_review {
    public static void main(String[] args) {
        int myVar = 10;
        myVar++;

        System.out.println("Default double: " + myVar);
        Student s1 = new Student("Alan",2.0,false);
        s1.setGpa(3);
        s1.print();

        Student s2;
        s2 = s1;
        s1.setGpa(10);
        s2.print();

        s2 = new Student();
        s2.print();

        s1.setName("Becky");
        s1.setGpa(1.2);
        s1.print();
        s2.print();
    }
}
