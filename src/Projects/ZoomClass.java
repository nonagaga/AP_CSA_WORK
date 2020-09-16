package Projects;

public class ZoomClass {
    //Attributes
    String teacher;
    String subject;
    String url;
    String password;
    int duration;
    String time;
    String[] timeArray;
    int hour, min;
    int date, month, year;
    boolean friendInClass;

    //Empty Constructor
    ZoomClass(){

    }

    //Parameterized Constructor
    ZoomClass(String teacher, String subject, String url, String password, int duration, String time, int date, int month, int year, boolean friendInClass){
        this.teacher = teacher;
        this.subject = subject;
        this.url = url;
        this.password = password;
        this.duration = duration;
        this.time = time;
        this.date = date;
        this.month = month;
        this.year = year;
        this.friendInClass = friendInClass;

    }

    //Methods

    //Getters

    public String getTeacher(){
        return teacher;
    }
    public String getSubject(){
        return subject;
    }
    public String getUrl(){
        return url;
    }
    public String getPassword(){
        return password;
    }
    public int getDuration(){
        return duration;
    }

    public int getHour() {
        return hour;
    }

    public int getMin() {
        return min;
    }

    public int getDate(){
        return date;
    }
    public int getMonth(){
        return month;
    }
    public int getYear(){
        return year;
    }
    public boolean isFriendInClass(){
        return friendInClass;
    }

    //Setters

    public void setTeacher(String teacher){
         this.teacher = teacher;
    }
    public void setSubject(String subject){
        this.subject = subject;
    }
    public void setUrl(String url){
        this.url = url;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public void setDuration(int durationInMin){
        this.duration = durationInMin;
    }

    public void setTime(String time) {
        this.time = time;
        timeArray = time.split(":",2);
        hour = Integer.parseInt(timeArray[0]);
        min = Integer.parseInt(timeArray[1]);
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setDate(int date){
        this.date = date;
    }
    public void setMonth(int month){
        this.month = month;
    }
    public void setYear(int year){
        this.year = year;
    }
    public void setFriendInClass(boolean friendInClass){
        this.friendInClass = friendInClass;
    }

    //printers

    public void printDuration(){
        int durHours = duration/60;
        int durMin = duration%60;
        System.out.println("Duration: "+durHours+"hr"+durMin+"min");

    }

    public void print(){
        System.out.println("Teacher: " + getTeacher());
        System.out.println("Subject: " + getSubject());
        System.out.println("URL: " + getUrl());
        System.out.println("Password: " + getPassword());
        printDuration();
        System.out.println("Time: " + getHour() + ":" + getMin());
        System.out.println("Date: " + getDate()+ "/" + getMonth() + "/" + getYear());
        System.out.println("Friend?: " + isFriendInClass() + "\n");
    }

}
