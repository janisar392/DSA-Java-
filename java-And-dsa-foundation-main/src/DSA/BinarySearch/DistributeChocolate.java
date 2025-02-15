package DSA.BinarySearch;

public class DistributeChocolate {

    public static boolean isDivisionPossible(int a[], int m , int mxChocAllowed){

        int noOfStudents = 1;
        int chocolate =0;

        for(int i = 0; i<a.length;i++){
            if(a[i]>mxChocAllowed)
                return false;

            if(chocolate + a[i] <= mxChocAllowed){
                chocolate += a[i];
            }
            else {
                noOfStudents++;
                chocolate = a[i];
            }
        }
        return noOfStudents <= m;
    }

    //find minimum of maximum
    public static int distributeChocolate(int a[],int m){

        if(a.length < m) return -1;

        int ans =0 , start =1, end=(int)1e9;

        while(start <= end){

            int mid = start + (end-start)/2;

            if(isDivisionPossible(a,m,mid)){
                ans = mid;
                end =mid-1;        // giving minimum chocolate
            }
            else{
                start = mid+1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        int arr[] ={12,34,67,90};
        int m = 2;

        System.out.println(distributeChocolate(arr,m));
    }


}
