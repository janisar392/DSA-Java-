package DSA.Recursion;

import java.util.Scanner;

public class GCD {

    static int gcd(int m , int n ){
        if (n==0){
            return m;
        }
        return gcd(n , m%n);
    }
    static int iGCD(int m , int n){
        while (m%n != 0){
            int rem = m%n;
            m = n ;
            n = rem;
        }

        return n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number for GCD or HCF :");
        int m = sc.nextInt();
        int n = sc.nextInt();


            System.out.println("Normal Answer : "+iGCD(m,n));

        System.out.println("Answer from Recurtion : "+ gcd(m,n));

        }
    }

