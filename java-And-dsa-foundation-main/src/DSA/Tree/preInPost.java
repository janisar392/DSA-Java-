package DSA.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class preInPost {

    public static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val){
            this.val = val;
        }
    }

    public static void preOrder(Node root){

        if(root==null) return;

        System.out.print(root.val+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void inOrder(Node root){

        if(root==null) return;

        preOrder(root.left);
        System.out.print(root.val+" ");
        preOrder(root.right);
    }

    public static void postOrder(Node root){

        if(root==null) return;

        preOrder(root.left);
        preOrder(root.right);
        System.out.print(root.val+" ");
    }
    public static void nthLevel(Node root,int n){
        if(root==null) return;
        if(n==1) System.out.println(root.val+" ");
        nthLevel(root.left,n-1);
        nthLevel(root.right,n-1);
    }

    public  static void bfs(Node root){   //Iterative
        Queue<Node> q = new LinkedList<>();
        if(root!=null) q.add(root);
        while(q.size()>0){
            Node temp = q.peek();
            if(temp.left!=null) q.add(temp.left);
            if(temp.right!=null) q.add(temp.right);
            System.out.print(temp.val+" ");
            q.remove();
        }
    }
    public static void main(String[] args) {

        Node root = new Node(1);

        Node a = new Node(2);
        Node b = new Node(3);
        root.left=a;
        root.right=b;
        Node c = new Node(4);
        Node d = new Node(5);
        a.left =c;
        a.right =d;
        Node e = new Node(6);
        Node f = new Node(7);
        b.left=e;
        b.right=f;

        System.out.println("Preorder :");
        preOrder(root);
        System.out.println();
        System.out.println("In-order :");
        inOrder(root);
        System.out.println();
        System.out.println("Post-order :");
        postOrder(root);

        System.out.println();
        nthLevel(root,2);

        bfs(root);

    }
}
