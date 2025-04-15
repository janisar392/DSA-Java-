package DSA.SlideWindow_Two_Pointer;

public class numberOfSubString {
    public static int NoofsubString(String s){
        int[] count = new int[3];
        int left=0,right=0,ans=0;

        while(right < s.length()){
            count[s.charAt(right) -'a']++;

            while(count[0] >0 && count[1]>0 && count[2]>0){
                count[s.charAt(left)-'a']--;
                left++;
            }
            ans += left;

            right++;
        }
        return ans;
    }
}
