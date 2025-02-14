import java.util.Scanner;

public class Calculator_ques {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n >= 0 && n <= 30){
            System.out.println("F");
        } else if (n> 30 && n <= 40) {
            System.out.println("E");
        } else if (n > 40 && n <= 50) {
            System.out.println("D");
        } else if (n > 50 && n <=60) {
            System.out.println("C");
        } else if (n > 60 && n <=70) {
            System.out.println("B");
        } else if (n > 70 && n <=80) {
            System.out.println("B+");
        } else if (n > 80 && n <=90) {
            System.out.println("A");
        } else if (n > 90 && n <=100) {
            System.out.println("A+");
        } else
            System.out.println("Enter number between 100 to 0");
    }
}
