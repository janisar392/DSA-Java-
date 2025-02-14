package DSA.Recursion;

import java.util.ArrayList;

public class ReturnSSQ {

    static ArrayList<String> getSSQ(String s){
        ArrayList<String> ans = new ArrayList<>();
        // Base Case
        if (s.length() ==0){
            ans.add(" ");
            return ans ;
        }
        // Small Work
        char curr = s.charAt(0);
        ArrayList<String> smallAns = getSSQ(s.substring(1));


        // Self Work
        for (String ss : smallAns){
            ans.add(ss) ;
            ans.add(curr+ss);
        }
        return ans ;
    }

    public static void main(String[] args) {
          ArrayList<String> ans = getSSQ("abc");
          for (String ss : ans ){
              System.out.println(ss);
          }
    }
}
