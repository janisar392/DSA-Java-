package DSA.Recursion;

import java.util.Scanner;

public class RemoveOccurance {
//    static String RemoveA2(String s){
//        if (s.length()==0) return "";
//        String smallAns = RemoveA2(s.substring (1));
//        char currChar = s.charAt(0);
//        if (currChar != 'a'){
//            return currChar+ smallAns;
//        }
//        else {
//            return smallAns ;
//        }
//
//    }

    static String Remove_A(String s , int idx ){
        // base case
        if (idx==s.length())
            return " ";
        // small ans
        String small_Ans = Remove_A(s,idx+1);

        char currChar = s.charAt(idx);

        // Self Work
        if (currChar!='a'){
            return currChar + small_Ans ;
        }else {
            return small_Ans ;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String s = sc.nextLine();
        System.out.println(Remove_A(s,0));
    //    System.out.println(RemoveA2(s));
    }
}
