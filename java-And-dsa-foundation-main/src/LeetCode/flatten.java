package LeetCode;

public class flatten {
    public static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val){
            this.val = val;
        }
    }

    public void flatten(Node root){
        Node curr = root;
        while(curr!=null){
            if(curr.left!= null){
                Node pred = curr.left;
                while(pred.right != null){
                    pred = pred.right;
                }
                pred.right = curr.right;
                curr.right = curr.left;
                curr.left = null;
            }
            curr = curr.right;
        }
    }
}
