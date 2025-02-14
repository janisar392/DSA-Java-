package LeetCode;

public class leetcode1_twoSum {
    public static int[] twoSum(int[] num ,int target ){

        for(int i = 0 ; i< num.length-1;i++){
            for(int j = i+1 ; j< num.length ; j++){
                if(num[i] + num[j] == target){
                    int[] a = {i, j};
                    return a;
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {

        int[] num = {3,2,1,5,3};
        twoSum(num,6);

    }
}
