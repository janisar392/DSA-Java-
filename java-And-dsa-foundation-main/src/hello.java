import java.util.Scanner;

class hello{
    static int AddingArray(int[] arr , int idx){
        // base case
        if (idx == arr.length)
            return 0;
        // small Ans
        int smallAns = AddingArray(arr , idx+1);
        // self work
        int ans = smallAns + arr[idx];
        return ans ;
    }

    public static void main(String[] args) {
    //    System.out.println("Enter a number : ");
     //   Scanner sc = new Scanner(System.in);
   //     int n = sc.nextInt();
    //    System.out.println(alternate_sum(n));
        int[] arr = {3,4,5,7,8,9 };
        System.out.println(AddingArray(arr,0));

    }
}