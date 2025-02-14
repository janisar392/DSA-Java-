import java.util.Scanner;

public class PresentQuery {
    static int[] makeFrequencyArray(int[] arr ){
        int[] freq = new int[100005];

        for (int i = 0 ; i < arr.length ; i++){
            freq[arr[i]]++;
        }
        return freq;
    }



    public static void main(String[] args) {
        System.out.println("Enter the size of the array : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter "+ n+" Array Elements : ");
        for (int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }



        System.out.println("Enter number of Queries ");
        int q = sc. nextInt() ;

        int[] freq = makeFrequencyArray(arr);


        while (q > 0){
            System.out.println("Enter number to be searched");
            int x = sc.nextInt();
            if (freq[x] > 0){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }

            q--;
        }


    }
}
