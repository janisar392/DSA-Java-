package DSA.Recursion;

import java.util.Scanner;

public class Palindrome {
    static int cheak__palindrome(int a){
        // Base case
        if (a < 10)
            return a ;//       ------------------------------------------------------wrong

        // small work
        int samllans = cheak__palindrome(a/10);

        // self work
        int ans =( samllans * 10 ) + a% 10 ;

        if (ans == a){
            System.out.println("yes");
        }

        return ans;
    }

    static boolean Cheak_Palindrome(String s , int p , int q ){
        if (p>=q){
             return true;
        }
        return (s.charAt(p)== s.charAt(q) && Cheak_Palindrome(s, p+1 ,q-1));
    }

    public static void main(String[] args) {
    //    Scanner sc = new Scanner(System.in);
      //  System.out.println("Enter A String : ");
   //      String s = sc.nextLine();
   //     System.out.println(Cheak_Palindrome(s ,0 , s.length()-1));
        int a = 166464;

        System.out.println(cheak__palindrome(a));
    }
}
