package LeetCode;

public class isSymmetric {
    public static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val){
            this.val = val;
        }
    }
    public static Node invertBT(Node root){
        if(root==null) return root;

        Node l = root.left;
        Node r = root.right;

        root.left=invertBT(r);
        root.right=invertBT(l);
        return root;
    }

    public static boolean isSameBT(Node p , Node q){
        if(p==null && q==null ) return true;
        if(p==null || q==null) return false;

        if(p.val!=q.val) return false;

        return isSameBT(p.left,q.left) && isSameBT(p.right,q.right);
    }

    public static boolean IsSymmetricBt(Node root){
        if(root==null) return true;

        root.left= invertBT(root.left);
        return isSameBT(root.left,root.right);
    }
}
