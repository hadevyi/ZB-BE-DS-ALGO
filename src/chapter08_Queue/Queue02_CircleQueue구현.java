package chapter08_Queue;

import java.io.*;

public class Queue02_CircleQueue구현 {

    public static class CircularQueue {
        private static final int DEFAULT_SIZE = 10;
        private int[] arr;
        private int front, rear, size, capacity;

        // 기본 생성자 (기본 크기 DEFAULT_SIZE 사용)
        public CircularQueue() {
            this(DEFAULT_SIZE);
        }

        // 사용자 지정 크기 생성자
        public CircularQueue(int capacity) {
            this.capacity = capacity;
            arr = new int[capacity];
            front = 0;
            rear = -1;
            size = 0;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public boolean isFull() {
            return size == capacity;
        }

        public void enqueue(int value) {
            if (isFull()) {
                System.out.println("Circular Queue is full");
                return;
            }
            rear = (rear + 1) % capacity;
            arr[rear] = value;
            size++;
        }

        public int dequeue() {
            if (isEmpty()) {
                System.out.println("Circular Queue is empty");
                return -1;
            }
            int value = arr[front];
            front = (front + 1) % capacity;
            size--;
            return value;
        }

        public int peek() {
            return isEmpty() ? -1 : arr[front];
        }

        // printQueue 메소드 추가
        public void printQueue() {
            if (isEmpty()) {
                System.out.println("Circular Queue is empty");
                return;
            }
            StringBuffer sb = new StringBuffer();
            int i = front;
            // 큐가 순환 구조이므로 front부터 rear까지 순차적으로 출력
            for (int j = 0; j < size; j++) {
                sb.append(arr[i]).append(" ");
                i = (i + 1) % capacity; // 큐에서 순환하기 위해 나머지 연산 사용
            }
            System.out.println(sb.toString());
        }
    }

    public static void main(String[] args) {
        CircularQueue cQueue = new CircularQueue();

        cQueue.enqueue(1);
        cQueue.enqueue(2);
        cQueue.enqueue(3);
        cQueue.printQueue();  // 출력: 1 2 3

        System.out.println(cQueue.dequeue()); // 1
        cQueue.enqueue(4);
        cQueue.printQueue();  // 출력: 2 3 4

        System.out.println(cQueue.peek());    // 2
    }
}
