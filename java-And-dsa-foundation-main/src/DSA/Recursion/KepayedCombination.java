package DSA.Recursion;

public class KepayedCombination {

    static void combination(String dig , String[] kp ,String result){  // "253"
        if (dig.length()== 0 ){
            System.out.print(result + " ");
            return;
        }

        int currNum = dig.charAt(0) - '0'; // 2
        String currChoices = kp[currNum]; // "abc"
        for (int i = 0 ; i <  currChoices.length();i++){
            combination(dig.substring(1) ,kp ,result + currChoices.charAt(i));

        }
    }

    public static void main(String[] args) {
        String dig = "23" ;
        String[] kp = {"" ,"" ,"abc" ,"def" ,"ghi" ,"jkl" ,"mno" ,"pqrs" ,"tuv" ,"wxyz"};
        combination(dig ,kp ,"");


    }
}
