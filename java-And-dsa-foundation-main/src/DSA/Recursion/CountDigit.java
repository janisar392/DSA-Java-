package DSA.Recursion;

import java.util.Scanner;

public class CountDigit {
    static int Count_Digit(int n){
        if (n<10 && n >= 0)
            return 1 ;

        // small Ans
        int Small_Ans = Count_Digit(n/10);

        // self work
        int ans = 1 + Small_Ans;

        return ans ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = sc.nextInt();
        System.out.println(Count_Digit(n));
    }
}
