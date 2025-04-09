package DSA.Stack;

import java.util.Stack;

public class InfixToPrefix {
    public static int precedence(char ch){
        if(ch=='+' || ch=='-') return 1;
        if(ch=='*' || ch=='/') return 2;
        if(ch=='^') return 3;
        return 0;
    }

    public static String InToPre(String str){

        Stack<String> val = new Stack<>();
        Stack<Character> op= new Stack<>();

        for(int i =0 ; i<str.length() ; i++){
            char ch = str.charAt(i);

            if(Character.isLetterOrDigit(ch)){
                val.push(ch+"");
            } else if (ch=='(') {
                op.push(ch);
            } else if (ch==')') {
                while (!op.isEmpty() && op.peek() != '('){
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o = op.pop();
                    String t = o+v1+v2;
                    val.push(t);
                }
                op.pop();  //remove '('
            }
            else{
                while(!op.isEmpty() && op.peek() != '(' && precedence(op.peek()) >= precedence(ch)){
                      String v2 = val.pop();
                      String v1 = val.pop();
                      char o = op.pop();
                      String t = o+v1+v2;
                      val.push(t);
                }
                op.push(ch);
            }
        }
        while (!op.isEmpty()){
            String v2 = val.pop();
            String v1 = val.pop();
            char o = op.pop();
            String t = o+v1+v2;
            val.push(t);
        }
        return val.pop();
    }

    public static void main(String[] args) {
        String infix = "9-(5+3)*4/6";

        System.out.println(InToPre(infix));
    }
}
