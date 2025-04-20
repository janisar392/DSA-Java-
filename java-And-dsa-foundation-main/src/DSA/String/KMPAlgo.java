package DSA.String;

public class KMPAlgo {

    public int strStr(String haystack, String needle){
        int n =haystack.length();
        int m =needle.length();
        if(m==0) return 0;
        int[] lps = buildLPS(needle);
        int i=0 ,j=0;

        while (i < n){
            if(haystack.charAt(i) == needle.charAt(j)){
                i++;
                j++;
            }
            if(j==m) return i-j;

            else if(i < n && haystack.charAt(i) != needle.charAt(j)){
                if(j != 0){
                    j = lps[j-1];
                }
                else{
                    i++;
                }
            }
        }
       return -1;
    }

     private int[] buildLPS(String s){
         int n =s.length();
         int[] lps = new int[n];
         int len =0;

         for(int i=1 ; i< n ; i++){
             while(len > 0 && s.charAt(i) != s.charAt(len)){
                 len = lps[len-1];
             }
             if(s.charAt(i) == s.charAt(len)){
                 len++;
                 lps[i] =len;
             }
         }
         return lps;
     }
}
