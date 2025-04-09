package DSA.Stack;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElem3 {

    public int[] nextGreaterElements(int[] nums) {
        int n =nums.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        Arrays.fill(ans,-1);

        for(int i =0 ; i< 2*n ; i++){
            int num = nums[i%n];
            while (!st.isEmpty() && nums[st.peek()] < num) {
                ans[st.pop()] = num;
            }

            if(i < n){
                st.push(i);
            }
        }
        return ans;
    }
}
