package DSA.Stack;

import java.util.Stack;

public class nextGreaterElem2 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 5, 4, 9, 3, 8, 7, 2};
        int n = arr.length;

        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();

        // Iterate from right to left
        for (int i = n - 1; i >= 0; i--) {
            // Pop smaller elements
            while (!st.isEmpty() && st.peek() <= arr[i])
                st.pop();

            // If stack is empty, no greater element exists
            res[i] = st.isEmpty() ? -1 : st.peek();

            // Push current element to stack
            st.push(arr[i]);
        }

        // Print original array
        System.out.println("Original Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Print next greater elements
        System.out.println("Next Greater Elements:");
        for (int num : res) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
