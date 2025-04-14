package DSA.SlideWindow_Two_Pointer;

public class CharacterReplacement {
    public static int characterReplacement(String s, int k){
        int[] freq = new int[26];
        int l =0 , maxFreq = 0, maxLen =0;

        for(int r=0 ; r < s.length() ;r++){
            freq[s.charAt(r) -'A']++;

            maxFreq = Math.max(maxFreq , freq[s.charAt(r)-'A']);

            while ((r-l+1 - maxFreq) > k){
                freq[s.charAt(l) - 'A']--;
                l++;
            }
            maxLen = Math.max(maxLen , r-l+1);
        }

        return maxLen;
    }
}
