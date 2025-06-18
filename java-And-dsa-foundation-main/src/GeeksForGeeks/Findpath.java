package GeeksForGeeks;

import java.util.ArrayList;

public class Findpath {
    public static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
        }
    }
    private boolean getPath(Node root, ArrayList<Integer> arr, int x){
        if(root == null) {
            return false;
        }
        arr.add(root.data);
        if(root.data == x){
            return true;
        }
        if(getPath(root.left,arr,x) || getPath(root.right , arr, x)){
            return true;
        }
        arr.remove(arr.size() - 1);
        return false;
    }
    public ArrayList<Integer> solve(Node root , int a){
        ArrayList<Integer> ans = new ArrayList<>();
        if(root==null) return ans;
        getPath(root,ans,a);
        return ans;
    }
}
