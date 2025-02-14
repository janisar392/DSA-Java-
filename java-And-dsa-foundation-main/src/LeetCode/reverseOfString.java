package LeetCode;

import java.util.Scanner;

public class reverseOfString {
    static String reverse(String s , int idx ){
        if (idx== s.length())
            return "";
        String samllAns = reverse(s ,idx+1);
        char curr = s.charAt(idx);

        return samllAns+curr;
        }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(reverse(s,0));
    }
}
