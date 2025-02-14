package DSA.Sorting;

import java.util.ArrayList;
import java.util.Collections;

public class Bucket {

    static void display(float[] arr){
        for (float ans : arr){
            System.out.print(ans+" ,");
        }
        System.out.println();
    }

    static void bucketSort(float[] arr){
        int n = arr.length;

        ArrayList<Float>[] buckets = new ArrayList[n];
        // Create empty buckets
        for (int i = 0 ;i< n ; i++){
            buckets[i] = new ArrayList<Float>();
        }

        // Add elements into our buckets
        for(int i = 0 ; i < n ; i++){
            int bucketIndex = (int) arr[i] *n ;
            buckets[bucketIndex].add(arr[i]);
        }

        // Sort each bucket individually
        for (int i = 0 ; i< buckets.length; i++){
            Collections.sort(buckets[i]);
        }

        // Merge all buckets to get final sorted arrray

        int index = 0;
        for(int i = 0 ; i < buckets.length ; i++){
            ArrayList<Float> currBucket = buckets[i];
            for(int j =0 ; j< currBucket.size(); j++){
                arr[index++] = currBucket.get(j);
            }
        }

    }

    public static void main(String[] args) {
        float[] arr = {0.5f,0.25f,0.16f,0.79f,0.478f};
        System.out.println("Array before sorting :");
        display(arr);

        System.out.println("Array After sorting : ");
        bucketSort(arr);
        display(arr);
    }
}
