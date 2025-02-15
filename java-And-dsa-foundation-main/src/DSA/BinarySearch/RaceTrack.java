package DSA.BinarySearch;

public class RaceTrack {

    public static boolean isPossible(int a[],int k , int dist){

        int kidPlaced = 1;
        int lastKid =a[0];

        for(int i=0 ; i <a.length ;i++){
            if(a[i]-lastKid >= dist){
                kidPlaced++;
                lastKid=a[i];
            }
        }
        return kidPlaced >= k;
    }


    public static int raceTrack(int a[], int k){

        if(k> a.length) return -1;

        int start =0 , end = (int)1e9;
        int ans = -1;

        while(start<= end){

            int mid = start+(end-start)/2;

            if(isPossible(a,k,mid)){
                ans =mid;
                start = mid+1;   // finding maximum distance between student
            }else {
                end =mid-1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int a[] = {1,2,4,8,9};
        int m =3;

        System.out.println(raceTrack(a,m));
    }
}
