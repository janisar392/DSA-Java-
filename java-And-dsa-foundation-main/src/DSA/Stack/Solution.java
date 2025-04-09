package DSA.Stack;

import java.util.*;

class Solution {
    // Function to convert an infix expression to a postfix expression.
    public static String infixToPostfix(String str) {
        Stack<String> val = new Stack<>();
        Stack<Character> op = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                val.push(ch + "");
            }
            else if (ch == '(') {
                op.push(ch);
            }
            else if (ch == ')') {
                while (!op.isEmpty() && op.peek() != '(') {
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o = op.pop();
                    val.push(v1 + v2 + o);
                }
                op.pop(); // Remove '('
            }
            else { // Operator case
                while (!op.isEmpty() && op.peek() != '(' && precedence(op.peek()) >= precedence(ch)) {
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o = op.pop();
                    val.push(v1 + v2 + o);
                }
                op.push(ch);
            }
        }


        while (!op.isEmpty()) {
            String v2 = val.pop();
            String v1 = val.pop();
            char o = op.pop();
            val.push(v1 + v2 + o);
        }

        return val.pop();
    }


    private static int precedence(char ch) {
        if (ch == '+' || ch == '-') return 1;
        if (ch == '*' || ch == '/') return 2;
        if (ch == '^') return 3;
        return 0;
    }

    public static void main(String[] args) {
        String infix = "h^m^q^(7-4)";

        System.out.println(infixToPostfix(infix));
    }
}


