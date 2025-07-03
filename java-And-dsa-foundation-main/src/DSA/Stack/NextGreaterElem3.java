package DSA.Stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElem3 {

    public ArrayList<Integer> nextGreaterElements(int[] nums) {
        int n =nums.length;
        int[] nge = new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i=n-1 ; i>=0 ;i--){
            while(!st.isEmpty() && st.peek() <= nums[i]){
                st.pop();
            }
            if(st.isEmpty()) nge[i] =-1;
            else nge[i] = st.peek();
            st.push(nums[i]);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int num : nge){
            ans.add(num);
        }
        return ans;
    }
}
