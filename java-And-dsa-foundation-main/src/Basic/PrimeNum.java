package Basic;

import java.util.ArrayList;

public class PrimeNum {
    public static ArrayList<Integer> primeNum(int num) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = 2;

        while (ans.size() < num) {
            if (isPrime(n)) {
                ans.add(n);
            }
            n++;
        }
        return ans;
    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;

        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Prime Numbers: ");
        ArrayList<Integer> ans = primeNum(10);
        System.out.println(ans);  // Output: [2, 3, 5, 7, 11, 13, 17, 19, 23, 29]
    }
}
