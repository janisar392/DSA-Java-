package DSA.String;

public class shortestPlindrome {
    public String shortPalindrome(String s){
        String rev = new StringBuilder(s).reverse().toString();
        String combined = s+"#"+rev;

        int[] lps = buildLps(combined);
        int palindromeLen = lps[lps.length -1];
        String suffix = s.substring(palindromeLen);
        String prefixtoAdd = new StringBuilder(suffix).reverse().toString();

        return prefixtoAdd +s ;
    }

    private static int[] buildLps(String str){
        int n = str.length();
        int[] lps = new int[n];
        int len =0;
        for(int i=1 ; i<n ;i++){
            while(len > 0 && str.charAt(len) != str.charAt(i)){
                len = lps[len-1];
            }
            if(str.charAt(len) == str.charAt(i)){
                len++;
                lps[i] =len;
            }
        }
        return lps;
    }
}
