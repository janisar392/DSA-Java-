package GreaksForGreaks;

public class isSumProperty {
    public static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
        }
    }

    public static int IsSumProperty(Node root){
        if(root==null || root.left==null && root.right==null) return 0;

        int leftVal = 0 , rightVal =0;

        if(root.left!=null) leftVal =root.left.data;
        if(root.right!=null) rightVal =root.right.data;

        int leftAns = (root.left != null) ? IsSumProperty(root.left) : 1;
        int rightAns= (root.right !=null) ? IsSumProperty(root.right) :1;

        if(root.data == (root.left.data +root.right.data)
                && IsSumProperty(root.left) ==1  && IsSumProperty(root.right)==1 ) return 1;

        return 0;
    }
}
