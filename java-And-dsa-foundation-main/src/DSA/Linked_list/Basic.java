package DSA.Linked_list;

import java.util.LinkedList;

public class Basic {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(list);

        System.out.print("Add first : ");
        list.addFirst(5);
        System.out.println(list);

        System.out.print("Add Last : ");
        list.addLast(6);
        System.out.println(list);

        System.out.print("remove elem ");
        list.remove(3);
        System.out.println(list);

        System.out.print("Get First elem : ");
        System.out.println(list.getFirst());

        System.out.print("Get Last elem : ");
        System.out.println(list.getLast());

        System.out.print("Remove Last : ");
        list.removeLast();
        System.out.println(list);

        System.out.print("Remove First : ");
        list.removeFirst();
        System.out.println(list);

        System.out.println("Peek Elem : "+ list.peek());
    }
}
