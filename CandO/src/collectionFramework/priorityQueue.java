package collectionFramework;

import java.util.PriorityQueue;
import java.util.Queue;

public class priorityQueue {
    static void main() {
        Queue<Integer> pq = new PriorityQueue<>();
        pq.offer(30);
        pq.offer(20);
        pq.offer(10);
        System.out.println(pq.poll());
    }
}
