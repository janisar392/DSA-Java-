package DSA.BackTracking;

import java.util.ArrayList;

public class CombinationSum {

    static ArrayList<ArrayList<Integer>> combinationSum(int[] arr, int target) {

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        helper(arr, target , 0 , new ArrayList<>() , ans);

        return ans;
    }

    private static void helper(int[] arr , int target , int i , ArrayList<Integer> curr , ArrayList<ArrayList<Integer>> ans){

        if(target == 0){
            ans.add(new ArrayList<>(curr));
            return;
        }

        if(i == arr.length) return;

        if(arr[i] <= target){
            curr.add(arr[i]);
            helper(arr, target-arr[i], i, curr , ans);
            curr.remove(curr.size()-1);
        }

        helper(arr, target , i+1 , curr, ans);
    }
}
