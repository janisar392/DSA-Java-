package DSA.Recursion;

import java.util.Scanner;

public class ReverseOfString {
    static String reverse (String p){
        // Base case
        if (p.length()==0)
            return "";

        // Small Case
        String smallAns = reverse(p.substring(1));

        char currChar = p.charAt(0);

        // Self work
        return smallAns+currChar;

    }

    static String reverseOf_String(String p , int idx){
        // Base case
        if (idx >= p.length())
            return "";

        // Small Case
        String smallAns = reverseOf_String(p , idx +1);

        char currChar = p.charAt(idx);

        // Self work
        return smallAns+currChar;
    }

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String p = "level";
        System.out.println(reverseOf_String(p ,0));
        System.out.println(reverse(p));
        String rev = reverse(p);
    //    if (rev.equals(p)){
    //        System.out.println("Palindrome ");
    //    }
     //   else
    //        System.out.println("Not a Palindrome ");
    }
}
