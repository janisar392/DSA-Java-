package DSA.ArrayList;

import java.util.ArrayList;

public class Array_list {
    public static void main(String[] args) {
        // wrapper classess


//        Integer i = Integer.valueOf(4);
//        System.out.println(i);
//        Float f = Float.valueOf(4.5f);
//        System.out.println(f);

        ArrayList<Integer> l1 = new ArrayList<>();

        // add new element
        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(8);

        // get an element at index i
        System.out.println(l1.get(1)); // 6

        //print with for loop
        for (int i = 0 ; i < l1.size() ; i++){
            System.out.println(l1.get(i));  // 5,6,7,8
        }

        // printing with arrayList  directly
        System.out.println(l1); //[5,6,7,8]

        //adding element at some index i
        l1.add(1,100);
        System.out.println(l1);

        //modifying element at index i

        l1.set(1,10);
        System.out.println(l1);

        //removing an element at index i
        l1.remove(1);
        System.out.println(l1);

        //removing element e

        l1.remove(Integer.valueOf(7));
        System.out.println(l1);

        //checking if an element exists

        boolean ans = l1.contains(Integer.valueOf(6));
        System.out.println(ans);

        boolean answ = l1.contains(Integer.valueOf(17));
        System.out.println(answ);

     // if you don't specify class , you can put anything
        ArrayList l = new ArrayList<>();
        l.add("janisar");
        l.add(1);
        l.add(true);

        System.out.println(l);



    }
}
