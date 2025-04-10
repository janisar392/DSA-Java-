package DSA.Stack;

import java.util.Stack;

class StockSpanner {

    Stack<int[]> stack;

    public StockSpanner() {
        stack = new Stack<>();
    }

    public int next(int price) {
       int span =1 ;

       while (!stack.isEmpty() && stack.peek()[0] < price ){
           span += stack.pop()[1];
       }
       stack.push(new int[]{span , price});

       return span;
    }
}

