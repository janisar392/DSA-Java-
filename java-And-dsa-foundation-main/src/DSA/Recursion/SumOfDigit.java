package DSA.Recursion;

import java.util.Scanner;

public class SumOfDigit {

    static int SOD(int n){
        if (n/10 == 0 )
            return n ;

        // small problem
        int SmallAns = SOD(n/10);
        // self work
        int ans = SmallAns + n % 10 ;
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();
        System.out.println(SOD(n));
    }
}
