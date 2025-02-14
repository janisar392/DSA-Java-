import java.util.Scanner;

public class prac_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        if (n<0) {
            System.out.println("The number is negative and skipped");
        }
        else {
            System.out.println(n);
        }
    }
}
