package DataStructure.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.offer("Customer 1");
        queue.offer("Customer 2");
        queue.offer("Customer 3");

        System.out.println("Customer in queue=" + queue);

        if (!queue.isEmpty()) {
            String removedElement = queue.poll();
            System.out.println("Customer served=" + removedElement);
        }
        System.out.println("Customer queued after removal=" + queue);

        String frontElement = queue.peek();
        System.out.println("Front of the queue customer=" + frontElement);
        System.out.println("Customers in line after peek()=" + queue);


    }
}
