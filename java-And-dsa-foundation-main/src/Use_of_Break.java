import java.util.Scanner;

public class Use_of_Break {
    public static void main(String[] args) {
        int n ,i,j ;
        System.out.println("Enter a Number");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for( i = 1; i <= n; i++) {
            for( j = 1; j <= n+1; j++) {
                System.out.print(j);
                if (i == j) break;
            }
            System.out.println();

        }
    }
}
