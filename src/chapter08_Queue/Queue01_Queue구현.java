package chapter08_Queue;

import java.io.*;

public class Queue01_Queue구현 {

    public static class Queue {
        private static final int DEFAULT_SIZE = 10;
        private int[] arr;
        private int front, rear, size;

        // 기본 생성자 (기본 크기 DEFAULT_SIZE 사용)
        public Queue() {
            this(DEFAULT_SIZE);
        }

        // 사용자 지정 크기 생성자
        public Queue(int capacity) {
            arr = new int[capacity];
            front = 0;
            rear = -1;
            size = 0;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public boolean isFull() {
            return size == arr.length;
        }

        public void enqueue(int value) {
            if (isFull()) {
                System.out.println("큐가 가득 찼습니다.");
                return;
            }
            arr[++rear] = value;
            size++;
        }

        public int dequeue() {
            if (isEmpty()) {
                System.out.println("큐가 비었습니다.");
                return -1;
            }
            int value = arr[front];
            front++;
            size--;
            return value;
        }

        public int peek() {
            return isEmpty() ? -1 : arr[front];
        }

        public void printQueue() {
            StringBuffer sb = new StringBuffer();
            for (int i = front;i <= rear;i++)
                sb.append(arr[i]).append(" ");
            System.out.println(sb.toString());
        }
    }

    public static void main(String[] args) throws IOException {
        Queue queue = new Queue();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.printQueue();

        System.out.println(queue.dequeue()); // 1
        System.out.println(queue.peek());    // 2
    }
}
