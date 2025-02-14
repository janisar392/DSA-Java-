package DSA.Array.Ques;

import java.util.Arrays;
import java.util.Scanner;

public class Question23Augest {

    //-------------------------------------------------------------------------------------------------------------

    static int FirstRepeatingNumber(int arr[]){

        for (int i = 0 ; i < arr.length ; i++){
            for (int j = i+1 ; j< arr.length ; j++){
                if (arr[i]==arr[j]){
                    return arr[i] ;
                }
            }
        }
        return -1 ;

    }

    //---------------------------------------------------------------------------------------------------------------
    static int findmax(int arr[]){
        int mx = Integer.MIN_VALUE ;
        for (int i = 0; i < arr.length ; i++){
            if (arr[i] > mx){
                mx = arr[i];
            }
        }
        return mx ;
    }

    static int findSecondMAx (int [] arr){
       int mx =  findmax(arr);

       for (int i = 0 ; i<arr.length ; i++){
           if (arr[i]== mx){
               arr[i] = Integer.MIN_VALUE;
           }
       }
       int SecondMax = findmax(arr);
       return SecondMax;
    }

    //-------------------------------------------------------------------------------------------------------------

    static int uniqueNumber(int arr[]){
        for (int i = 0 ; i < arr.length ; i++){
            for (int j = i+1 ; j < arr.length ; j++){
                if (arr[i]== arr[j]){
                    arr[i]=-1;
                    arr[j]=-1;

                }
            }
        }
        int ans = -1 ;
        for (int i = 0 ; i < arr.length ; i++){
            if (arr[i] > 0){
                ans = arr[i] ;
            }
        }
        return ans ;
    }

//----------------------------------------------------------------------------------------------

    static  int Triplesum(int arr[] , int target){
        int ans = 0 ;
        for (int i = 0 ; i < arr.length ; i++){
            for (int j= i+1 ; j < arr.length ; j++){
                for (int k = j+1 ; k < arr.length ; k++){
                    if (arr[i] + arr[j] + arr[k] ==target){
                        ans ++ ;
                    }
                }
            }
        }
        return ans ;
    }
//------------------------------------------------------------------------------------------------

    static int[] pairsum(int arr[] ,int target){
        //int ans = 0 ;
        for (int i = 0 ; i<arr.length; i++){
            for (int j = i+1 ; j<arr.length;j++) {
                if (arr[i] + arr[j] == target) {
                   // ans++;
                    return new int[]{i,j};
                }
            }
        }
       return new int[]{};
    }

//-------------------MAIN FUNCTION-----------------------------------------------------------------

    public static void main(String[] args) {
        System.out.println("Enter the size of Array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        int arr[] = new int[n];
        System.out.println("Enter "+ n + " Arrays :");
        for (int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target element");
        int target = sc.nextInt();

        System.out.println("Pair of sum of "+target+"is : " + Arrays.toString(pairsum(arr,target)));

  //      System.out.println("TRIPLET SUM OF OF "+target+"is : " + Triplesum(arr ,target));

  //      System.out.println("UNIQUE NUMBER IS :" + uniqueNumber(arr));

   //     System.out.println("MAXIMMUM VAlUE IS : "+ findmax(arr));
   //     System.out.println("Second MAximum is : "+ findSecondMAx(arr) );
   //     System.out.println("FIRST REPEATING ELEMENT : "+FirstRepeatingNumber(arr));

    }
}
