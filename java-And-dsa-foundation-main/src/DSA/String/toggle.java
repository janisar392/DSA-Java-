package DSA.String;

import java.util.Scanner;


// JanisaR -> jANISAr

public class toggle {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter a String : ");
        StringBuilder sb = new StringBuilder(scanner.nextLine());

        System.out.println(sb);

        for(int i=0;i<sb.length();i++){

            boolean flag = true;  // capital letter default
            char ch = sb.charAt(i);
            if(ch ==' ')
                continue;

            int ascii =(int)ch;

            if(ascii >=97) flag =false; //small letter

            if(flag==true){
                ascii +=32;  // A -> 65 , a-> 97
                char dh =(char)  ascii;
                sb.setCharAt(i,dh);
            }
            else {
                ascii -=32;
                char dh = (char) ascii;
                sb.setCharAt(i,dh);
            }
        }
        System.out.println(sb);

    }
}
