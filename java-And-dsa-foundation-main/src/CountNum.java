import java.util.Scanner;

public class CountNum {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int count = 0;
        int original_num = n;
        while(n>0)
        {
           n = n/10;
           count++;
        }
        System.out.println("total number of digit in "+original_num+" is "+count);
    }

}
