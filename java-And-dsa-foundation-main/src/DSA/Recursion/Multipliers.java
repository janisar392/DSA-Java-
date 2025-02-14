package DSA.Recursion;

import java.util.Scanner;

public class Multipliers {

    static void multiplier(int n , int p){
        // base case
        if (p==0){
            System.out.println(0);
            return;
        }
        if (p==1){
            System.out.println(n);
            return;
        }
        multiplier(n,p-1);
        System.out.println(n*p);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        System.out.println("How many times multiplier : ");
        int p = sc.nextInt();
        multiplier(n,p);

    }
}
