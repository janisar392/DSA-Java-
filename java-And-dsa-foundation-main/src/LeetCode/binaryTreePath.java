package LeetCode;

import java.util.*;

public class binaryTreePath {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val){
            this.val = val;
        }
    }
    public static void helper(TreeNode root, List<String> ans ,String s){
        if(root==null) return;
        if(root.left==null && root.right==null){
            s += root.val;
            ans.add(s);
            return;
        }
        helper(root.left,ans,s+root.val+"->");
        helper(root.right,ans,s+root.val+"->");
    }

    public static List<String> BinaryTreePath(TreeNode root){

        List<String> ans = new ArrayList<>();
        helper(root,ans,"");
        return ans;
    }
}
