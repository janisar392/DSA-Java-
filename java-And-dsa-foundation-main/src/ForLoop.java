import java.util.Enumeration;
import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

//        for(int num = 1 ; num <= n ; num++ ){
//            System.out.println(num);
//        }



//
//            int sum = 0;
//        for (int num = 1 ; num <= n ; num++){
//            sum = sum+num ;
//
//        }
//        System.out.println(sum);





//        for(int num = n ; num >= 1 ; num-- ) {
//            System.out.println(num);
//        }


        for (int num = n ; num >= 1; num/=2 ){
            System.out.println(num);
        }
    }
}
