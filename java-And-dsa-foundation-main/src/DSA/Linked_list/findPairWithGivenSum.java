package DSA.Linked_list;

import java.util.ArrayList;

public class findPairWithGivenSum {
    public static class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data= data;
        }
    }

    public static ArrayList<ArrayList<Integer>> pairSum(Node head, int target){

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        if(head==null || head.next==null) return ans;
        Node first = head;
        Node last  = head;

        while (last.next!=null){
            last = last.next;
        }

        while (first!=null && last!=null && first!=last && last.next!= first){ // they did'nt cross each other

            int sum = first.data + last.data;

            if(sum== target){
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(first.data);
                pair.add(last.data);

                ans.add(pair);

                first = first.next;
                last = last.prev;
            } else if (target< sum) {
                first=first.next;
            } else {
                last = last.prev;
            }
        }
        return ans;
    }
}
