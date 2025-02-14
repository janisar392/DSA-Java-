import java.util.Scanner ;
public class ReverseOfDigit {
    public static int reverse(int n) {
        int ans = 0;
        while(n>0||n<0){
            int r = n%10 ;
            ans = (10 * ans) + r ;
            n = n/10 ;
        }
        if(n>=2147483647){
            return 0;
        }else{
            return ans ;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(reverse(n));
    }
}