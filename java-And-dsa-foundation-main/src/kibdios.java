import java.util.Scanner;

public class kibdios {

    static int find_diff_Num(int[] array){
        int n = array.length;
   int start[] = new int[n];

//        int count = 0;
//        for (int i = 0 ; i <n ;i++){
//            boolean flag=true;
//            for (int j = i + 1 ;j < n ; j++){
//                if (array[i] == array[j]){
//                    flag=false;
//                }
//            }
//            if(flag==true){
//                count++;
//            }
//        }
//        return count ;
        int count = 0;
        for (int i = 0 ; i < n ; i++){
            int c=0;
            for (int j= i+1 ; j < n ; j++){
                if (array[i] == array[j]){
                    c++;
                }
                if(c>=1){
                    count++;

                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n :");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter "+ n + "Elements :");
        for (int i = 0 ; i < array.length ; i++){
           array[i] = sc.nextInt();
        }

        System.out.println(find_diff_Num(array));
    }


}
