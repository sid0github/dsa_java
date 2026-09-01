package collectionFramework;

import java.util.LinkedList;

public class linkList {
    static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);

        //addFirst and addLast
        list.addFirst(11);
        list.addLast(12);
        System.out.println(list);
        System.out.println(list.peek());
        System.out.println(list.poll());
        list.offer(14);
        System.out.println(list);

    }
}
