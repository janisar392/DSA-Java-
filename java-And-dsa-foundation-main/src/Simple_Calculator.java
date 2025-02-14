import java.util.Scanner;


public class Simple_Calculator {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first Number");
        double Num_01 = sc.nextDouble();
        System.out.println("Enter your second number");
        double Num_02 = sc.nextDouble();
        System.out.println("Enter your optartor(+,-,*,/)");
        char oprator = sc.next().charAt(0);

        //object
        Calculate objCaculate= new Calculate();

         double result= objCaculate.performCalculation(Num_01,Num_02,oprator) ;

        objCaculate.showMessage();

        System.out.println("Num_01"+oprator+"Num_02 = :" +result);
    }
}
