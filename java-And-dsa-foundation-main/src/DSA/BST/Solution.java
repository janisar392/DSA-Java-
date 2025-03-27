package DSA.BST;

class Solution {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val){
            this.val =val;
        }
    }

    public static void delete(TreeNode root , int target){
        if(root==null) return;
        if(root.val>target){ // go left
            if(root.left==null) return ;
            if(root.left.val==target){
                TreeNode l = root.left;  // l is that node i wish to delete
                if(l.left==null && l.right==null) root.left=null;   // 0 child
                else if(l.left==null || l.right==null){     //1 child
                    if(l.left!=null) root.left = l.left;
                    else root.left = l.right;
                }
                else{ //2 children
                    TreeNode curr = l;
                    TreeNode pred = curr.left;
                    while(pred.right!=null) pred = pred.right;
                    delete(root,pred.val);
                    pred.left = curr.left;
                    pred.right = curr.right;
                    root.left =pred;
                }
            }
            else delete(root.left,target);
        }

        else{      // root.val < target  , go right
            if(root.right==null) return ;
            if(root.right.val==target){
                TreeNode r = root.right;  // l is that node i wish to delete
                if(r.left==null && r.right==null) root.right =null;   // 0 child
                else if(r.left==null || r.right==null){     //1 child
                    if(r.left!=null) root.right = r.left;
                    else root.right = r.right;
                }
                else{ //2 children
                    TreeNode curr = r;
                    TreeNode pred = curr.left;
                    while(pred.right!=null) pred = pred.right;
                    delete(root,pred.val);
                    pred.left = curr.left;
                    pred.right = curr.right;
                    root.right =pred;
                }
            }
            else delete(root.right,target);
        }
    }

    public TreeNode deleteNode(TreeNode root, int target) {
        TreeNode temp = new TreeNode(0);
        temp.left = root;

        delete(temp,target);
        return temp.left;
    }
    public static void main(String[] args) {


        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(7);

        int target = 3;

      //  delete(root,target);
        printTree(root);
    }



    public static void printTree(TreeNode root) {
        if (root == null) return;

        printTree(root.left);
        System.out.print(root.val + " ");
        printTree(root.right);
    }

}