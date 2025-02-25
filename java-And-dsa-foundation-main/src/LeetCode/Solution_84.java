package LeetCode;

import java.util.Stack;

public class Solution_84 {
    public static int largestRectangleArea(int[] heights ){

        int n = heights.length;
        int[] nse = new int[n];
        int[] pse = new int[n];

        Stack<Integer> st = new Stack<>();

        //calculate nse
        st.push(n-1);
        nse[n-1] =n;

        for(int i =n-2 ; i>=0 ; i--){
            if(st.size()>0 && heights[st.peek()] >= heights[i]){
                st.pop();
            }
            if(st.size()==0) nse[i]=n;
            else nse[i] = st.peek();
            st.push(i);
        }
        //emptying stack
        while(st.size()>0) st.pop();

        //calculate pse
        st.push(0);
        pse[0] = -1;

        for(int i =1 ; i >=n-1 ;i++){
            if(st.size()>0 && heights[st.peek()] >= heights[i] ){
                st.pop();
            }
            if(st.size()==0) pse[i] =n;
            else pse[i] = st.peek();
            st.push(i);
        }
        // calculate largest rectangle area
        int max =-1;

        for(int i = 0 ; i<n ;i++){
            int area = heights[i] * (nse[i]-pse[i]-1);
            max = Math.max(max,area);
        }
        return max;
    }
}
