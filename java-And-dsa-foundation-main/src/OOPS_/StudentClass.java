package OOPS_;

public class StudentClass {
    public static class student{
        String name ;
        int   roll_NO;
        double percentage;
    }

    public static void main(String[] args) {
        student s1 = new student();  // creating object using new keyword
        s1.name = "janisar";
        s1.roll_NO = 118;
        s1.percentage = 81.5;

        student s2 = new student();
        s2.name = "Akhtar";
        s2.roll_NO = 004;
        s2.percentage = 99.8;

        System.out.println(s2.name);   // printing data 
    }
}
