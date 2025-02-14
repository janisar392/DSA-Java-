package DSA.Recursion;

import java.util.Scanner;

public class PowerOfDigit {
    //---------------------Better Time Complexity --------------------------------
    static int pow(int n , int p){
        if (p==0)
            return 1;

        int small_Ans = pow(n ,p/2 );
        if (p%2==0)
            return small_Ans * small_Ans;

        return n * small_Ans*small_Ans;
    }
    //-------------------------------------------------------------------------------
    static int powerOfDigit(int n , int p){
        // Base Case
        if (p==0)
            return 1 ;
//        if (p==1)       // it is optional if you want to terminate at power 1
//            return n;
        // Small Work
        int smallAns = powerOfDigit(n, p-1);
        // Self Work
        int ans = n * smallAns;
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();
        System.out.println("Enter the value of power : ");
        int p = sc.nextInt();


        System.out.println("General Way : "+powerOfDigit(n,p));


        System.out.println("Better time Complexity : " + pow(n , p));
    }
}
