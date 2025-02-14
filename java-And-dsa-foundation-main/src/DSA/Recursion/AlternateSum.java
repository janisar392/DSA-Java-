package DSA.Recursion;

import java.util.Scanner;

public class AlternateSum {
    static int MainQues(int n){
        if (n==1){
            return 1 ;
        }
        if (n%2==0){
            return MainQues(n-1) - n ;
        }
        return MainQues(n-1)+ n;
    }

    static int flowupQues(int n){
        if (n==0){
            return 0;
        }
        return flowupQues(n-1) + n ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();
    //    System.out.println("Total sum in series : "+flowupQues(n));
        System.out.println(" Alternate sum : "+MainQues(n));
    }
}
