package DSA.Sorting;

public class insertion {

    static void Incersion(int[] arr){
        int n = arr.length;
        for (int i = 1 ;i < n ; i++){
            int j= i ;
            while (j>0 && arr[j]<arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1]= temp;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {8,4,3,78,15,49,46,12};
        Incersion(arr);
        for (int ans : arr){
            System.out.print(ans+"   ");
        }
    }
}
