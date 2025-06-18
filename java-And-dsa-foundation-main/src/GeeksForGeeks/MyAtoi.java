package GeeksForGeeks;

public class MyAtoi {

    public static int myAtoi(String s){
        int i =0 , n = s.length();
        long ans =0 ;
        int sign = 1;

        while( i < n && s.charAt(i) == ' '){  // whiteSpace
            i++;
        }
        if(i < n && (s.charAt(i)=='+' || s.charAt(i)=='-')){  // sign
            sign = s.charAt(i) == '-' ? -1 :1 ;
            i++;
        }

        while(i < n && Character.isDigit(s.charAt(i))){     // digit
            int digit = s.charAt(i) -'0';
            ans = ans*10 + digit;

            if(sign == 1 && ans > Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }

            if( sign ==-1 && -ans < Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
            i++;
        }
        return (int)(sign* ans);
    }
}
