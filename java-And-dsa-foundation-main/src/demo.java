class student
{
    String  name;
    int   rollNO;
    int marks;
}

public class demo{
    public static void main(String[] args) {

        student std1 = new student();

        std1.name = "janisar";
        std1.rollNO= 118;
        std1.marks= 81;

        student std2 = new student();

        std2.name = "akhtar";
        std2.rollNO= 118;
        std2.marks= 85;

        student std3 = new student();

        std3.name = "fatma";
        std3.rollNO= 96;
        std3.marks= 88;

        student[] students = new student[3];
        students[0] = std1;
        students[1] = std2;
        students[2] = std3;

        for(student val : students){
            System.out.println(val.name + " : "+val.marks);
        }
    }
}
