package GreaksForGreaks;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.*;

public class firstNegativeInteger {
    static List<Integer> FirstNegativeInteger(int arr[], int k){

        int N = arr.length;
        List<Integer> res = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();

        for(int i=0 ; i<N;i++){
            if(arr[i]<0){
                q.add(i);
            }
        }

        for(int i=0;i<N-k+1;i++){
            if(q.size()>0 && q.peek()<i ) q.remove();

            if(q.size()>0 && q.peek()<= i+k-1){
                res.add(arr[q.peek()]);            //  res[i] =arr[q.peek()];
            }
            else if(q.size()==0)  res.add(0);               // res[i] =0;
            else res.add(0);                                //res[i] =0;
        }
        return res;
    }

    public static void main(String[] args) {

        int[] arr = {12, -1, -7, 8, -15, 30, 16, 28};
        int k = 3;
        System.out.println(FirstNegativeInteger(arr,k)); // Output: [-1, -1, -7, -15, -15, 0]

    }
}
