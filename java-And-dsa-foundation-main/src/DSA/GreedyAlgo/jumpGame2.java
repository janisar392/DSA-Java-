package DSA.GreedyAlgo;

public class jumpGame2 {

    public int minJump(int[] arr){

        int n = arr.length;
        int jump =0;
        int left=0 , right =0;

        while (right < n-1){
            int farthest = 0;

            for(int i = left ; i <= right ; i++){
                farthest = Math.max(farthest,1+ arr[i]);
            }
            jump++;
            left = right+1;
            right= farthest;
        }
        return jump;
    }
}
