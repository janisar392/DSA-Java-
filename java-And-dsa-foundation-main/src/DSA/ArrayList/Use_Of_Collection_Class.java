package DSA.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Use_Of_Collection_Class {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(7);
        list.add(4);
        list.add(5);
        list.add(22);
        list.add(15);

        System.out.println("orignal ArrayList :"+ list);

        Collections.reverse(list);

        System.out.println("Reverse ArrayList : "+ list);

        Collections.sort(list);
        System.out.println("Ascending order " + list);

        Collections.sort(list , Collections.reverseOrder());
        System.out.println("Decending order " + list);


        ArrayList<String> l1 = new ArrayList<>();
        l1.add("Welcome");
        l1.add("To");
        l1.add("Physics");
        l1.add("Wallah");
        System.out.println("Orignal : "+ l1);
        Collections.sort(l1);
        System.out.println("Sorted" + l1);
        Collections.sort(l1,Collections.reverseOrder());
        System.out.println("Soreted Reverse "+ l1);
    }
}
