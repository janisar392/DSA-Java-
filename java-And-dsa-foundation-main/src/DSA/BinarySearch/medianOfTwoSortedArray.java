package DSA.BinarySearch;

public class medianOfTwoSortedArray {
    public double findMedian(int[] nums1, int[] nums2){
        int n = nums1.length;
        int m = nums2.length;
        int [] arr = new int[n+m];

        int i =0;   //nums1
        int j=0;    //nums2
        int k =0;   //arr

        while(i<n && j< m){
            if(nums1[i] > nums2[j]){
                arr[k]= nums2[j];
                j++;
                k++;
            }else {
                arr[k] = nums1[i];
                i++;
                k++;
            }
        }
        //nums1 are not completed
        while(i<n){
            arr[k] = nums1[i];
            i++;
            k++;
        }
        //nums2 are not completed
        while(i<m){
            arr[k] = nums1[j];
            j++;
            k++;
        }
       int s = arr.length;

        if(s%2==0){
            return (arr[k/2] +arr[k/2])/2.0;
        }else{
            return arr[k/2]/1.0;
        }

    }
}
