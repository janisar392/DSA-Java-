import java.util.Scanner;

public class SumOfDigit{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number");
        int n = sc.nextInt();
        int original_n = n;
        int sumOfDigit=0;
        while (n>0) {
            sumOfDigit += n % 10;
            n=n/10;
        }
        System.out.println("sum of digit:"+sumOfDigit);

    }
}
