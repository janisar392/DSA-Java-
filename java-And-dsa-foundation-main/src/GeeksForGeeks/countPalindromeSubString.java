package GeeksForGeeks;

public class countPalindromeSubString {
    public int countPS(String s) {
        // code here
        int n = s.length();
        int count =0 ;


        //odd length
        for(int c = 0 ; c< n ; c++){
            int left = c, right = c;
            while(left >= 0 && right < n && s.charAt(left) == s.charAt(right)){
                if(right-left+1 >= 2){
                    count++;
                }
                left--;
                right++;
            }
        }
        //even length;
        for(int c=0 ; c < n-1 ; c++){
            int left = c , right =c+1;
            while(left >= 0 && right < n && s.charAt(left) == s.charAt(right)){
                if(right- left+1 >=2){
                    count++;
                }
                left--;
                right++;
            }
        }
        return count;
    }
}
