package LeetCode;

public class InvertBT {
    public static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val){
            this.val=val;
        }
    }
    public static Node invertBinaryTree(Node root){
        if(root==null) return root;

        Node l = root.left;
        Node r = root.right;

        root.left=invertBinaryTree(r);
        root.right=invertBinaryTree(l);

        return root;
    }
}
