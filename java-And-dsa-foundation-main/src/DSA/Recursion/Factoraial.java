package DSA.Recursion;

import java.util.Scanner;

public class Factoraial {

    static int factorial(int n){
        if (n == 0){
            return 1 ;
        }
        // Smaller problem
        int smallAns = factorial(n-1);

        //Self Work
        int Ans = n * smallAns;
        return Ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        System.out.println(factorial(n));

    }
}
