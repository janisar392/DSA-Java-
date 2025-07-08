package DSA.Stack;

import java.util.*;

public class nextGreaterFreq {

    public ArrayList<Integer> findGreater(int[] arr) {

        int n = arr.length;
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        ArrayList<Integer> ans = new ArrayList<>(Collections.nCopies(n,-1));
        Stack<Integer> stack = new Stack<>();

        for(int i = n-1 ; i>=0 ;i--){
            while (!stack.isEmpty() && map.get(arr[stack.peek()]) <= map.get(arr[i])){
                stack.pop();
            }
            if(!stack.isEmpty()){
                ans.set(i,arr[stack.peek()]);
            }
            stack.push(i);
        }
        return ans;
    }
}