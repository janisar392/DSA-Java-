package DSA.Recursion;

import java.util.Scanner;

public class EvenOdd {
    static void chekOddEven(int n){
        if(n==1) {
            System.out.println("odd");
            return;
        }if(n==0) {
            System.out.println("even");
            return;
        }
        chekOddEven(n-2);


       }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        chekOddEven(n);
    }
}
