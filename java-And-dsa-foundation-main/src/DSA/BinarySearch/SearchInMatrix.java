package DSA.BinarySearch;

public class SearchInMatrix {
    public static boolean searchMatrix(int[][] a,int target){
        int n = a.length , m =a[0].length;
        int st =0, end =n*m-1;
        while(st<=end){
            int mid = st + (end-st)/2;
            int midElt = a[mid/m][mid%m];

            if(midElt==target) return true;
            if(target < midElt){
                end = mid-1;
            }else{
                st = mid +1;
            }
        }
        return false;
    }
}
