
import java.util.Scanner;

public class prac_conditional {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.println("Enter your cost price");
     int C_P = sc.nextInt();
        System.out.println("Enter your selling price");
     int S_P = sc.nextInt();
     if (S_P >= C_P){
         System.out.println("Profit is :" + (S_P - C_P));
     }
     else
     {
         System.out.println(" Lose is :" + ( C_P - S_P));
     }


    }

}
