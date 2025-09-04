package DSA.SlideWindow_Two_Pointer;

import java.util.Arrays;

public class CountTriangle {

    public int countTriangles(int arr[]) {
        // code here
        Arrays.sort(arr);
        int count=0;
        int n = arr.length;

        for(int k = n-1; k >= 2 ; k-- ){
            int i =0  , j = k-1;
            while(i < j){
                if(arr[i] + arr[j] > arr[k]){
                    count += j-i;
                    j--;
                }else{
                    i++;
                }
            }
        }
        return count;
    }
}
