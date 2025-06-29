package GeeksForGeeks;

import java.util.ArrayList;

public class searchKMP {
    ArrayList<Integer> search(String pat , String txt ){
        ArrayList<Integer> ans = new ArrayList<>();
        int[] lps = buildLPS(pat);
        int i =0 ;
        int j =0 ;

        while(i < txt.length()) {
            if(txt.charAt(i) == pat.charAt(j)){
                i++;
                j++;
                if(j == pat.length()){
                    ans.add(i-j);
                    j = lps[j-1];
                }
            } else{
                if(j != 0){
                    j = lps[j-1];
                }else{
                    i++;
                }
            }
        }
        return ans;
    }
    public static int[] buildLPS(String s){
        int n = s.length();
        int[] lps = new int[n];
        int len =0 ;
        for(int i =0 ; i< n ;i++){
            while(len > 0 && s.charAt(i) != s.charAt(len)){
                len = lps[len -1];
            }
            if(s.charAt(i) == s.charAt(len)){
                len++;
                lps[i] =len ;
            }
        }
        return lps;
    }
}
