package DSA.Stack;

import java.util.Stack;

public class maxSlidingWindow {
    public int[] maxSlidingWindowGreater(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n];
        int z =0;

        // nge -> next greater element
        int[] nge = new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i = n-1 ; i >=0 ; i--){
            while (!st.isEmpty() && nums[st.peek()] < nums[i]){
                st.pop();
            }
            nge[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }
        // main code
        int j=0;

        for(int i =0 ; i<= n-k+1 ;i++){
            if(j > i+k)  j=i;
            int max = nums[j];

            while (j< i+k){
                 max = nums[j];
                 j = nge[j];
            }
            ans[z++] =max;
        }
         return ans;
    }
}
