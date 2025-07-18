package GeeksForGeeks;

public class _13_divisible {
    public static boolean isDivideablbleBy13(String s){
        int n = s.length();
        int mod =0;
        for(int i =0 ; i< n ; i++){
            int num = s.charAt(i)-'0';
            mod = (mod*10 + num) % 13;
        }
        return mod==0;
    }
}
