package GreaksForGreaks;

import java.util.ArrayList;

public class findAllPath {
    public static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data =data;
        }
    }

    public static void findPaths(Node root, ArrayList<Integer> currPath ,ArrayList<ArrayList<Integer>> ans){
        if(root==null) return;

        currPath.add(root.data);

        if(root.left == null && root.right ==null){
            ans.add(new ArrayList<>(currPath));
        }

        findPaths(root.left,currPath,ans);
        findPaths(root.right,currPath,ans);

        currPath.remove(currPath.size()-1);  //backtrack
    }

    public static ArrayList<ArrayList<Integer>> Paths(Node root){
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        if(root==null) return ans;

        ArrayList<Integer> currPath = new ArrayList<>();
        findPaths(root,currPath,ans);

        return ans;
    }

}
