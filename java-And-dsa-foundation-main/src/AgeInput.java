import java.util.Scanner;

public class AgeInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");

        int age = sc.nextInt();
        if(age < 0){
            System.out.println("Not born yet !");
        }

        else if (age<= 12){
            System.out.println("child");
        }
          else if (age>12 && age <=20 ) {
            System.out.println("teenager");
        } else {
            System.out.println("adult");
        }
    }
}
