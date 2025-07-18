package GeeksForGeeks;

public class LCM_Triplet {
    public long maxLCMTriplet(int n ){
       if(n <= 2) return n;
       long ans ;
        if(n % 2 ==1){
           ans = n *(n-1)*(n-2) * 1L;
        }else{  //even
            if(n%3==0){
                ans = (n-1)*(n-2)*(n-3) *1L;
            }else{
                ans = n * (n-1)* (n-3) * 1L;
            }
        }
        return ans;
    }
}
