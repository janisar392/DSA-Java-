package DSA.Recursion;

import java.util.ArrayList;

public class FindAllIndices {

    static ArrayList<Integer> allIndices(int[] arr , int target , int idx){
        ArrayList<Integer> ans = new ArrayList<>();
        if (idx>=arr.length){
            return ans ;
        }
        // self Work
        if (arr[idx]== target){
            ans.add(idx);
        }
        // Recursive Work
        ArrayList<Integer> smallAns = allIndices(arr , target ,idx +1);
        ans.addAll(smallAns);
        return ans ;

    }

    public static void main(String[] args) {
        int[] arr = {1 , 3, 3 ,5 ,3 , 3};
        int target = 3 ;
        ArrayList<Integer> ans = allIndices(arr ,target , 0);
        for (Integer i : ans) {
            System.out.print(i + " ");
        }

    }
}
