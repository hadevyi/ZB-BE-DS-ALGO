package chapter07_Stack_Problem_Solving;

import java.io.*;
import java.util.*;

public class Stack01_문제풀이01 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        String inputData = br.readLine();

        Stack<Character> stack = new Stack<>();

        for (char ch : inputData.toCharArray()) {
            if ('0' <= ch && ch <= '9') {
                sb.append(ch);
            } else { // 연산자일때
                while (!stack.isEmpty() && precedence(stack.peek()) >= precedence(ch)) {
                    sb.append(stack.pop());
                }
                stack.push(ch);
            }
        }
        while (!stack.isEmpty()) sb.append(stack.pop());
        System.out.println(sb.toString());
    }

    private static int precedence(char ch) {
        if (ch == '+' || ch == '-') return 0;
        if (ch == '*' || ch == '/') return 1;
        return -1;
    }
}
