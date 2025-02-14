package DSA.Recursion;

public class ArraySorted_or_Not {
    static boolean arraySorted_or_Not(int[] arr , int idx){
        int n = arr.length;
        if (idx==n-1)
            return true;
        if(arr[idx]<=arr[idx+1] ) {
            return arraySorted_or_Not(arr , idx+1);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 1,2,3,4,5,5,3};
        System.out.println(arraySorted_or_Not(arr ,0));
    }
}
