package DSA.HashSet;

import java.util.HashSet;

// every element is in with pair , if element outside bag then remove the number from Basic.table
// otherwise put it on the Basic.table
// find the maximum element on Basic.table

public class MaxNoOnTable {
    public static int maximumNoOnTable(int[] bag){
        HashSet<Integer> table = new HashSet<>();

        int max =0;
        for(int i=0;i<bag.length;i++){
            int num= bag[i];
            if(table.contains(num)){
                table.remove(num);
            }
            else{
                table.add(num);
                max = Math.max(max,table.size());
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {2,1,1,3,2,3};
        System.out.println(maximumNoOnTable(nums));
    }
}
