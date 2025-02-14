import java.util.Scanner;

public class ConditionalOperational {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();

//        if (value % 2 == 0 && value % 3 == 0){
//            System.out.println(value);
//        }


  //     if a number devisable by 5 and 3 .


        if (value % 5 == 0 || value % 3 == 0){
            System.out.println(value);
        }
    }
}
