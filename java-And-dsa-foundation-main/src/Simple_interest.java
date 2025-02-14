import java.util.Scanner;

public class Simple_interest {
    public static void main(String[] arg){
        double p , r , t , S_I;
        System.out.println("Enter the Principle ");
        Scanner sc = new Scanner(System.in);
        p = sc.nextDouble();
        System.out.println("Enter the Rate");
        r = sc.nextDouble();
        System.out.println("Enter the Time");
        t = sc.nextDouble();

        S_I = (p*r*t)/100;
        System.out.println("Simple interest is : "+S_I);
    }
}
