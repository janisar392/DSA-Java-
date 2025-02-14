import java.util.Scanner;

public class binary_to_decimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Binary Number");
        int binary_NUmber = sc.nextInt();
        int ans = 0; // converted decimal Number
        int unit_number = 1 ; // unit number is the 2 to the power 0 2^0 = 0
        while(binary_NUmber > 0 ) {
            int unit_digit = binary_NUmber%10;
            ans+=(unit_digit*unit_number);
            binary_NUmber/=10;
            unit_number*=2;
            System.out.println(ans);
        }
    }
}
