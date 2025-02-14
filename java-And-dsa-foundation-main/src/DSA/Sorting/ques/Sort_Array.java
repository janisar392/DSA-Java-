package DSA.Sorting.ques;

public class Sort_Array {

    static void display(int[] arr){
        for (int ans : arr){
            System.out.print(ans+" ");
        }
        System.out.println();
    }

    static void sortarr(int[] arr){
        int n = arr.length;
        int x = -1 , y= -1 ;

        if (n <= 1){ // edge case , corner case
            return;
        }

        // process all adjacent elements

        for(int i= 1 ; i < n ; i++){
            if (arr[i-1] > arr[i]){
                if (x== -1){
                    x = i-1;
                    y = i;
                }
                else {
                    y = i ;
                }
            }
        }
        // swap x, y in arry
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {10,2,3,4,8,9,1};

        System.out.println("Array before sorting : ");
        display(arr);

        System.out.println("Array after sorting :");
        sortarr(arr);
        display(arr);
    }

}
