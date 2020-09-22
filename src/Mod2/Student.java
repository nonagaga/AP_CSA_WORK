package Mod2;

public class Student {
    //Attributes
    private String name;
    private double gpa;
    private boolean isMale;

    //Empty Constructor
    public Student(){

    }

    //Parameterized Constructor
    public Student(String name, double gpa, boolean isMale){
        this.name = name;
        this.gpa = gpa;
        this.isMale = isMale;
    }

    //Overloading Constructor
    public Student(String name, double gpa){
        this.name = name;
        this.gpa = gpa;
    }

    public String getName(){
        return name;
    }

    public double getGpa(){
        return gpa;
    }

    public boolean getGender(){
        return isMale;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setMale(boolean male) {
        isMale = male;
    }



    public void setGpa(double g) {
        gpa = g;
    }

    public void print(){
        System.out.println("Student: " + getName() + "\nGPA: " + getGpa() + "\nGender: " + getGender() + "\n");
    }

    public static void main(String [] args){
        Student student1 = new Student("Max",3.1,true);
        student1.print();

        Student student2 = new Student("Jenny", 2.0,false);
        student2.setGpa(3.0);
        student2.print();

        Student student3 = new Student();
        student3.print();

        Student student4 = new Student("Name",3.0);
        student4.print();
    }

}
