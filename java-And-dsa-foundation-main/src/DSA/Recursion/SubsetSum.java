package DSA.Recursion;

public class SubsetSum {

    static void subsetsum(int[] a , int n , int idx , int Currsum){
        n = a.length;
        if (idx >= n){
            System.out.println(Currsum);
            return;
        }
        subsetsum(a ,n ,idx+1 ,Currsum+ a[idx]); // include
        subsetsum(a ,n ,idx+1 , Currsum);  // exclude
    }

    public static void main(String[] args) {
        int[] a = {2,4 ,5};
        subsetsum(a , a.length ,0 ,0);

    }
}
