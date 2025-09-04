package DSA.Stack;

import java.util.Stack;

public class Celebrity_Problem {

    public int celebrity(int[][] mat){
        int n = mat .length;

        Stack<Integer> st = new Stack<>();
        for(int i =0 ; i<n ; i++){
            st.push(i);
        }

        while(st.size() > 1){
            int v1 = st.pop();
            int v2 = st.pop();

            if(mat[v1][v2] == 0) st.push(v1);
            else if(mat[v2][v1] == 0) st.push(v2);
        }

        int potential = st.pop();
        for(int i =0 ; i< n ; i++){
            if(potential != i){
                if(mat[potential][i] == 1 || mat[i][potential] ==0 )return -1;
            }
        }
        return potential;
    }
}
