package GeeksForGeeks;

public class CuttingBinaryString {
    public int cuts(String s) {
        int n = s.length();
        int[] dp = new int[n+1];

        for(int i =0 ; i<= n ;i++){
            dp[i] = Integer.MAX_VALUE;
        }
        dp[0] =0;

        for(int i =1 ; i<= n ;i++){
            for(int j= 0 ; j < i ; j++){
                String sub = s.substring(j,i);
                if(isPowerOf5(sub) && dp[j] != Integer.MAX_VALUE){
                    dp[i] = Math.min(dp[i], dp[j]+1);
                }
            }
        }
       return dp[n] == Integer.MAX_VALUE ? -1 : dp[n];
    }

    private boolean isPowerOf5(String binary){
        if(binary.charAt(0) == '0') return false;
        int num = Integer.parseInt(binary,2);
        if(num == 0 ) return false;
        while(num > 1){
            if(num % 5 != 0) return false;
            num /= 5 ;
        }
        return true;
    }
}
