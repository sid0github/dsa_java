package collectionFramework;

import java.util.Stack;

public class stkList {
    static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
//        stk.add(1);
//        stk.add(6);
//        stk.add(4);
//        stk.add(7);
//        System.out.println(stk);
        //stack class specific methods!!
        stk.push(0);
        stk.push(2);
        System.out.println(stk);
        System.out.println(stk.search(2));
        System.out.println(stk.pop());
        stk.push(4);
        stk.push(6);
        System.out.println(stk);
        System.out.println(stk.peek());
        System.out.println(stk.search(4));
        System.out.println(stk.isEmpty());

    }
}
