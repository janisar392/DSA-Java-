import java.util.Scanner;

public class Rectangular_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of row");
        int m = sc.nextInt();
        System.out.println("Enter number of colomn");
        int n = sc.nextInt();
        for (int i = 1; i <= m ; i++){
            for (int j = 1; j<= n ; j++){
                System.out.print("🧡");
            }
            System.out.println();
        }

    }
}
