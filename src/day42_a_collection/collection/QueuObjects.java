package day42_a_collection.collection;

import java.util.PriorityQueue;

public class QueuObjects {
    public static void main(String[] args) {
        /*
            PriorityQueue
                - random order
                - allows duplicate
                - NOT allow null
                - FIFO: first in (stored order) first out  (new sorted randomly elements)

                .add(elem)      ----> offer();
                .remove(elem)   ----> poll();
                .get()          ----> peek();
         */
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(2);
        queue.add(10);
        queue.add(8);
        queue.add(1);
        queue.add(2);

        System.out.println(queue);

        queue.offer(30);

        System.out.println(queue);
        queue.offer(1);
        System.out.println(queue);

        System.out.println();
        queue.poll(); // FIFO
        System.out.println(queue);   // [1, 2, 8, 10, 2, 30]

        queue.poll(); // FIFO
        System.out.println(queue);  //  [2, 2, 8, 10, 30]

        queue.poll(); // FIFO
        System.out.println(queue);  //  [2, 10, 8, 30]

        System.out.println("*********************************");
        PriorityQueue<Integer> deQueue = new PriorityQueue<>();
        deQueue.add(2);
        deQueue.add(10);
        deQueue.add(8);
        deQueue.add(1);
        deQueue.add(2);

        System.out.println(deQueue);

        deQueue.offer(30);

        System.out.println(deQueue);
        deQueue.offer(1);
        System.out.println(deQueue);

        System.out.println();
        deQueue.poll(); // FIFO
        System.out.println(deQueue);

        deQueue.poll(); // FIFO
        System.out.println(deQueue);

        deQueue.poll(); // FIFO
        System.out.println(deQueue);

    }
}
