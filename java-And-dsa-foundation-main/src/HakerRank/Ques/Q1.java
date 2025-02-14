package HakerRank.Ques;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        System.out.println("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1 ; i <=10 ; i++){
            int ans = n*i;

            System.out.println( n+"x"+i+"="+ans);
        }
    }
}
