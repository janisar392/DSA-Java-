package DSA.Array.Ques;

public class Question24Augest {
    //-----------------------------------------------------------------------------------------
    static void printArray(int[] arr){
        for (int i = 0 ;i< arr.length ; i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
    //---------------------------------------------------------------------------------------------
    static void swapInArray(int[] arr ,int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp ;
    }


    static void reverseArray(int[] arr){
        int i = 0 ; int j = arr.length-1 ;

        while (i < j){
            swapInArray(arr , i,j);
            i++;
            j--;
        }
    }




    //-------------------------------------------------------------------------------------------------
    static int[] reverseArrays(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        int j = 0 ;

        //transverse original array in reverse direction
        for (int i = n-1 ; i >= 0 ; i--){
            ans[j] = arr[i];
            j++;
        }
        return ans ;

    }

    //----------------------------------------------------------------------------------------------
    static void swapWIthoutTemp(int a , int b){

        System.out.println("Original value before ");
        System.out.println("a : " + a);
        System.out.println("b : " + b);

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("Values after swap");
        System.out.println("a : "+ a);
        System.out.println("b : "+ b);

    }


    //-----------------------------------------------------------------------------------------------
    static void swap(int a , int b){
        System.out.println("Original value before ");
        System.out.println("a : " + a);
        System.out.println("b : " + b);

        int temp = a ;
        a=b;
        b=temp ;

        System.out.println("Values after swap");
        System.out.println("a : "+ a);
        System.out.println("b : "+ b);

    }
    //--------------------------------------------------------------------------------------
    public static void main(String[] args) {
        int a = 9 ;
        int b = 3 ;
        int[] arr = {1,2,3,4,5,8,7};
     //   swap(a,b);
      //  swapWIthoutTemp(a,b);
   //     int[] ans = reverseArrays(arr);
    //    printArray(ans);
        reverseArrays(arr);
        printArray(arr);

    }
}
