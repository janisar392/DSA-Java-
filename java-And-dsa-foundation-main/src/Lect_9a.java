import java.util.Scanner;

public class Lect_9a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i = 1 ; i<= n; i++){
            for (int j= 1 ; j<=m ; j++){
                if ((i+j)%2==0){
                    System.out.print("1");
                } else
                    System.out.print("2");
            }
            System.out.println();
        }
    }
}
