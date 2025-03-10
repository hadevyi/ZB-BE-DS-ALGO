package chapter09_Queue_Problem_Solving;

import java.io.*;
import java.util.*;

public class Queue01_문제풀이01 {

    public static class QueueWithTwoStacks {
        private Stack<Integer> stack1;
        private Stack<Integer> stack2;

        public QueueWithTwoStacks() {
            stack1 = new Stack<>();
            stack2 = new Stack<>();
        }

        public void enqueue(int value) {
            stack1.push(value);
        }

        public int dequeue() {
            if (stack2.isEmpty()) {
                if (stack1.isEmpty()) {
                    System.out.println("큐가 비어있습니다.");
                    return -1;
                }
                while (!stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }
            }
            return stack2.pop();
        }

        public int peek() {
            if (stack2.isEmpty()) {
                if (stack1.isEmpty()) {
                    System.out.println("큐가 비어있습니다.");
                    return -1;
                }
                while (!stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }
            }
            return stack2.peek();
        }

        public boolean isEmpty() {
            return stack1.isEmpty() && stack2.isEmpty();
        }
    }

    public static void main(String[] args) {
        QueueWithTwoStacks queue = new QueueWithTwoStacks();

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
