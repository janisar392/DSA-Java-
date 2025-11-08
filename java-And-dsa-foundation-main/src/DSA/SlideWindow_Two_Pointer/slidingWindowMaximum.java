package DSA.SlideWindow_Two_Pointer;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class slidingWindowMaximum {

    public ArrayList<Integer> maxOfSubarrays(int[] arr, int k) {
        // code here
        int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<>();
        Deque<Integer> dq = new LinkedList<>();

        for(int i =0 ; i< n ; i++ ){

            // maintain window size
            while(!dq.isEmpty() && dq.peekFirst() <= i-k){
                dq.pollFirst();
            }

            while(!dq.isEmpty() && arr[dq.peekLast()] <= arr[i]){
                dq.pollLast();
            }

            dq.offerLast(i);

            if(i >= k-1){
                ans.add(arr[dq.peekFirst()]);
            }
        }

        return ans;
    }
}
