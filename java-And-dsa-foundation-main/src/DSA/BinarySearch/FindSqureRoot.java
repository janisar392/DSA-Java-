package DSA.BinarySearch;

public class FindSqureRoot {

    public static int sqrt(int x){

        int start =0;
        int end = x;
        int ans = -1;

        while (start<=end){

            int mid = start + (end-start)/2;
            int val = mid*mid;

            if(val==x){
                return mid;
            }
            else if(val<x){
                ans = mid ;
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int x = 24;

        System.out.println(sqrt(x));

    }
}
