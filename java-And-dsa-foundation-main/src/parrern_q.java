import java.util.Scanner;

public class parrern_q {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int r = sc.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=1;j<=i;j++){
                System.out.print("❤");
            }
            for(int k=1;k<=8-2*i;k++){
                System.out.print(" ");
            }
            for(int l=1;l<=i;l++){
                System.out.print("🧡");
            }
            System.out.println();
        }
        for(int i=r;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("❤");
            }
            for(int k=1;k<=8-2*i;k++){
                System.out.print(" ");
            }
            for(int l=1;l<=i;l++){
                System.out.print("🧡");
            }
            System.out.println();

        }




    }
    }

