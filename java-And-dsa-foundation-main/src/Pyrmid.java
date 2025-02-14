import java.util.Scanner;

public class Pyrmid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int r = sc.nextInt();
        for (int i = 1 ; i <= r ; i ++){
            //print space r-i
            for (int j = 1; j <= r-i ; j++){
                System.out.print("  ");
            }


            //print stars 2i-1
                for (int k = 1 ; k <= (2*i-1) ; k++){
                    System.out.print("💛");
                }

            System.out.println();
        }

    }
}
