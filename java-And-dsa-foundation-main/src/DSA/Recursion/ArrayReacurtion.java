package DSA.Recursion;

public class ArrayReacurtion {

    static void printArray(int[] arr, int idx){
        // base case
        if (idx == arr.length){
            return;
        }
        // self work
        System.out.print(arr[idx] + " ");

        // sub problem
        printArray(arr , idx +1);
    }

    static int MaximumInArray(int[] arr , int idx){
        if (idx== arr.length-1){
            return arr[idx];
        }
        int smallAns = MaximumInArray(arr , idx+1);
        return Math.max(smallAns , arr[idx]);
    }

    static int Sum_of_Array(int[] arr , int idx ) {
        // Base Case
        if (idx == arr.length) {
            return 0;

        }
        // small Ans
        int smallAns = Sum_of_Array(arr, idx + 1);
        return smallAns + arr[idx];

    }

    public static void main(String[] args) {
        int[] arr = { 6 , 5 ,8 ,3 ,7};
  //      printArray(arr , 0);
   //     System.out.println(MaximumInArray(arr,0));
        System.out.println(Sum_of_Array(arr , 0));
    }
}
