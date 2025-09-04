package DSA.GreedyAlgo;

public class jumpGame {

    public boolean canJump(int[] arr){

        int n = arr.length;
        int max=0;

        for(int i =0 ; i< n ; i++){
            if(i > max) return false;

            max = Math.max(max , arr[i] + 1);
        }
        return true;
    }
}
