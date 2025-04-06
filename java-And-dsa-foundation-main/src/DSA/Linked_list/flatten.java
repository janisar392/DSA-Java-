package DSA.Linked_list;

public class flatten {
    public static class Node{
        int val;
        Node next;
        Node bottom;

        public Node(int val){
            this.val = val;
        }
    }
    public static Node merge(Node a ,Node b){
        if(a==null) return b;
        if(b==null) return a;
        Node ans;

        if(a.val < b.val){
            ans = a;
            ans.bottom = merge(a.bottom ,b);
        } else {
            ans = b;
            ans.bottom = merge(a , b.bottom);
        }
        ans.next =null;
        return ans;
    }

    public static Node Flatten(Node root){

        if(root==null || root.next==null) return root;
        root.next = Flatten(root.next);
        root = merge(root , root.next);

        return root;
    }
}
