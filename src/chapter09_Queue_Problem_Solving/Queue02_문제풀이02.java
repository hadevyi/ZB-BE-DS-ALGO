package chapter09_Queue_Problem_Solving;

import java.io.*;
import java.util.*;

public class Queue02_문제풀이02 {
    
    public static class QueueWithLinkedList {
        private LinkedList<Integer> list;

        public QueueWithLinkedList() {
            list = new LinkedList<>();
        }

        public void enqueue(int value) {
            list.addLast(value); // 큐의 끝에 추가
        }

        public int dequeue() {
            if (list.isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return list.removeFirst(); // 큐의 앞에서 제거
        }

        public int peek() {
            if (list.isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return list.getFirst(); // 큐의 앞에 있는 요소 반환
        }

        public boolean isEmpty() {
            return list.isEmpty();
        }
    }

    public static void main(String[] args) {
        QueueWithLinkedList queue = new QueueWithLinkedList();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println(queue.dequeue()); // 1
        System.out.println(queue.peek());    // 2
        queue.enqueue(4);
        System.out.println(queue.dequeue()); // 2
        System.out.println(queue.dequeue()); // 3
        System.out.println(queue.dequeue()); // 4
        System.out.println(queue.dequeue()); // Queue is empty -> -1
    }
}