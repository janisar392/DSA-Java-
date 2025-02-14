import java.util.Scanner;

public class prcactise_a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       int i = 1;
       while (true){
           if (i%2==0)
           { i = i+1;
               continue;

           }
           System.out.println(i);
           i = i + 1 ;
           if (i > 10) {
               break;
           }
       }
    }
}
