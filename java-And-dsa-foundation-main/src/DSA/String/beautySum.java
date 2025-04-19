package DSA.String;

public class beautySum {
    public static int BeautySum(String s){
        int totalBeauty =0;
        int n =s.length();

        for(int i=0; i<n ;i++){
            int[] freq = new int[26];

            for(int j=i ; j<n ;j++){
                freq[s.charAt(j)-'a']++;

                int maxFreq =Integer.MIN_VALUE;
                int minFreq =Integer.MAX_VALUE;

                for(int f : freq){
                    if(f>0){
                        maxFreq =Math.max(maxFreq,f);
                        minFreq =Math.min(minFreq,f);
                    }
                }
                totalBeauty += maxFreq-minFreq;
            }
        }
        return totalBeauty;
    }
}
