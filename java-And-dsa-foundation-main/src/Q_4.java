import java.util.Scanner;

public class Q_4 {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your First Subject marks");
        double Sub_1 = sc.nextInt();
        System.out.println("Enter your Second Subject marks");
        double Sub_2 = sc.nextInt();
        System.out.println("Enter your Third Subject marks");
        double Sub_3 = sc.nextInt();
        double n = Sub_1+Sub_2+Sub_3;
        System.out.println("your total marks is :"+n);
        double m = n*100;
        System.out.println("Your percentage is :"+m/300);

    }
}
