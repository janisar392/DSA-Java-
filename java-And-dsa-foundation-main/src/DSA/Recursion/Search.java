package DSA.Recursion;

public class Search {

    static int Lastindex(int[] arr , int target , int idx){
        // Base Case
        if (idx < 0 ){
            return -1 ;
        }
        // self work
        if (arr[idx]==target)
            return idx;
        // Recursive work
        return Lastindex(arr ,target , idx -1);



    }

    static void FindAllIdncies(int[] arr , int target , int idx){
        // Base Case
        if (idx >= arr.length){
            return;
        }
        if (arr[idx]== target){
            System.out.print(idx + " ");
        }
        // Recursive Work
        FindAllIdncies(arr ,target,idx+1);
    }

    static int searchindex(int[] arr , int target , int idx){
        // Base Case
        if (idx>=arr.length){
            return -1 ;
        }
        // self work
        if (arr[idx]==target)
            return idx;
        // Recursive work
        return searchindex(arr ,target , idx +1);
    }

    static boolean search(int[] arr , int target , int idx){
        // Base Case
        if (idx>=arr.length){
            return false ;
        }
        // self work
        if (arr[idx]==target)
            return true;
        //recursive work
        return search(arr ,target ,idx+1);
    }

    public static void main(String[] args) {
        int[] arr = {9, 4 ,6 ,3 ,3 ,4 ,4 , 5 ,4 };
        int target = 5;


        System.out.println(search(arr ,target ,0));

//        if (search(arr , target , 0)){
//            System.out.println("Yes");
//        }
//        else
//            System.out.println("No");

    //    System.out.println(searchindex(arr ,target ,0));
    //    FindAllIdncies(arr,target,0);
    //    System.out.print(Lastindex(arr , target,arr.length-1));
    }
}
