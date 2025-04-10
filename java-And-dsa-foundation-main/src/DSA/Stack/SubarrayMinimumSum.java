package DSA.Stack;

import java.util.Stack;

public class SubarrayMinimumSum {

    public int sumSubarrayMins(int[] arr){
        int MOD = 1_000_000_007;
        int n = arr.length;

        int[] pse = new int[n];
        int[] nse = new int[n];

        Stack<Integer> st = new Stack<>();

        // cal PSE
        for(int i = 0 ; i< n ;i++){
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            pse[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }

        st.clear();

        for(int i = n-1; i>=0 ;i--){
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            nse[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }

        //cal ans

        long ans =0;
        for(int i =0 ; i <n ;i++){
            long left = i- pse[i];
            long right = nse[i]-i;

            ans += ((arr[i] * left%MOD) * right%MOD) %MOD;
        }
        return (int)ans;
    }
}
