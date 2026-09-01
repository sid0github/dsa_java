package collectionFramework;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class arrayDeque {
    static void main() {
        Deque<Integer> q = new ArrayDeque<>();
        q.offer(1);
        q.offerFirst(0);
        q.offerLast(2);
        System.out.println(q);
        q.pollLast();
        
    }
}
