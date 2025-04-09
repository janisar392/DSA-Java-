package DSA.Stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class nextGreaterElem1 {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        Stack<Integer> st = new Stack<>();
        Map<Integer , Integer> map = new HashMap<>(); // Keep next greater elem data

        for(int num : nums2){
            while (!st.isEmpty() && num > st.peek()){
                map.put(st.pop(),num);
            }
            st.push(num);
        }
        int[] ans = new int[nums1.length];

        for(int i=0 ; i< nums1.length ; i++){
            ans[i] = map.getOrDefault(nums1[i] , -1);
        }
        return ans;
    }
}
