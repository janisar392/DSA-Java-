package LeetCode;

import java.util.Arrays;
public class MissingNumber {

    public int missingNumber(int[] arr){

        int smallest = 1;
        Arrays.sort(arr);
        for(int i =0 ; i< arr.length ; i++){
            if(arr[i] == smallest){
                smallest++;
            }
        }
        return smallest;
    }
}
