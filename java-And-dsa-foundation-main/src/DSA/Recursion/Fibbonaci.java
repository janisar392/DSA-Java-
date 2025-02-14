package DSA.Recursion;

import java.util.Scanner;

public class Fibbonaci {

    // base  or halting condition
    static int fibb(int n){
        if (n==0 || n == 1) {
            return n;
        }
        // small work
       int prev = fibb(n-1);
        int beforePrev = fibb(n-2);

        // self work

        int ans = prev + beforePrev;
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();
        System.out.println(fibb(6));
    }
}
