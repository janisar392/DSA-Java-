public class Student {
    int rollNo;
    String studentName;
}
class Student2{
    public static void main(String[] args) {
        Student obj1 = new Student();
        Student obj2 = new Student();
        obj1.rollNo= 100 ;
        obj1.studentName="janisar";
        obj2.rollNo=101;
        obj2.studentName="Akhtar";
        System.out.println(obj1.rollNo+" " + obj1.studentName);
        System.out.println(obj2.rollNo+" " + obj2.studentName);
    }
}
