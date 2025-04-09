package DSA.Stack;

import java.util.*;

public class MaximalRectangle {

    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        Stack<Integer> st = new Stack<>();

        int[] nse = new int[n];
        int[] pse = new int[n];

        //calculate nse
        st.push(n - 1);
        nse[n - 1] = n;
        for (int i = n - 2; i >= 0; i--) {
            while (st.size() > 0 && heights[st.peek()] >= heights[i]) {
                st.pop();
            }
            if (st.size() == 0) nse[i] = n;
            else nse[i] = st.peek();
            st.push(i);
        }
        // emptying the stack
        while (st.size() > 0) st.pop();

        // calculate pse
        st.push(0);
        pse[0] = -1;
        for (int i = 1; i <= n - 1; i++) {
            while (st.size() > 0 && heights[st.peek()] >= heights[i]) {
                st.pop();
            }
            if (st.size() == 0) pse[i] = -1;
            else pse[i] = st.peek();
            st.push(i);
        }

        // maximum area of rectangle
        int max = -1;
        for (int i = 0; i < n; i++) {
            int area = heights[i] * (nse[i] - pse[i] - 1);
            max = Math.max(max, area);
        }
        return max;
    }

    public int maximalRectangle(char[][] matrix) {

        if(matrix.length==0) return 0;

        int maxArea = 0;
        int cols = matrix[0].length;
        int[] height = new int[cols];

        for(int row =0 ; row < matrix.length ;row++){
            for(int col =0 ; col < cols ; col++){
                if(matrix[row][col] =='1'){
                    height[col] += 1;
                }else{
                    height[col] =0;
                }
            }
            maxArea = Math.max(maxArea, largestRectangleArea(height));
        }
        return maxArea;
    }
}
