package LeetCode;

public class DiameterOfBT {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val){
            this.val=val;
        }
    }

    public static int height(TreeNode root){
        if(root==null || (root.left==null && root.right==null))
            return 0;

        return 1 + Math.max(height(root.left),height(root.right));
    }

    public static int diameterOfBinaryTree(TreeNode root){

        if(root==null || (root.left==null && root.right==null))
            return 0;

        int leftAns = diameterOfBinaryTree(root.left);
        int rightAns=diameterOfBinaryTree(root.right);

        int ans = height(root.left) + height(root.right);
        if(root.right!=null) ans++;
        if(root.left!=null)  ans++;

        
        int maxAns = Math.max(ans,Math.max(leftAns,rightAns));
        
        return maxAns;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);

        TreeNode a = new TreeNode(2);
        TreeNode b = new TreeNode(3);
        root.left=a;
        root.right=b;
        TreeNode c = new TreeNode(4);
        TreeNode d = new TreeNode(5);
        a.left =c;
        a.right =d;
        TreeNode e = new TreeNode(6);
        TreeNode f = new TreeNode(7);
        b.left=e;
        b.right=f;

        System.out.println("Diameter : "+diameterOfBinaryTree(root));

    }
}
