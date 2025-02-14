package DSA.Recursion;

import java.util.Scanner;

public class lect_27 {

    static void printIncreasing(int n){
        if (n==1){
            System.out.println(1);
            return;
        }                                      // Print 1 to n :-
        printIncreasing(n-1);
        System.out.println(n);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();
        printIncreasing(n);
    }
}
