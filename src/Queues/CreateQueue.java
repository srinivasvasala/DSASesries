package Queues;

import java.util.LinkedList;

public class CreateQueue {

    public static void main(String[] args) {
        java.util.Queue<Integer> queue = new LinkedList<>();

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        System.out.println(queue);
        queue.remove();
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.offer(6));
        System.out.println(queue);
    }
}
