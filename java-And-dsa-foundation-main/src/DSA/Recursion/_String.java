package DSA.Recursion;

import java.util.Scanner;

public class _String {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a String : ");
        String s = sc.nextLine();
        System.out.println(s);

        char ch = s.charAt(4);
        System.out.println(ch);
        for (int i = 0 ; i < s.length();i++){
            System.out.print(s.charAt(i)+" ");
        }
        System.out.println();

//       Use of Sub_String
        System.out.println(s.substring(2,4));

    }
}
