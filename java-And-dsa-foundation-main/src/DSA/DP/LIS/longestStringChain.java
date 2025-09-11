package DSA.DP.LIS;

import java.util.Arrays;

public class longestStringChain {
    public int longestStrChain(String[] words) {
        int n = words.length;

        Arrays.sort(words, (a, b) -> a.length() - b.length());
        int[] dp = new int[n];
        Arrays.fill(dp,1);

        int maxChain = 1;

        for(int i=0 ; i< n ; i++){
            for(int j=0 ; j< i ; j++){
                if( isPredecessor(words[j], words[i]) && dp[j]+1 > dp[i]){
                    dp[i] = dp[j] +1;
                }
            }
            maxChain = Math.max(maxChain , dp[i]);
        }
        return maxChain;
    }

    private static boolean isPredecessor(String shorter , String longer){
        if(shorter.length() + 1 != longer.length()) return false;

        int i=0 , j=0;
        boolean skipped = false;

        while(i < shorter.length() && j < longer.length()){
            if(shorter.charAt(i) == longer.charAt(j)){
                i++;
                j++;
            } else{
                if(skipped) return false;
                skipped = true;
                j++;
            }
        }
        return true;
    }
}
