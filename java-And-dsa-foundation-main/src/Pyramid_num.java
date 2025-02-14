import java.util.Scanner;

public class Pyramid_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {

            for (int j =1; j <n-i; j++) {
                System.out.print(" ");
            }
            for (int p = 1; p<=i; p++)
                System.out.print(p);
            for (int k = i-1; k >= 1; k--) {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
