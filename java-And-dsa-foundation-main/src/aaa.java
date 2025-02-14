import java.util.Scanner;

public class aaa {
    static void printMatrix(int arr[][]){
        for (int i=0 ; i< arr.length ; i++){
            for (int j = 0 ; j < arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void multiplicationOfMAtrix(int a[][] ,int r1 , int c1 ,int b[][] , int r2 ,int c2){
        if (c1!=r2){
            System.out.println("Wrong input ! ");
        }

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the row 1 and Enter the column 1 :");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();

        System.out.println("Enter " + r1 * c1 + " Elements : ");
        int a[][] = new int[r1][c1];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("enter the row 2 and Enter the column 2 :");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();

        System.out.println("Enter " + r2*c2 + " Elements : ");
        int b[][] = new int[r2][c2];
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length; j++) {
                b[i][j] = sc.nextInt();

            }
        }
        System.out.println(" Matri 1 : ");
        printMatrix(a);
        System.out.println("MAtrix 2 : ");
        printMatrix(b);
    }
}