package DSA.Recursion;

import java.util.Scanner;

public class printnumber {
    static int printnum(int n){
        //base case
        if(n==0){
            return 0;
        }
        System.out.println(n);
      int  small_ans = printnum(n-1);
      return small_ans;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n :");
        int n = sc.nextInt();
        printnum(n);

    }
}
