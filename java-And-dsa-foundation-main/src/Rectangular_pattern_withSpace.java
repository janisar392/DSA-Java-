import java.util.Scanner;

public class Rectangular_pattern_withSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rows");
        int n = sc.nextInt();
        System.out.println("Enter Column");
        int m = sc.nextInt();
        for (int i= 1; i <= n ; i++) {
            for (int j = 1; j <= m; j++) {
                if (i == 1 || i == n || j == 1 || j == m)
                    System.out.print(" 💚 ");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
