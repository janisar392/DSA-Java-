package LeetCode;

public class removelement {
    static void  removeElement(int arr[],int val){
        int n=arr.length;
    int count=0;
    for(int i=0;i<n;i++) {
        if (arr[i] != val) {
            count++;
        }
    }
        System.out.println(count);
    int k=0;
            for(int j=0;j<n;j++){
                if (arr[j] != val & k<=count) {
                    arr[k++]=arr[j];
                }
            }
    }




    public static void main(String[] args) {
        int arr[] = { 2 ,3 ,4,2 ,5 ,8 ,2 };

        removeElement(arr , 2);
        for(int i:arr){
            System.out.print(i+" ");
        }

    }
}
