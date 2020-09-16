package Projects;

public class ZoomRunner {
    public static void main(String[] args) {
        ZoomClass p1 = new ZoomClass();
        p1.setTeacher("Reich");
        p1.setSubject("English");
        p1.setUrl("www.zoom.com");
        p1.setPassword("12345");
        p1.setDuration(90);
        p1.setTime("8:30");
        p1.setDate(17);
        p1.setMonth(9);
        p1.setYear(2020);
        p1.setFriendInClass(true);

        ZoomClass p2 = new ZoomClass("Prado", "Calculus", "www.teams.com", "", 90, "8:30", 16,9,2020,true);
        p2.setTeacher("Ms. " + p2.getTeacher());
        p2.setSubject("Math");
        p2.setUrl("");
        p2.setPassword("I forgot");
        p2.setDuration(110);
        p2.setTime("9:30");
        p2.setMin(45);
        p2.setDate(18);

        p1.print();
        p2.print();
    }
}
