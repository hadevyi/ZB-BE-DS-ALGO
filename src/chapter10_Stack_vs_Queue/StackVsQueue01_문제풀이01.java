package chapter10_Stack_vs_Queue;

import java.io.*;
import java.util.*;

public class StackVsQueue01_문제풀이01 {
    public static void sortStack(Stack<Integer> stack) {
        Stack<Integer> sortedStack = new Stack<>();

        while (!stack.isEmpty()) {
            int current = stack.pop();

            // sortedStack의 top이 current보다 크면 다시 stack으로 이동
            while (!sortedStack.isEmpty() && sortedStack.peek() > current) {
                stack.push(sortedStack.pop());
            }

            // 올바른 위치에 current 삽입
            sortedStack.push(current);
        }

        // 정렬된 결과를 다시 stack으로 옮김
        while (!sortedStack.isEmpty()) {
            stack.push(sortedStack.pop());
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputData = br.readLine().split(" ");

        Stack<Integer> stack = new Stack<>();
        for (String data : inputData) {
            stack.push(Integer.parseInt(data));
        }

        sortStack(stack);

        StringBuffer sb = new StringBuffer();
        while (!stack.isEmpty()) {
            sb.append(stack.pop()).append(" ");
        }
        System.out.println(sb.toString());
    }
}
