package LeetCode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class BurningTree {
    public static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val){
            this.val = val;
        }
    }

    public static Node getNode(Node root,int start){
        if(root==null) return null;
        if(root.val==start) return root;

        Node left = getNode(root.left,start);
        Node right= getNode(root.right,start);

        if(left==null) return right;
        return left;
    }

    public static void preorder(Node root, Map<Node,Node> p){
        if(root==null) return;
        if(root.left!=null) p.put(root.left,root);
        if(root.right!=null) p.put(root.right,root);

        preorder(root.left,p);
        preorder(root.right,p);

    }
    public static int amountOfTime(Node root, int start){

        Node node = getNode(root,start);

        Map<Node,Node> p = new HashMap<>();
        preorder(root,p);

        //bfs
        Queue<Node> q = new LinkedList<>();
        q.add(node);

        Map<Node,Integer> v = new HashMap<>();
        v.put(node,0);

        while(q.size()>0){
            Node temp =q.remove();
            int level = v.get(temp);

            //check left subTree
            if(temp.left != null && !v.containsKey(temp.left)){
                q.add(temp.left);
                v.put(temp.left,level+1);
            }
            //check right subTree
            if(temp.right != null && !v.containsKey(temp.right)){
                q.add(temp.right);
                v.put(temp.right,level+1);
            }
            //check parent
            if(p.containsKey(temp) && !v.containsKey(p.get(temp))){
                q.add(p.get(temp));
                v.put(p.get(temp),level+1);
            }
            q.remove();
        }
        int max = -1;
        for(int level : v.values()){
            max = Math.max(max,level);
        }
        return max;
    }
}
