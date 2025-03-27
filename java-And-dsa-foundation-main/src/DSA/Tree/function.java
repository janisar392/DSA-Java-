package DSA.Tree;

import java.util.logging.SocketHandler;

public class function {

    public static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val){
            this.val=val;
        }
    }
    public static int height(Node root){
        if(root==null) return 0;
        if(root.right==null && root.left== null) return 0;
        return 1+ Math.max(height(root.right),height(root.right));
    }
    public static int max(Node root){
        if(root==null) return Integer.MIN_VALUE;
        return Math.max(root.val, Math.max(max(root.right),max(root.left)));
    }
    public static int min(Node root){
        if(root==null) return Integer.MAX_VALUE;
        return Math.min(root.val, Math.min(min(root.right),min(root.left)));
    }

    public static int sum(Node root){
        if(root==null) return 0;
        return root.val + sum(root.right) +sum(root.left);
    }

    public static int product(Node root){
        if(root==null) return 1;
        return root.val* product(root.right) * product(root.left);
    }

    public static int size(Node root){
        if(root==null) return 0;
        return 1+size(root.right) +size(root.left);
    }

    public static void main(String[] args) {

        Node root = new Node(1);

        Node a = new Node(2);
        Node b = new Node(3);
        root.left=a;
        root.right=b;

        Node c = new Node(4);
        Node d = new Node(-5);
        a.left=c;
        a.right=d;

        Node e = new Node(6);
        b.right=e;

        System.out.println("size : "+size(root));
        System.out.println("Sum : "+sum(root));
        System.out.println("product : "+product(root));
        System.out.println("Max node : "+ max(root)) ;
        System.out.println("Min Value : "+min(root));
        System.out.println("Height : "+ height(root));
    }
}
