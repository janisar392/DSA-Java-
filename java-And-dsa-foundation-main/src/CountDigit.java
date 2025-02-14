import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digit");
        int n= sc.nextInt();
        int numOfDigit = 0;
        int original_n = n;
        while ( n > 0) {
            n=n/10 ;
            numOfDigit++;

        }
        System.out.println("NUmber of digit in "+ original_n + "=" + numOfDigit);
    }
}
