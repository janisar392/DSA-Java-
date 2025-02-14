package DSA.Sorting;

public class Sorting {

    static void bubblesort(int[] a){
        int n = a.length;
        // n-1 iteration / passes
        for (int i = 0 ; i < n-1 ; i++){
     //       boolean flag = false ; // has any swapping happend !
            for (int j = 0 ; j < n-i-1 ;j++){

                /*
                last i elements are alredy at correct sorted positions ,
                so no need to cheak them !
                 */

                if (a[j] > a[j+1]){

                    // swap ---- a[j] , a[j+1]

                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp ;
         //          flag= true;   // some swap has happpend
                              }

                }
        //        if (flag == false){  // have any swaps happened
                return;
            }
        }
  //  }

    public static void main(String[] args) {
        int[] a = {15, 12, 9, 10, 19, 14} ;
        bubblesort(a);
        for (int i : a){
            System.out.print(i + " ");
        }

    }
}
