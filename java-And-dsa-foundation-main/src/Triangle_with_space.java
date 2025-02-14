import java.util.Scanner;

public class Triangle_with_space {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i =1; i<=n;i++){
        for (int j = 1; j <= n-i; j++){
            System.out.print(" ");
        }
        for (int k=i ; k <=i; k++){
            System.out.print(k);
        }
            System.out.println();
        }
    }
}
