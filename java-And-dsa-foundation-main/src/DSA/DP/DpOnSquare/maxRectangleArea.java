package DSA.DP.DpOnSquare;
import java.util.*;

public class maxRectangleArea {

    public int largestRectangleArea(int[] height){
        int n = height.length;
        Stack<Integer> st = new Stack<>();

        int[] nse = new int[n];
        int[] pse = new int[n];

        // calculate NSE
        st.push(n-1);
        nse[n-1] = n;
        for(int i = n-2; i >= 0; i--) {
            while(st.size() > 0 && height[st.peek()] >= height[i]) {
                st.pop();
            }
            if(st.size() == 0) nse[i] = n;
            else nse[i] = st.peek();
            st.push(i);
        }

        while(!st.isEmpty()) st.pop();

        // calculate PSE
        st.push(0);
        pse[0] = -1;
        for(int i = 1; i < n; i++) {
            while(st.size() > 0 && height[st.peek()] >= height[i]) {
                st.pop();
            }
            if(st.size() == 0) pse[i] = -1;
            else pse[i] = st.peek();
            st.push(i);
        }

        int max = 0;
        for(int i = 0; i < n; i++) {
            int area = height[i] * (nse[i] - pse[i] - 1);
            max = Math.max(max, area);
        }

        return max;
    }

    public int maximalRectangle(char[][] matrix) {
        if(matrix.length == 0) return 0;

        int maxArea = 0;
        int cols = matrix[0].length;
        int[] height = new int[cols];

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < cols; j++) {
                if(matrix[i][j] == '1') {
                    height[j] += 1;
                } else {
                    height[j] = 0;
                }
            }
            maxArea = Math.max(maxArea, largestRectangleArea(height));
        }

        return maxArea;
    }
}
