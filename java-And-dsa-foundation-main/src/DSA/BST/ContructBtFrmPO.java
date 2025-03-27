package DSA.BST;

import DSA.Stack.linkedListImpl;

import java.util.Stack;

public class ContructBtFrmPO {
    public static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
        }
    }

    public static Node insertIntoBt(Node root , int val){

        if(root==null) root = new Node(val);

        if(root.data > val){ // go left
            if(root.left==null) root.left = new Node(val);
            else{
                insertIntoBt(root.left,val);
            }
        }
        else{ // root.data < val  go right
            if(root.right==null) root.right= new Node(val);
            else{
                insertIntoBt(root.right,val);
            }
        }
        return root;
    }

    public static Node insertFromPreOrder(int[] preorder){

        Node root = new Node(preorder[0]);

        for(int i=1;i<preorder.length;i++){
            root = insertIntoBt(root,preorder[i]);
        }
        return root;
    }
}
