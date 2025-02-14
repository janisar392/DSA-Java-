import java.util.Scanner;

public class Nested_if {
    public static void main(String[] args) {
        System.out.println("Enter your marks");
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        if (marks>33){
            if (marks>80){
                System.out.println("graceful");
            }
            System.out.println("Pass");
        }
        else {
            System.out.println("Fail");
        }
    }
}
