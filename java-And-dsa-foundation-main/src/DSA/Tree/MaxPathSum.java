package DSA.Tree;

public class MaxPathSum {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val){
            this.val =val;
        }
    }

    private static int helper(TreeNode root , int[] maxVal){
        if(root==null) return 0;

        int left = Math.max(0,helper(root.left,maxVal));
        int right=Math.max(0,helper(root.right,maxVal));
        maxVal[0] =Math.max(maxVal[0],left+right+root.val);

        return Math.max(left,right) + root.val;
    }

    public static int maxPathSum(TreeNode root){
        int[] maxVal =new int[1];
        maxVal[0] = Integer.MIN_VALUE;

        helper(root,maxVal);
        return maxVal[0];
    }
}
