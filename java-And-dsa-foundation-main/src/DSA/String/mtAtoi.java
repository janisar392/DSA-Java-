package DSA.String;

public class mtAtoi {
    public static int strToInteger(String str){
        int i =0 , n =str.length();
        int sign =1;
        long ans =0;

        while(i < n && str.charAt(i)==' '){
            i++;
        }

        if(i < n && (str.charAt(i)=='+' || str.charAt(i)=='-')){
            sign = str.charAt(i)=='-' ? -1:1;
            i++;
        }

        while(i < n && Character.isDigit(str.charAt(i))){
            int digit = str.charAt(i)-'0';
            ans = ans*10+digit;

            if(sign ==1 && ans > Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }

            if(sign ==-1 && -ans < Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
            i++;
        }
        return (int) (sign*ans);
    }
}
