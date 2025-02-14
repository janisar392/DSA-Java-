package DSA.Linked_list;

public class basics {


    public static int length(Node head){
        int count =0;
        while(head!=null){
            count++;
            head = head.next;
        }
        return count;
    }
    // by recurtion
    public static void displayr(Node head){
        if(head == null)
            return;
        System.out.print(head.data+" ");
        display(head.next);
    }

    public static void display(Node head){
        while(head!=null){
            System.out.print(head.data+" ");
            head = head.next;
        }

    }
    public static class Node{
        int data;  // value
        Node next; // address of next node
        Node(int data){
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(5);
     //   System.out.println(x.next);  // null
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(19);
        // 5 3 9 8 16
        a.next = b ;   // 5-> 3 9 8 16
        b.next = c ;   // 5-> 3-> 9 8 16
        c.next = d ;   // 5-> 3-> 9-> 8 16
        d.next = e ;   // 5-> 3-> 9-> 8-> 16

//        System.out.println(a.data);
//        System.out.println(a.next.data);
//        System.out.println(a.next.next.data);
//        System.out.println(a.next.next.next.data);
//        System.out.println(a.next.next.next.next.data);

        // we can use for loop when we know how many exactly element
        Node temp = a;
//        for (int i =1 ; i<= 5 ; i++){
//            System.out.print(temp.data + " ");
//            temp = temp.next;
//        }
        // when we have not idea of how many exactly element
//        while(temp!= null){    // printing the list
//            System.out.print(temp.data+" ");
//            temp = temp.next;
//        }
        // calling by display function
        // if we create a display function then we can called a function again and again

    //    display(a);
     //   System.out.println();
    //    display(a);
     //   displayr(a);

        System.out.println(length(a));



    }
}
