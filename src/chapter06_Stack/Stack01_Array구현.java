package chapter06_Stack;

public class Stack01_Array구현 {

    public static class Stack {
        private static final int DEFAULT_SIZE = 10; // 기본 크기
        private int[] stack;                        // 스택 배열
        private int top;                            // 최상위 원소 인덱스
        private int size;                           // 스택 크기

        public Stack() {
            this(DEFAULT_SIZE);
        }

        public Stack(int size) {
            this.size = size;
            stack = new int[size];
            top = -1; // 스택 초기 상태 (비어 있음)
        }

        public void push(int value) {
            if (isFull()) {
                System.out.println("스택이 가득 찼습니다!");
                return;
            }
            stack[++top] = value;
        }

        public int pop() {
            if (isEmpty()) {
                System.out.println("스택이 비어 있습니다!");
                return -1;
            }
            return stack[top--];
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("스택이 비어 있습니다!");
                return -1;
            }
            return stack[top];
        }

        public boolean isEmpty() {
            return top == -1;
        }

        public boolean isFull() {
            return top == size - 1;
        }

        public void printStack() {
            if (isEmpty()) {
                System.out.println("스택이 비어 있습니다!");
                return;
            }
            System.out.print("Stack: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack(); // 기본 크기 (10)

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.printStack(); // 출력: Stack: 1 2 3
        System.out.println(stack.peek());
    }
}
