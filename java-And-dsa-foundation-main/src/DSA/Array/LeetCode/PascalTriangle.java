package DSA.Array.LeetCode;

import java.util.*;

public class PascalTriangle {

    ArrayList<Integer> nthRowOfPascalTriangle(int n) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for(int i=0 ; i<n ;i++){
            ans.add(new ArrayList<>());
            for(int j=0 ; j<=i ; j++){
                int ele =1;
                if(j==0 || j==i ) ele =1;
                else ele = ans.get(i-1).get(j-1)+ ans.get(i-1).get(j);
                ans.get(i).add(ele);
            }
        }
        return ans.get(n-1);
    }
}
