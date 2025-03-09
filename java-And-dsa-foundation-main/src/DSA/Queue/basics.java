package DSA.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class basics {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        System.out.println(q);
        q.remove();
        System.out.println(q);
        System.out.println(q.element());

    }
}
