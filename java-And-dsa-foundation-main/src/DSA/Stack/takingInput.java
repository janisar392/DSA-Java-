package DSA.Stack;

import java.util.Scanner;
import java.util.Stack;

public class takingInput {
    public static void main(String[] args) {
        Stack st = new Stack();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number of Elements : ");
        int n = sc.nextInt();

        System.out.println("Enter "+n+" elements : ");

        for(int i =1 ;i<=n ; i++){
            int x = sc.nextInt();
            st.push(x);
        }
        System.out.println("Stack elements are : "+st);
    }
}
