package DSA.ArrayList;

import java.util.ArrayList;

public class Revese_ArrayList {

    static void reverseList(ArrayList<Integer> list){
        int i =0 , j = list.size()-1 ;

        while (i<j){
            /*

            int temp = a;
            a= b;
            b = temp ;

            */
            Integer temp = Integer.valueOf(list.get(i));
            list.set(i, list.get(j));
            list.set(j , temp);

            i++;
            j--;

        }
    }

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(0);
        list.add(7);
        list.add(4);
        list.add(5);
        list.add(22);
        list.add(15);

        System.out.println("Orignal Array list : "+ list);

        reverseList(list);
        System.out.println("Reverse Array list : " + list );
    }
}
