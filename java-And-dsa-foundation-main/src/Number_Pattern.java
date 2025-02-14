import java.util.Scanner;

public class Number_Pattern {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1 ; i <= n; i++){
            for (int j = i ; j<= n ; j++){
                System.out.print(j);
            }
            for (int k = 1; k <= i-1;k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
