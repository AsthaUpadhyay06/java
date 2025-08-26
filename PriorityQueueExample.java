import java.util.*;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(30);
        pq.add(10);
        pq.add(20);

        System.out.println("Priority Queue elements:");
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
} 