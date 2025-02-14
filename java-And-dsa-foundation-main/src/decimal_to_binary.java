import java.util.Scanner;

public class decimal_to_binary {
    public static void main(String[] args) {
        System.out.println("Enter the decimal number \n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        int power =1;  //10 ^0 =1
        while (n>0){
            int parity = n%2;
            ans += parity*power;
            power *= 10 ;
            n = n/2;

        }
        System.out.println(ans);
    }
}
