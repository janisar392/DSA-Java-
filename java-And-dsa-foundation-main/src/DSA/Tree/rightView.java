package DSA.Tree;
import java.util.*;


public class rightView {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val){
            this.val =val;
        }
    }
    public static List<Integer> RightView(TreeNode root){
        List<Integer> ans = new ArrayList<>();

        helper(root,ans,0);
        return ans;
    }
    public static void helper(TreeNode root, List<Integer> ans,int level){
        if(root == null) return;

        if(level== ans.size()){
            ans.add(root.val);
        }
        helper(root.right,ans,level+1);
        helper(root.left,ans,level+1);
    }
}
