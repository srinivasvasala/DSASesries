package Queues;

import java.util.Deque;
import java.util.LinkedList;

public class CeateDequeue {

    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addLast(3);
        deque.add(4);
        deque.addLast(5);
        System.out.println(deque);
        deque.removeFirst();
        System.out.println(deque);
        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());
        System.out.println(deque);
        System.out.println(deque.pollFirst());
        System.out.println(deque);
        System.out.println(deque.pollLast());
        System.out.println(deque);
        System.out.println(deque.peekFirst());
    }
}
